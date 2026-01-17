package domain.register1

enum class RegisterStatus(val message: String) {
    INVALID_INPUT("Dang ky khong hop le"),
    PASSWORDS_NOT_MATCH("Khong khop mat khau"),
    EMAIL_EXISTS("Email da ton tai"),
    SUCCESS("Hop le"),
}