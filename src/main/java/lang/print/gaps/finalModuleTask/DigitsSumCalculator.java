package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int out = 0;
        for(int i=0; i<4; i++) {
            out = out + number%10;
            number = number / 10;
        }
        System.out.println(out);
    }
}
