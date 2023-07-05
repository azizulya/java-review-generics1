package comparatorinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main (String[] args) {
        List<Integer> list = Arrays.asList (10,0,5,2,30,277);
        System.out.println (list);

        //Ascending sort
        Collections.sort (list);
        System.out.println (list);

        //Descending order
        Collections.sort (list, new MyComparator ());
        System.out.println (list);

        Collections.sort (list,((o1, o2) -> (o1>o2) ? -1 : (o1<o2) ? 1:0));

        //Ascending
        list.sort ((o1, o2) -> o1.compareTo (o2));
        System.out.println (list);

        //Descending
        list.sort ((o1, o2) -> o1.compareTo (02));
        System.out.println (list);


        List<Apple> mInventory = Arrays.asList (
                new Apple (80, Color.GREEN),
                new Apple (40, Color.RED),
                new Apple (800, Color.GREEN)
        );
        Comparator<Apple> sortApple = Comparator.comparing ((Apple apple) -> apple.getWeight ();
    }
}
