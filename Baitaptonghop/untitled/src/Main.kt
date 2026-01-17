//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   login("admin", "123") {
       println(it.message)
   }

    register("a@gmail.com", "123456", "123456") {
        println(it.message)
    }


        val students = listOf(
            Student(1, "Thanh", 8.5),
            Student(2, "Tai", 7.0)
        )

        val status = getStudentListStatus(students)
        println(status.message)

        if (status == StudentListStatus.STUDENT_LIST_SUCCESS) {
            showStudents(students)
        }
    findStudentDetail(students, 2){status, student ->
        println(status.message)
        student?.let{
            println(it)
        }
    }
    println(evaluateScore(5.0).message)

    val course = listOf(
        Course("Cs211", "Lap trinh"),
        Course("Phi150", "Triet hoc"),
        Course("His234", "Lich su")
    )
    val status1 = getCourseListStatus(course)
    println(status1.message)

    println(dowload(200).message)

    val items : List <String> = listOf(
        "Thanh"
    )
    val result = search("Thanh", items)
    println(result.message)
    }

