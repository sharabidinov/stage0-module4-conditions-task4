package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int max = (first > second && first > third) ? first : (second > first && second > third) ? second :
                (third > first && third > second) ? third : first;

        System.out.println(max);
    }
}
