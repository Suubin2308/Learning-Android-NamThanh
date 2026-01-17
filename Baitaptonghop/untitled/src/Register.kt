data class RegisterInput(val email: String?, val password: String?, val confirmPassword: String?)
fun register(email: String?, password: String?, comfirmPassword: String?, onResult: (RegisterStatus) -> Unit) {
    email?.let{mail ->
        password?.let{pass ->
            comfirmPassword?.let{comfirm ->
                val status = when {
                    mail.isNullOrBlank() || pass.isNullOrBlank() || comfirm.isNullOrBlank() ->
                        RegisterStatus.INVALID_INPUT
                    pass != comfirm ->
                        RegisterStatus.PASSWORDS_NOT_MATCH
                    mail == "a@gmail.com" || mail == "b@gmai;.com" ->
                        RegisterStatus.EMAIL_EXISTS
                    else -> RegisterStatus.SUCCESS
                }
                onResult(status)
                return
            }
        }
    }
    onResult(RegisterStatus.INVALID_INPUT)
}