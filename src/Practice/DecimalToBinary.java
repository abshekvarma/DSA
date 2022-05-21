package Practice;

import java.util.ArrayList;
import java.util.List;

public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 21;
        List<Integer> binary = new ArrayList<>();
        while (decimal > 0) {
            binary.add(decimal % 2);
            decimal /= 2;
        }
        for(int a: binary){
            System.out.print(a);
        }
    }
}
