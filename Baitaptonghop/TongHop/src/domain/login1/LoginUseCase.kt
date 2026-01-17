package domain.login1

object LoginUseCase {

    fun loginTraditional(username: String?, password: String?): LoginStatus {
        if (username == null || password == null) {
            return LoginStatus.LOGIN_EMPTY
        }
        if (username.isEmpty() || password.isEmpty()) {
            return LoginStatus.LOGIN_EMPTY
        }
        if (username == "admin" || password == "123") {
            return LoginStatus.LOGIN_SUCCESS
        }
        return LoginStatus.LOGIN_ERROR
    }

    fun login(username: String?, password: String?, onResult: (LoginStatus) -> Unit) {
        username?.let { user ->
            password?.let { pass ->
                val status = when {
                    user.isNullOrBlank() || pass.isNullOrBlank() ->
                        LoginStatus.LOGIN_EMPTY

                    user == "admin" && pass == "123" ->
                        LoginStatus.LOGIN_SUCCESS

                    else -> LoginStatus.LOGIN_ERROR
                }
                onResult(status)
                return
            }
        }
        onResult(LoginStatus.LOGIN_ERROR)
    }
}