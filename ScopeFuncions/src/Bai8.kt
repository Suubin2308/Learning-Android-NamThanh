//enum class FindKey(val message : String) {
//    EMPTY_KEYWORD("Keyword rỗng"),
//    FOUND("Có kết quả"),
//    NOT_FOUND("Không có")
//}
//fun inputKeyword(keyword : String?, onResult: (FindKey) -> Unit) {
//    keyword?.let {key ->
//        val status = when {
//            key.isEmpty() -> FindKey.EMPTY_KEYWORD
//            key == "Thanh" -> FindKey.FOUND
//            else -> FindKey.NOT_FOUND
//        }
//        onResult(status)
//        return
//    }
//    onResult(FindKey.EMPTY_KEYWORD)
//}
//fun main(){
//    inputKeyword("Thanh"){ status ->
//        println(status)
//    }
//}