
import csdl.CSDL;
import dao.Account;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import services.AccountService;

public class TestCSDL {

    public static void main(String[] args) throws SQLException {
        AccountService accountService = new AccountService();
        List<Account> accounts = accountService.getAllAccounts();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
