package domain.dowloaddata1

enum class DowloadStatus(val message: String) {
    DOWNLOAD_SUCCEED("Tai thanh cong"),
    DOWNLOAD_TIMEOUT("Thoi gian tai"),
    DOWLOAD_ERROR("Tai khong thanh cong"),
    NETWORK_ERROR("Loi mang"),
}