fun main(){
    var phone: String? = "0123456789"
    val length = phone?.length
    if (phone != null && phone.length >= 10){
        println ("Số hợp lệ")
    } else {
        println ("Số không hợp lệ")
    }
}