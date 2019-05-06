package `in`.dunzo.toy.retrofit

interface GitApi {
    @GET("https://api.github.com/users/ragunathjawahar")
    fun getUser(): String

    @GET("https://api.github.com/users/ragunathjawahar/followers")
    fun getFollowers(): String
}
