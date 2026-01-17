fun evaluateScore(score: Double?): ResultStatus {
    if (score == null) {
        return ResultStatus.RESULT_INVALID
    }
    return score.run {
        when {
            score < 0 || score > 10 -> ResultStatus.RESULT_INVALID
            score >= 5 -> ResultStatus.RESULT_PASS
            else -> ResultStatus.RESULT_FAIL
        }
    }
}
