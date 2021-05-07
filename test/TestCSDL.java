
import dao.Clazz;
import dao.Course;
import dao.Semester;
import dao.Student;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import services.ClassService;
import services.CourseService;
import services.SemesterService;
import services.StudentService;

public class TestCSDL {

    public static void main(String[] args) throws SQLException, ParseException {
//        SemesterService semesterService = new SemesterService();
//        List<Semester> semesters = semesterService.getSemestersByCourseId(3);
//        for (Semester semester : semesters) {
//            System.out.println(semester);
//        }

//        StudentService studentService = new StudentService();
//        List<Student> students = studentService.getAllStudents();
//        for (Student student : students) {
//            System.out.println(student);
//        }
        ClassService classService = new ClassService();
        List<Clazz> clazzs = classService.getClassesBySemesterId(1);
        for (Clazz clazz : clazzs) {
            System.out.println(clazz);
        }
    }
}
