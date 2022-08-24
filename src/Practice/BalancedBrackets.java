package Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class BalancedBrackets {
    public static void main(String[] args) {
        Map<Character, Character> map = new HashMap();
        map.put('{','}');
        map.put('[',']');
        map.put('(',')');
        String s = "()[]{}";
        int last = s.length()-1; boolean flagBalanced = true;
        if(s.length()%2!=0){
            flagBalanced = false;
        }
        else{
            for (int i = 0; i < s.length() / 2; i++) {
                if (Objects.isNull(map.get(s.charAt(i))) || map.get(s.charAt(i)) != s.charAt(last)) {
                    flagBalanced = false;
                    break;
                }
                last--;
            }
        }
            if (flagBalanced) {
                System.out.println("Balanced");
            } else {
                System.out.println("Not Balanced");
            }
    }
}