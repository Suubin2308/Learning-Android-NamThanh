package domain.search1

object SearchUseCase {

    fun search(keyword: String?, items: List<String>): SearchStatus {
        return keyword?.let { key ->
             when {
                key.isNullOrBlank() -> SearchStatus.EMPTY_KEYWORD
                items.any { it == key } -> SearchStatus.SEARCH_SUCCESS
                else -> SearchStatus.SEARCH_NO_RESULTS
            }
        }
            ?: SearchStatus.EMPTY_KEYWORD
    }
}