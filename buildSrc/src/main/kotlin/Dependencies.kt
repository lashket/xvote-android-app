const val kotlinVersion = "1.3.70"

object BuildPlugins {

    object Versions {
        const val buildToolsVersion = "3.6.0"
    }

    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.buildToolsVersion}"
    const val kotlinSerialization = "org.jetbrains.kotlin:kotlin-serialization:$kotlinVersion"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    const val androidApplication = "com.android.application"
    const val androidLibrary = "com.android.library"
    const val kotlinAndroid = "kotlin-android"
    const val kotlinKapt = "kotlin-kapt"
    const val fabric = "io.fabric"
    const val kotlinAndroidExtensions = "kotlin-android-extensions"
    const val kotlinSerializationPlugin = "kotlinx-serialization"
    const val navigationSafeArgs = "androidx.navigation.safeargs"
    const val googleServices = "com.google.gms.google-services"
    const val ANDROID_DYNAMIC_FEATURE = "com.android.dynamic-feature"

}

object AndroidSdk {
    const val min = 23
    const val compile = 29
    const val target = compile
}

object Libraries {
    private object Versions {
        const val jetpack = "1.0.0-beta01"
        const val constraintLayout = "1.1.3"
        const val ktx = "1.2.0-alpha04"
        const val appcompat = "1.1.0"
        const val material = "1.1.0-alpha10"
        const val navigation = "2.2.0-alpha02"
        const val retrofit = "2.6.1"
        const val okhttp = "4.1.0"
        const val gsonConverter = "2.4.0"
        const val gson = "2.8.5"
        const val coroutinesAdapter = "0.9.2"
        const val loggingInterceptor = "4.1.0"
        const val lifecycle = "2.2.0-rc03"
        const val dagger = "2.27"
        const val coroutines = "1.3.0"
        const val exoplayer = "2.8.2"
        const val exoplayerHls = "2.9.0"
        const val okhttpProfiler = "1.0.5"
        const val picasso = "2.71828"
        const val roundedImageView = "2.3.0"
        const val leanback = "1.0.0"
        const val zxingCore = "3.3.0"
        const val zxingCoreEmbedded = "3.2.0"
        const val firebase = "20.0.0"
        const val tvRecyclerView = "1.2.3"
        const val colorRatingBar = "1.0.1"
        const val discretteScrollView = "1.4.9"
        const val picassoTransormation = "2.2.1"
        const val circleImageView = "3.0.1"
        const val shimmer = "0.4.0"
        const val kotlinSerializationRuntime = "0.11.0"
        const val lottieVersion = "3.1.0"
        const val downloaderVersion = "0.6.0"
        const val adsVersion = "18.2.0"
        const val analyticsVersion = "17.2.1"
        const val crashlyticVersion = "2.10.1"
        const val mapsVersion = "11.8.0"
        const val fragNavVersion = "3.2.0"
        const val chipsLayoutManagerVersion = "0.3.7@aar"
        const val pageIndicatorVersion = "1.0.3"
        const val mapboxVersion = "8.6.1"
        const val calendarVesrions = "0.3.1"
        const val materialSpinnerVersion = "2.0.0"
        const val timberVersion = "4.7.1"
        const val linkBuilderVersion = "2.0.5"
        const val pinViewVersion = "v1.1.2-ktx"
        const val componentsManagerVersion = "2.1.0"
        const val qrReaderVersion = "2.1.2"
        const val visionVersion = "19.0.0"
        const val annotationDaggerVersion = "1.0"
        const val glideVersion = "4.11.0"
        const val cropViewVersion = "2.8.+"
        const val locationVersion = "17.0.0"
        const val mapBoxServicesVersion = "5.2.1"
        const val mapBoxPlacesVersion = "0.12.0"
    }

    const val kotlinStdLib             = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion"
    const val appCompat                = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val constraintLayout         = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val ktxCore                  = "androidx.core:core-ktx:${Versions.ktx}"
    const val material                 = "com.google.android.material:material:${Versions.material}"
    const val navigationFragment       = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationUi             = "androidx.navigation:navigation-ui:${Versions.navigation}"
    const val navigationUiKtx          = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    const val retrofit                 = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val okHttp                   = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    const val gsonConverter            = "com.squareup.retrofit2:converter-gson:${Versions.gsonConverter}"
    const val gson                     = "com.google.code.gson:gson:${Versions.gson}"
    const val loggingInterceptor       = "com.squareup.okhttp3:logging-interceptor:${Versions.loggingInterceptor}"
    const val coroutinesAdapter        = "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Versions.coroutinesAdapter}"
    const val lifecycleExtensions      = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val lifecycleStreams         = "androidx.lifecycle:lifecycle-reactivestreams:${Versions.lifecycle}"
    const val lifecycleCommon          = "androidx.lifecycle:lifecycle-common-java8:${Versions.lifecycle}"
    const val lifecycleVMKtx           = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val dagger                   = "com.google.dagger:dagger:${Versions.dagger}"
    const val daggerAndroid            = "com.google.dagger:dagger-android:${Versions.dagger}"
    const val daggerAndroidSupport     = "com.google.dagger:dagger-android-support:${Versions.dagger}"
    const val daggerCompiler           = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    const val daggerAndroidProcessor   = "com.google.dagger:dagger-android-processor:${Versions.dagger}"
    const val coroutinesCore           = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val coroutinesAndroid        = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    const val exoPlayer                = "com.google.android.exoplayer:exoplayer:${Versions.exoplayer}"
    const val exoPlayerHls             = "com.google.android.exoplayer:exoplayer-hls:${Versions.exoplayerHls}"
    const val okHttpProfiler           = "com.itkacher.okhttpprofiler:okhttpprofiler:${Versions.okhttpProfiler}"
    const val picasso                  = "com.squareup.picasso:picasso:${Versions.picasso}"
    const val roundedImageView         = "com.makeramen:roundedimageview:${Versions.roundedImageView}"
    const val leanback                 = "androidx.leanback:leanback:${Versions.leanback}"
    const val zxingCore                = "com.google.zxing:core:${Versions.zxingCore}"
    const val zxingCoreEmbedded        = "com.journeyapps:zxing-android-embedded:${Versions.zxingCoreEmbedded}"
    const val firebaseMessaging        = "com.google.firebase:firebase-messaging:${Versions.firebase}"
    const val tvRecyclerView           = "com.henryblue.library:tvrecyclerview:${Versions.tvRecyclerView}"
    const val colorRatingBar           = "hyogeun.github.com.colorratingbar:ColorRatingBar:${Versions.colorRatingBar}"
    const val discretteScrollView      = "com.yarolegovich:discrete-scrollview:${Versions.discretteScrollView}"
    const val picassoTransformations   = "jp.wasabeef:picasso-transformations:${Versions.picassoTransormation}"
    const val circleImageView          = "de.hdodenhof:circleimageview:${Versions.circleImageView}"
    const val shimmer                  = "com.facebook.shimmer:shimmer:${Versions.shimmer}"
    const val kotlinSerializationRun   = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:${Versions.kotlinSerializationRuntime}"
    const val lottie                   = "com.airbnb.android:lottie:${Versions.lottieVersion}"
    const val downloader               = "com.mindorks.android:prdownloader:${Versions.downloaderVersion}"
    const val ads                      = "com.google.android.gms:play-services-ads:${Versions.adsVersion}"
    const val firebaseAnalytic         = "com.google.firebase:firebase-analytics:${Versions.analyticsVersion}"
    const val firebaseCrashlytic       = "com.crashlytics.sdk.android:crashlytics:${Versions.crashlyticVersion}"
    const val googleMaps               = "com.google.android.gms:play-services-maps:${Versions.mapsVersion}"
    const val fragNav                  = "com.ncapdevi:frag-nav:${Versions.fragNavVersion}"
    const val chipsLayoutManager       = "com.beloo.widget:ChipsLayoutManager:${Versions.chipsLayoutManagerVersion}"
    const val pageIndicatorView        = "com.romandanylyk:pageindicatorview:${Versions.pageIndicatorVersion}"
    const val mapbox                   = "com.mapbox.mapboxsdk:mapbox-android-sdk:${Versions.mapboxVersion}"
    const val calendarView             = "com.github.kizitonwose:CalendarView:${Versions.calendarVesrions}"
    const val materialSpinner          = "com.github.ganfra:material-spinner:${Versions.materialSpinnerVersion}"
    const val timber                   = "com.jakewharton.timber:timber:${Versions.timberVersion}"
    const val linkBuilder              = "com.klinkerapps:link_builder:${Versions.linkBuilderVersion}"
    const val pinView                  = "com.github.aabhasr1:OtpView:${Versions.pinViewVersion}"
    const val componentsManager        = "com.github.valeryponomarenko.componentsmanager:androidx:${Versions.componentsManagerVersion}"
    const val qrReader                 = "com.github.nisrulz:qreader:${Versions.qrReaderVersion}"
    const val googleVision             = "com.google.android.gms:play-services-vision:${Versions.visionVersion}"
    const val daggerTester             = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    const val annotationDagger         = "com.github.pengrad:jdk9-deps:${Versions.annotationDaggerVersion}"
    const val glide                    = "com.github.bumptech.glide:glide:${Versions.glideVersion}"
    const val glideCompiler          = "com.github.bumptech.glide:compiler:${Versions.glideVersion}"
    const val imageCrop              = "com.theartofdev.edmodo:android-image-cropper:${Versions.cropViewVersion}"
    const val location                 = "com.google.android.gms:play-services-location:${Versions.locationVersion}"
    const val mapBoxServices            = "com.mapbox.mapboxsdk:mapbox-sdk-services:${Versions.mapBoxServicesVersion}"
    const val mapBoxPlaces            = "com.mapbox.mapboxsdk:mapbox-android-plugin-places-v9:${Versions.mapBoxPlacesVersion}"
}

object SdkVersions {
    const val minorVersionCode = 1
    const val middleVersionCode = 0
    const val majorVersionCode = 0
    const val applicationPackageId = "org.xmart.elections"
}

object AndroidConfig {
    const val TEST_INSTRUMENTATION_RUNNER = "android.support.test.runner.AndroidJUnitRunner"
}

object TestLibraries {
    private object Versions {
        const val junit4 = "4.12"
        const val testRunner = "1.3.0-alpha02"
        const val espresso = "3.3.0-alpha02"
        const val mockitoVerrsion = "2.+"
    }
    const val junit4     = "junit:junit:${Versions.junit4}"
    const val testRunner = "androidx.test:runner:${Versions.testRunner}"
    const val espresso   = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val mockito    = "org.mockito:mockito-core:${Versions.mockitoVerrsion}"
}

object BuildType {
    const val RELEASE = "release"
    const val DEBUG = "debug"
}

object GradlePluginId {
    const val DETEKT = "io.gitlab.arturbosch.detekt"
    const val KTLINT_GRADLE = "org.jlleitschuh.gradle.ktlint"
    const val ANDROID_APPLICATION = "com.android.application"
    const val ANDROID_DYNAMIC_FEATURE = "com.android.dynamic-feature"
    const val ANDROID_LIBRARY = "com.android.library"
    const val KOTLIN_JVM = "org.jetbrains.kotlin.jvm"
    const val KOTLIN_ANDROID = "org.jetbrains.kotlin.android"
    const val KOTLIN_ANDROID_EXTENSIONS = "org.jetbrains.kotlin.android.extensions"
    const val GRADLE_VERSION_PLUGIN = "com.github.ben-manes.versions"
    const val SAFE_ARGS = "androidx.navigation.safeargs.kotlin"
}
