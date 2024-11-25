package algorisum;

import java.util.Arrays;

public class 조합 {

    static char[] chars = {'a', 'b', 'c', 'd', 'e'};
    static int R = 3;  // Length of each permutation

    //갯수와 어디서 부터 뽑아야 하나
    static void makeCombination(int size ,int start,char [] choosed){
        if(size == R){
            System.out.println(Arrays.toString(choosed));
            return;
        }
        for(int i = start; i < chars.length; i++){
            choosed[size] = chars[i];
            makeCombination(size + 1,i+1,choosed);
        }
    }

    public static void main(String[] args) {
        makeCombination(0,0,new char[R]);
    }
}
