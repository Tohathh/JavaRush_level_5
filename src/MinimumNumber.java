import java.io.BufferedReader;
import java.io.InputStreamReader;

    /*
    Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
    */

public class MinimumNumber {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b);
        int minimum2 = min (c, d);
        int minimum3 = min (minimum, minimum2);
        int minimum4 = min (minimum3, e);
        System.out.println("Minimum = " + minimum4);
    }
    public static int min(int a, int b) {
        return Math.min(a, b);
    }
}
