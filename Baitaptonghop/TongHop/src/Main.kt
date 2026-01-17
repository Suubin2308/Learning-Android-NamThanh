//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import domain.login1.LoginUseCase
import domain.register1.RegisterUseCase
import domain.liststudent1.UseCase
import domain.studentdetails1.StudentDetailsUseCase
import domain.academicresults1.AcademicResultUseCase
import domain.listsubject1.ListSubjectUseCase
import domain.dowloaddata1.DowloadDataUseCase
import domain.search1.SearchUseCase
import data.Student
import data.Course

fun main() {

    val login: LoginUseCase = LoginUseCase
    login.login("admin", "123") {
        println(it.message)
    }

    val register: RegisterUseCase = RegisterUseCase
    register.register("a@gmail.com", "123456", "123456") {
        println(it.message)
    }


    val students = listOf(
        Student(1, "Thanh", 8.5),
        Student(2, "Tai", 7.0)
    )

    val liststudent: UseCase = UseCase
    val status = liststudent.getStudentListStatus(students){status->
        println(status.message)
    }


    val studentss: UseCase = UseCase
    val liststudents: List<Student> = listOf(
        Student(1, "Thanh", 8.5),
        Student(2, "Tai", 7.0),
    )
    studentss.getStudentListStatus(liststudents){status->
        println(status.message)

    }
    val studentDetail: StudentDetailsUseCase = StudentDetailsUseCase
    studentDetail.findStudentDetail(students, 2) { status, student ->
        println(status.message)
        student?.let {
            println(it)
        }
    }

    val academicresult: AcademicResultUseCase = AcademicResultUseCase
    println(academicresult.evaluateScore(5.0).message)

    val course = listOf(
        Course("Cs211", "Lap trinh"),
        Course("Phi150", "Triet hoc"),
        Course("His234", "Lich su")
    )
    val listSubject: ListSubjectUseCase = ListSubjectUseCase
    val status1 = listSubject.getCourseListStatus(course)
    println(status1.message)

    val dowloadData: DowloadDataUseCase = DowloadDataUseCase
    println(dowloadData.dowload(200).message)

    val items : List <String> = listOf(
        "Thanh"
    )
    val search : SearchUseCase = SearchUseCase
    val result = search.search("Thanh", items)
    println(result.message)
}

