
import csdl.CSDL;
import dao.Account;
import dao.Course;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import services.AccountService;
import services.CourseService;

public class TestCSDL {

    public static void main(String[] args) throws SQLException, ParseException {
//        CourseService courseService = new CourseService();
//        List<Course> courses = courseService.getAllCourses();
//        for (Course course : courses) {
//            System.out.println(course);
//        }
        

        Date date = new Date(System.currentTimeMillis() + (31536000 * 1000L * 4));
        //System.out.println(new Date(Calendar.getInstance().getTimeInMillis() + 31536000 * 1000 * 4));
        System.out.println(date);
    }
}
