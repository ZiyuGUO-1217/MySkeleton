package com.kaku.ui.screens.second

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kaku.ui.theme.MySkeletonTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SecondActivity : ComponentActivity() {

    private val viewModel by viewModels<SecondViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MySkeletonTheme {
                val num by viewModel.num.collectAsState()
                val onAddClick = { viewModel.addNumber() }
                val onMinusClick = { viewModel.minusNumber() }

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box(modifier = Modifier.fillMaxSize()) {
                        Text(
                            text = this@SecondActivity.javaClass.simpleName,
                            modifier = Modifier.align(Alignment.TopCenter),
                            style = MaterialTheme.typography.headlineMedium
                        )

                        Column(
                            modifier = Modifier.align(Alignment.Center),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = num,
                                style = MaterialTheme.typography.headlineMedium
                            )
                            Spacer(modifier = Modifier.height(16.dp))
                            Button(onClick = onAddClick) {
                                Text(text = "ADD")
                            }
                            Spacer(modifier = Modifier.height(16.dp))
                            Button(onClick = onMinusClick) {
                                Text(text = "MINUS")
                            }
                        }
                    }
                }
            }
        }
    }
}
