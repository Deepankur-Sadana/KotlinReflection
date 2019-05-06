package `in`.dunzo.toy.retrofit

fun main() {
    val gitApi = ToyRetrofit().create(GitApi::class.java)
    println(gitApi.getUser())
    println(gitApi.getFollowers())
}
