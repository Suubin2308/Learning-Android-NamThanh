fun findStudentDetail(students: List<Student>, idCanTim: Int, onResult: (StudentDetailStatus, Student?) -> Unit){
    val student = students.find { it.id == idCanTim }

    if (student != null) {
        onResult(StudentDetailStatus.DETAIL_FOUND, student)
    } else {
        onResult(StudentDetailStatus.DETAIL_NOT_FOUND, null)
    }
}