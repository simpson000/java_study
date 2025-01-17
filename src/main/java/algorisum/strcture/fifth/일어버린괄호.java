package algorisum.strcture.fifth;

import java.util.Scanner;

public class 일어버린괄호 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split("-");
        int result = 0;
        for (int i = 0; i < strs.length; i++) {
            int temp= mySum (strs[i]);
            if (i == 0) {
                result += temp;
            }
            else {
                result -= temp;
            }
        }
        System.out.println(result);


    }

    private static int mySum(String strs) {
        int sum = 0;
        String [] temp = strs.split("\\+");
        for (int i = 0; i < temp.length; i++) {
            sum += Integer.parseInt(temp[i]);
        }
        return sum;
    }
}
