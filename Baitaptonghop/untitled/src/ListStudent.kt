fun getStudentListStatus(students: List<Student>): StudentListStatus {
    return when {
        students.isEmpty() ->
            StudentListStatus.STUDENT_LIST_EMPTY
        else ->
            StudentListStatus.STUDENT_LIST_SUCCESS
    }
}
fun showStudents(students: List<Student>) {

    students.also {
        println("So luong sinh vien: ${it.size}")
    }
    with(students) {
        forEach {
            println(it)
        }
    }
}
