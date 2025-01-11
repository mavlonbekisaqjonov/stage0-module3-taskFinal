package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int out = 0;
        while (number != 0) { // Continue until the number becomes 0
            out = out * 10 + number % 10; // Extract the last digit and build the reversed number
            number = number / 10;         // Remove the last digit
        }
        System.out.println(out); // Print the reversed number
    }
}
