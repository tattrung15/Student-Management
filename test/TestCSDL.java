
import dao.Course;
import dao.Semester;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import services.CourseService;
import services.SemesterService;

public class TestCSDL {

    public static void main(String[] args) throws SQLException, ParseException {
        SemesterService semesterService = new SemesterService();
        List<Semester> semesters = semesterService.getAllSemesters();
        for (Semester semester : semesters) {
            System.out.println(semester);
        }
    }
}
