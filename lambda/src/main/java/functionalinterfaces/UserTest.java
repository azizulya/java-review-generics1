package functionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {

    public static void main (String[] args) {
        List<User>users = new ArrayList<> ();
        users.add (User.builder ().firstName ("Mike").lastName ("Smith").age (35).build ());
        users.add (User.builder ().firstName ("Kamila").lastName ("Kitty").age (5).build ());
        users.add (User.builder ().firstName ("Malika").lastName ("Sunshine").age (9).build ());
        users.add (User.builder ().firstName ("Kita").lastName ("Smith").age (1).build ());
        users.add (User.builder ().firstName ("Emma").lastName ("Smith").age (10).build ());

        //Print all elements in the list
     //   printName (users,p-> true);

        //Print all users who's last name starts with E
        printName (users,user -> user.getFirstName ().startsWith ("E"));
    }

 private static void printName(List<User> users, Predicate<User> p) {
        for(User user : users) {
            if(p.test (user)){
                System.out.println (user.toString ());
            }
        }
 }
}
