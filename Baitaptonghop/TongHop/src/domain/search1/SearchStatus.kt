package domain.search1

enum class SearchStatus(val message: String) {
    EMPTY_KEYWORD("Keywork rong"),
    SEARCH_SUCCESS("Tim kiem thanh cong"),
    SEARCH_NO_RESULTS("Tim kiem khong thanh cong"),
}