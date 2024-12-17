package javamid.test;

public class TestString1 {
    public static void main(String[] args) {
        String url = "https://www.example.com";
        boolean result = url.startsWith("https://");
        System.out.println("result: " + result);


        String[] array = {"hello", "world"};
        System.out.println(array.length);
        int sum = 0;
        for (String arrays : array) {
            sum += arrays.length();
            System.out.println("arrays: " + arrays.length());

        }
        System.out.println(sum); ;


        String str = "hello.txt";

        int start = str.indexOf(".txt");
        System.out.println(start);


        System.out.println("filename=" + str.substring(0,start));
        System.out.println("extname=" + str.substring(start, str.length()));


        String str2 = "start hello java, hello spring, hello jpa";
        String key = "hello";
        int count =0;
        int index = str2.indexOf(key);

        while(index != -1) {
            index = str2.indexOf(key, index+key.length());
            System.out.println("index: " + index);
            count++;
        }
        System.out.println(count+" ");


        String original = "             Hello Java";
        System.out.println(original.trim());


        String input = "hello java spring spring jpa java";
        String replace = input.replace("java", "jvm");
        System.out.println(replace);




    }


}
