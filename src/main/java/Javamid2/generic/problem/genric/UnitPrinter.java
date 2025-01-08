package Javamid2.generic.problem.genric;

public class UnitPrinter {
    //제너릭
    public static <T extends BioUnit> void printV1(Shuttle<T> t1) {

        T unit = t1.out();
        System.out.println(unit.getName()+unit.getHp());


    }

    //와일드 카드
    public static void printV2(Shuttle<? extends BioUnit> t1) {
        BioUnit unit = t1.out();
        System.out.println(unit.getName()+unit.getHp());
    }
}
