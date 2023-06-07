import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Data
public class Student {

    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private int age;

}
