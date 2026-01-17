fun getCourseListStatus(course: List<Course>): CourseListStatus{
    return when {
        course.isEmpty() ->
            CourseListStatus.COURSE_LIST_EMPTY
        else ->
            CourseListStatus.COURSE_LIST_SUCCESS
    }
}