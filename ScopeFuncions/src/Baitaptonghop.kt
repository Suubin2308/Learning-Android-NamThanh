data class UserAccount(val email: String, val password: String)
data class Student(val id: Int, val name: String, val score: Double)
data class Course(val courseCode: String, val courseName: String)
enum class LoginStatus(message: String) {
    LOGIN_EMPTY("Rong"),
    LOGIN_SUCCESS("Thanh cong"),
    LOGIN_ERROR("Loi")
}
enum class RegisterStatus(message: String) {
    INVALID_INPUT("Dang ky khong hop le"),
    PASSWORDS_NOT_MATCH("Khong khop mat khau"),
    EMAIL_EXISTS("Email da ton tai"),
    SUCCESS("Hop le"),
}
enum class StudentListStatus(message: String) {
    STUDENT_LIST_EMPTY("Danh sach hoc sinh trong"),
    STUDENT_LIST_SUCCESS("Co du lieu sinh vien")
}
enum class StudentDetailStatus(message: String) {
    DETAIL_FOUND("Tim thay"),
    DETAIL_NOT_FOUND("Khong tim thay")
}
enum class ResultStatus(message: String) {
    RESULT_PASS("Qua mon"),
    RESULT_FAIL("Rot mon"),
    RESULT_INVALID("Sai ket qua")
}
enum class CourseListStatus(message: String) {
    COURSE_LIST_EMPTY("Khong co du lieu"),
    COURSE_LIST_SUCCESS("Co du lieu"),
}
enum class DowloadStatus(message: String) {
    DOWNLOAD_SUCCEED("Tai thanh cong"),
    DOWNLOAD_TIMEOUT("Thoi gian tai"),
    DOWLOAD_ERROR("Tai khong thanh cong"),
    NETWORK_ERROR("Loi mang"),
}
enum class SearchStatus(message: String) {
    EMPTY_KEYWORD("Keywork rong"),
    SEARCH_SUCCESS("Tim kiem thanh cong"),
    SEARCH_NO_RESULTS("Tim kiem khong thanh cong"),
}