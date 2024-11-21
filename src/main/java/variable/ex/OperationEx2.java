package variable.ex;

public class OperationEx2 {
    public static void main(String[] args) {
        int num1, num2, num3;
        num1 = 10;
        num2 = 20;
        num3 = 30;
        int sum = num1 + num2 + num3;
        System.out.println(sum);
        int avg = sum / 3;
        System.out.println(avg);


        double val1 = 1.5;
        double val2 = 2.5;
        double val3 = 3.5;


        int age=29;

        if (age<7){
            System.out.println("미취학");
        } else if (age<=13){
            System.out.println("초등학생");
        } else if (age<=16){
            System.out.println("중등학생");
        } else if (age<=19){
            System.out.println("고등학생");
        } else if (age>=20){
            System.out.println("성인");
        }

        String status =  age >= 20 ? "성인" : "미성년자";
        System.out.println(status);

        int distance = 5;

        if (distance<=1){
            System.out.println("도보");
        } else if (distance<=10){
            System.out.println("자전거");
        } else if (distance<=100){
            System.out.println("자동차");
        } else if (distance<=1000){
            System.out.println("비행기");
        }

        double rating = 8;
        if (rating<=9){
            System.out.println("어바웃타임을 추천합니다.");
        }
        if (rating<=8){
            System.out.println("토이 스토리을 추천합니다.");
        }
        if (rating<=7){
            System.out.println("고질라을 추천합니다.");
        }

        int a = 10, b = 20;

        int max = (a > b ? a : b);
        System.out.println("더 큰 숫자는 :" +max);

        int num =1;
        int result=0;
        while (num<=3){

            result+=num;
            num=num+1;

        }
        System.out.println(result);

        int count =10;

        for (int i = 0; i <= count; i++){
            System.out.println(i);
        }
    }
}
