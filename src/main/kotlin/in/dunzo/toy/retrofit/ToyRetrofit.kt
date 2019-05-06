package `in`.dunzo.toy.retrofit

import java.lang.reflect.Proxy
import java.net.URL

class ToyRetrofit {
    fun <T> create(apiClass: Class<T>): T {
        val classLoader = ToyRetrofit::class.java.classLoader
        val interfaces = arrayOf(apiClass)

        return Proxy.newProxyInstance(classLoader, interfaces) { proxy, method, args ->
            val getAnnotation = method.getAnnotation(GET::class.java)
            URL(getAnnotation.value).readText()
        } as T
    }
}
