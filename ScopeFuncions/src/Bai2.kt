//enum class inputNull(val message : String) {
//    USERNAME_EMPTY("Username rong"),
//}
//fun inputUserame(username : String?, onResult: (String) -> Unit){
//    username?.let{ user ->
//        onResult (user.length.toString())
//        }
//
//    onResult(inputNull.USERNAME_EMPTY.message)
//    return
//}
//fun main(){
//
//    inputUserame("") { status ->
//        println(status)
//    }
//}