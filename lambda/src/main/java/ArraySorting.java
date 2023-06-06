public class ArraySorting {

    public static void main (String[] args) {

        ArraySorting as = new ArraySorting ();
      //  as.sort();

        QuickSort qs = new QuickSort ();
        as.sort (qs);
        BubbleSort bs = new BubbleSort ();
        as.sort (qs);
        as.sort (bs);

        Sorting noLambda = new QuickSort();
        noLambda.sort ();

        Sorting quickSort = () -> System.out.println ("Quick sorting");
        as.sort (quickSort);

        Sorting bubbleSort = () -> System.out.println ("Bubble sorting");
        as.sort (bubbleSort);


        Sorting mylambda = ()-> System.out.println ("Sorting the arrays");
    }

    private void sort (Sorting sorting) {
        sorting.sort ();
    }

}
