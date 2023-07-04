package junit;

public class MyMath {

    int sum(int[] numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }

        return sum;
    }

    int sum2(int[] numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }
}
