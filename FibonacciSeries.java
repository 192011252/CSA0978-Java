import java.util.Scanner;

public class FibonacciSeries {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the n value: ");
int n = scanner.nextInt();
scanner.close();

int a = 0, b = 1;
System.out.print(a + " " + b + " ");

for (int i = 2; i < n; i++) {
int c = a + b;
System.out.print(c + " ");
a = b;
b = c;
}
}
}