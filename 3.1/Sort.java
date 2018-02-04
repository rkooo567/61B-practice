public class Sort {
    /*
     Sorts strings destructively.
     We will use selection sort
    */
    public static void sort(String[] x) {
        /*
            1. Find the smallest item
            2. move it to front
            3. selection sort for remaining n - 1 item
        */
        for (int i = 0; i < x.length; i++ ) {
            String min = x[i];
            int minIndex = i;
            for (int j = i + 1; j < x.length; j++) {
                if (x[j].compareTo(min) < 0) {
                    min = x[j];
                    minIndex = j;
                }
            }
            String temp = x[i];
            x[i] = min;
            x[minIndex] = temp;
        }
    }
}