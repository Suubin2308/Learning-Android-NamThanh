//enum class LoginStatus(val message : String) {
//    LOGIN_EMPTY("Username hoặc password trống"),
//    LOGIN_SUCCESS("Đăng nhập thành công"),
//    LOGIN_ERROR("Đăng nhập thất bại")
//}
//fun login(username: String?, password: String?, onResult: (LoginStatus)->Unit) {
//    username?.let {user ->
//        password?.let{pass ->
//            val status = when {
//                user.isEmpty() || password.isEmpty() -> LoginStatus.LOGIN_EMPTY
//                user == "admin" && password == "123" -> LoginStatus.LOGIN_SUCCESS
//                else -> LoginStatus.LOGIN_ERROR
//            }
//            onResult(status)
//            return
//        }
//    }
//    onResult(LoginStatus.LOGIN_EMPTY)
//}
//fun main(){
//    login("admin", "123"){status ->
//        println(status.message)
//    }
//}