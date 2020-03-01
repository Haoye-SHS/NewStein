package Java1.Class11;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Class11 {
    public static void main(String[] args) {
        try {
            int x = 6 / 0;
        } catch(ArithmeticException e) {

        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any INTEGER you like: ");
        int y = sc.nextInt();
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("class11.txt", "UTF-8");
        } catch(FileNotFoundException e) {

        } catch(UnsupportedEncodingException e) {

        }
        writer.println("The number you entered is: " + y);
        writer.println("File End");
        writer.close();
    }
}
