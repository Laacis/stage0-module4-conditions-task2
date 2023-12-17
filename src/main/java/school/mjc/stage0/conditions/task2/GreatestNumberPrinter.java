package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        int greatestNumber;

        if(first > second){
            greatestNumber = first;
        }else {
            greatestNumber = second;
        }

        System.out.println(greatestNumber);
    }
}
