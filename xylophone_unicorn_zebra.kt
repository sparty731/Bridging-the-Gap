//1
fun main() { 
    println("Welcome to Bridging the Gap!") 
} 

//2
class Course { 
    var name: String = ""
    var instructor: String = ""
    var duration: Int = 0

    fun displayCourseDetails() { 
        println("Course Name: $name") 
        println("Instructor: $instructor") 
        println("Duration: $duration") 
    } 
} 

//3
class Student { 
    var name: String = ""
    var age: Int = 0
    var courses: Array<Course> = arrayOf()

    fun displayStudentDetails() { 
        println("Name: $name") 
        println("Age: $age") 
        println("Courses: ")
        for (course in courses) {
            course.displayCourseDetails()
        }
    } 

//4
    fun addCourse(course: Course) { 
        courses += course 
    } 

    fun removeCourse(name: String) { 
        courses = courses.filter {it.name != name}
    } 
} 

//5
fun createCourse(): Course { 
    val course = Course() 
    println("Enter course name: ") 
    course.name = readLine()!! 
    println("Enter instructor name: ") 
    course.instructor = readLine()!! 
    println("Enter duration: ") 
    course.duration = readLine()!!.toInt() 
    return course 
} 

//6
fun createStudent(): Student { 
    val student = Student() 
    println("Enter student name: ") 
    student.name = readLine()!! 
    println("Enter student age: ") 
    student.age = readLine()!!.toInt() 
    return student 
} 

//7
fun mainWithArgs(args: Array<String>) {
    when(args[0]) { 
        "create_course" -> { 
            println("Creating Course")
            val course = createCourse() 
            println(" created course " + course.name) 
        } 
        "create_student" -> { 
            println("Creating Student")
            va student = createStudent() 
            println(" created student " + student.name) 
        } 
    } 
} 

//8
fun enrollStudentToCourse(student: Student, course: Course) { 
    student.addCourse(course) 
    println("Student ${student.name} enrolled for course ${course.name}") 
} 

//9
fun unenrollStudentFromCourse(student: Student, course: Course) { 
    student.removeCourse(course.name) 
    println("Student ${student.name} unenrolled from course ${course.name}") 
} 

//10
fun printStudentsDetails(students: Array<Student>) { 
    for (student in students) { 
        student.displayStudentDetails()
    }
} 

//11
class Main { 
    companion object { 
        @JvmStatic
        fun main(args: Array<String>) { 
            mainWithArgs(args) 
        } 
    } 
} 

//12
fun updateCourseName(course: Course, newName: String) { 
    course.name = newName
    println("Course ${course.name} was updated to $newName")
} 

//13
fun updateInstructorName(course: Course, newName: String) { 
    course.instructor = newName
    println("Course ${course.name} was updated to new instructor $newName")
} 

//14
fun updateDuration(course: Course, newDuration: Int) { 
    course.duration = newDuration
    println("Course ${course.name} was updated to new duration $newDuration")
} 

//15
fun updateStudentName(student: Student, newName: String) { 
    student.name = newName
    println("Student ${student.name} was updated to $newName")
} 

//16
fun updateStudentAge(student: Student, newAge: Int) { 
    student.age = newAge
    println("Student ${student.name} was updated to age $newAge")
} 

//17
fun generateStudentReport(student: Student): String { 
    var report = "Student Report\n"
    report += "Name: ${student.name}\nAge: ${student.age}\n"
    report += "Courses Enrolled:\n"
    for (course in student.courses) {
        report += "${course.name} by ${course.instructor}, duration ${course.duration} Weeks\n"
    }
    return report
} 

//18
fun mainMenu() { 
    println("Welcome to Bridging the Gap Main Menu") 
    println("Enter an option") 
    println("1. Create Student") 
    println("2. Create Course") 
    println("3. Enroll Student to Course") 
    println("4. Unenroll Student from Course") 
    println("5. Update Course Name") 
    println("6. Update Course Instructor") 
    println("7. Update Course Duration") 
    println("8. Update Student Name") 
    println("9. Update Student Age") 
    println("10. Generate Student Report") 
    println("11. Display Students List") 
    println("12. Exit") 
}

//19
fun mainMenuOptions(option: String, students: Array<Student>) {
    when(option) { 
        "1" -> {
            val student = createStudent()
            students += student
            println("Student ${student.name} created")
        }
        "2" -> {
            val course = createCourse()
            println("Course ${course.name} created")
        }
        "3" -> {
            println("Enter student name")
            val studentName = readLine()!!
            val student = students.find { it.name == studentName }
            if(student != null) {
                println("Enter course name")
                val courseName = readLine()!!
                val course = Course() 
                course.name = courseName
                enrollStudentToCourse(student, course)
            }
            else {
                println("Student not found")
            }
        }
        "4" -> {
            println("Enter student name")
            val studentName = readLine()!!
            val student = students.find { it.name == studentName }
            if(student != null) {
                println("Enter course name")
                val courseName = readLine()!!
                val course = Course() 
                course.name = courseName
                unenrollStudentFromCourse(student, course)
            }
            else {
                println("Student not found")
            }
        }
        "5" -> {
            println("Enter course name")
            val courseName = readLine()!!
            val course = Course() 
            course.name = courseName
            println("Enter new course name")
            val newName = readLine()!!
            updateCourseName(course, newName)
        }
        "6" -> {
            println("Enter course name")
            val courseName = readLine()!!
            val course = Course() 
            course.name = courseName
            println("Enter new instructor name")
            val newName = readLine()!!
            updateInstructorName(course, newName)
        }
        "7" -> {
            println("Enter course name")
            val courseName = readLine()!!
            val course = Course() 
            course.name = courseName
            println("Enter new duration")
            val newDuration = readLine()!!.toInt()
            updateDuration(course, newDuration)
        }
        "8" -> {
            println("Enter student name")
            val studentName = readLine()!!
            val student = students.find { it.name == studentName }
            if(student != null) {
                println("Enter new student name")
                val newName = readLine()!!
                updateStudentName(student, newName)
            }
            else {
                println("Student not found")
            }
        }
        "9" -> {
            println("Enter student name")
            val studentName = readLine()!!
            val student = students.find { it.name == studentName }
            if(student != null) {
                println("Enter new student age")
                val newAge = readLine()!!.toInt()
                updateStudentAge(student, newAge)
            }
            else {
                println("Student not found")
            }
        }
        "10" -> {
            println("Enter student name")
            val studentName = readLine()!!
            val student = students.find { it.name == studentName }
            if(student != null) {
                val report = generateStudentReport(student)
                println(report)
            }
            else {
                println("Student not found")
            }
        }
        "11" -> {
            printStudentsDetails(students)
        }
    }
}

//20
fun start() { 
    var students: Array<Student> = arrayOf()
    mainMenu() 
    while (true) { 
        val option = readLine()!! 
        if (option == "12") { 
            break 
        } 
        mainMenuOptions(option, students) 
    } 
} 

//21
fun main() { 
    println("Welcome to Bridging the Gap!") 
    start() 
}