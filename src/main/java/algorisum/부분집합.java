package algorisum;

import java.util.Arrays;

public class 부분집합 {
    //t와 f를 활용한 중복 조합이구나
    static char[] chars = {'a', 'b', 'c', 'd', 'e'};
    static int R = 3;  // Length of each permutation

    static void setChars(int size, boolean[] check){
        if (size < chars.length) {
            System.out.println(Arrays.toString(check));
            return;
        }
        check[size] = true;
        setChars(size + 1, check);
        check[size] = false;
        setChars(size + 1, check);

    }
    public static void main(String[] args) {
        setChars(0, new boolean[chars.length]);
    }
}
