data class Student(val id: Int, val name: String, val score: Int )
fun checkFailed(list: List<Student>): Boolean {
    return list.any{it.score < 5}
}
fun checkPass(list: List<Student>): Boolean {
    return list.all{it.score >= 5}
}
fun main(){

    val studentList: List<Student> = listOf(
        Student(1, "An", 8),
        Student(2, "Chi", 4),
        Student(3, "Chi", 6),
    )
    println(studentList)

   studentList.forEach {
       println(it.name)
   }

    println(if (checkFailed(studentList)) "Có" else "Không")

    println(if (checkPass(studentList)) "Có" else "Không")

    val studentFind = studentList.find{it.id == 2}
    println(studentFind)

    val studentMap = mutableMapOf(
        1 to Student(1, "An", 8),
        2 to Student(2, "Chi", 4),
        3 to Student(3, "Chi", 6),
    )
    println(studentMap[3])
}



