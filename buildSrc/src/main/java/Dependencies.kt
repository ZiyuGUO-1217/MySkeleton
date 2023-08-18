object Versions {
    const val compose = "1.3.1"
    const val composeLifecycle = "2.6.0-beta01"
    const val composeAccompanist = "0.25.1"
    const val composeViewModel = "2.5.1"
    const val coroutines = "1.6.0"
    const val gson = "2.2.0"
    const val hilt = "2.47"
    const val hiltNavigation = "1.0.0"
    const val junit4 = "4.13.2"
    const val junit4Ext = "1.1.4"
    const val kotest = "5.3.0"
    const val mockk = "1.12.3"
    const val materialDesign = "1.3.1"
    const val materialDesign3 = "1.0.0-alpha15"
    const val okhttpLogging = "4.9.3"
    const val retrofit = "2.9.0"
    const val turbine = "0.8.0"
}

object Libs {
    // Compose
    const val composeLifecycle = "androidx.lifecycle:lifecycle-runtime-compose:${Versions.composeLifecycle}"
    const val compose = "androidx.compose.ui:ui:${Versions.compose}"
    const val composeCompiler = "androidx.compose.compiler:compiler:1.1.1"
    const val composeFoundation = "androidx.compose.foundation:foundation:${Versions.compose}"
    const val composePreview = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
    const val composeRuntime = "androidx.compose.runtime:runtime:${Versions.compose}"
    const val composeViewModel = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.composeViewModel}"
    const val composePermission = "com.google.accompanist:accompanist-permissions:${Versions.composeAccompanist}"

    const val materialDesign = "androidx.compose.material:material:${Versions.materialDesign}"
    const val materialDesign3 = "androidx.compose.material3:material3:${Versions.materialDesign3}"

    // Compose Debug
    const val composeDebugTool = "androidx.compose.ui:ui-tooling:${Versions.compose}"
    const val composeDebugTest = "androidx.compose.ui:ui-test-manifest:${Versions.compose}"

    // Coroutines
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"

    // Hilt
    const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltCompiler = "com.google.dagger:hilt-compiler:${Versions.hilt}"
    const val hiltNavigation = "androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigation}"

    // Network
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val gson = "com.squareup.retrofit2:converter-gson:${Versions.gson}"
    const val okhttpLogging = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttpLogging}"
}

object TestLibs {
    // Compose Ui Test
    const val composeUiTest = "androidx.compose.ui:ui-test-junit4:${Versions.compose}"

    // Unit Test
    const val coroutineTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
    const val coroutineTestJvm = "org.jetbrains.kotlinx:kotlinx-coroutines-test-jvm:${Versions.coroutines}"
    const val junit4 = "junit:junit:${Versions.junit4}"
    const val junit4Ext = "androidx.test.ext:junit:${Versions.junit4Ext}"
    const val kotest = "io.kotest:kotest-assertions-core:${Versions.kotest}"
    const val mockk = "io.mockk:mockk:${Versions.mockk}"
    const val turbine = "app.cash.turbine:turbine:${Versions.turbine}"
}
