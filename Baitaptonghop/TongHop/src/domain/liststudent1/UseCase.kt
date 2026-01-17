package domain.liststudent1
import data.Student

object UseCase {

    fun getStudentListStatus(students: List<Student>, onResult: (StudentListStatus) -> Unit) {
        val status =  when {
            students.isEmpty() ->
                StudentListStatus.STUDENT_LIST_EMPTY

            else ->
                StudentListStatus.STUDENT_LIST_SUCCESS
        }
        onResult(status)
        return

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
}
