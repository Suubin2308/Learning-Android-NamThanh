enum class Score(val messeger: String) {
    INVALID ("Rong"),
    PASS ("Qua mon"),
    Fail ("Rot mon")
}
fun getResult(scores: Double?, onResult: (Score) -> Unit) {
    scores?.run{
        if (scores >= 5.0){
            onResult(Score.PASS)
        } else {
            onResult(Score.Fail)
        }
        return
    }
    onResult(Score.INVALID)
}
fun main(){
    getResult(8.6){ scores ->

        println(scores.messeger)
    }
}