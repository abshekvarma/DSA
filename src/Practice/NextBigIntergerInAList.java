package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextBigIntergerInAList {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        List<Integer> list = Arrays.asList(1,5,26,73,2,57,58,98,78,81, 25,61);
        list.sort((o1, o2) -> o1-o2);
        System.out.println(list.get(list.size()-2));
    }
}
