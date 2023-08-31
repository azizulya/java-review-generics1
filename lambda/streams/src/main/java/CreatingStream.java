import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class CreatingStream {
    public static void main(String[] args) {
        //Creating Stream from Array

        String[]courses = {"Java", "JS", "TS"};
       Stream<String>courseStream = Arrays.stream(courses);

       //Creating Stream from COllection
        List<String> courseList = Arrays.asList("Java", "Data Structure", "Spring");
        Stream<String> courseStream2 = courseList.stream();

        List<Course> myCourses = Arrays.asList(
                new Course("Java", 100),
                new Course("DS", 101),
                new Course("Spring", 102),
                new Course("Microservices", 103)
        );

        Stream<Course>myCourseStream = myCourses.stream();

        //Creating Stream from Values
      //  Stream<Integer>stream = Stream.of(1,2,3,4);
    }
}
