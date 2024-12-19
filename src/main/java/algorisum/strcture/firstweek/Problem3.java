package algorisum.strcture.firstweek;

public class Problem3 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";
        Integer i1 = Integer.parseInt(str1);
        Integer i2 = Integer.parseInt(str2);
        System.out.println("두수의 합은: "+ (i1+i2));


        String str = "100";
        Integer i3 = Integer.parseInt(str);
        System.out.println("Integer:"+i3);
        int i = i3.intValue();
        System.out.println("integer:" + i);
        Integer i4 = Integer.valueOf(i);
        System.out.println("intValue:" + i4);

    }
}
