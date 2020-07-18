import kotlin.reflect.full.memberProperties

private const val FEATURE_PREFIX = ":feature_"

@Suppress("unused")
object ModuleDependency {

    const val APP = ":app"
    const val LIBRARY_BASE = ":library_base"
    const val FEATURE_AUTHORIZATION = ":feature_authorization"
    const val FEATURE_OFFERS = ":feature_offers"
    const val FEATURE_PROFILE = ":feature_profile"

    fun getAllModules() = ModuleDependency::class.memberProperties
        .filter { it.isConst }
        .map { it.getter.call().toString() }
        .toSet()

    fun getDynamicFeatureModules() = getAllModules()
        .filter { it.contains("authorization") }
        .toSet()

//    fun getDynamicFeatureModules() = getAllModules()
//        .filter { it.startsWith(FEATURE_PREFIX) }
//        .toSet()
}
