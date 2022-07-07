import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a date of your birthday (03 08 1998): ");
        int day = sc.nextInt();
        int mounth = sc.nextInt();
        int year = sc.nextInt();

        System.out.println("Your birthday is " + day + " " + mounth + " " + year);
    }
}
