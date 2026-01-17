fun search(keyword: String?, items: List<String>):SearchStatus{
    keyword?.let {key ->
        val status2 = when{
            key.isNullOrBlank() -> SearchStatus.EMPTY_KEYWORD
            items.any{it == key} -> SearchStatus.SEARCH_SUCCESS
            else -> SearchStatus.SEARCH_NO_RESULTS
        }
    }
    return SearchStatus.EMPTY_KEYWORD
}