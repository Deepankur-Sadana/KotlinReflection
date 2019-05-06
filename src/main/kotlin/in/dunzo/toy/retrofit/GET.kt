package `in`.dunzo.toy.retrofit

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION)
annotation class GET(
    val value: String
)
