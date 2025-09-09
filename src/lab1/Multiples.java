package lab1;
import java.util.*;

public class Multiples {
    public static void main(String[] args) {
        int count = multiples();
        System.out.println(count);

    }
    public static int multiples() {
        List<Integer> multiples = new ArrayList<>();
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                multiples.add(i);
            }
        }
        return multiples.size();
    }
}
