package domain.dowloaddata1

object DowloadDataUseCase {

    fun dowload(statusCode: Int?): DowloadStatus {
        if (statusCode == 503) {
            return DowloadStatus.DOWLOAD_ERROR
        }
        return statusCode.run {
            when {
                statusCode == 200 -> DowloadStatus.DOWNLOAD_SUCCEED
                statusCode == 408 -> DowloadStatus.DOWNLOAD_TIMEOUT
                else -> DowloadStatus.NETWORK_ERROR
            }
        }
    }
}