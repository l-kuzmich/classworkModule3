import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number of the day: ");
        int day = sc.nextInt();

        switch (day){
            case 1 : {
                System.out.println("It is Monday");
                break;
            }
            case 2 : {
                System.out.println("It is Tuesday");
                break;
            }
            case 3 : {
                System.out.println("It is Wednesday");
                break;
            }
            case 4 : {
                System.out.println("It is Thursday");
                break;
            }
            case 5 : {
                System.out.println("It is Friday");
                break;
            }
            case 6 : {
                System.out.println("It is Saturday");
                break;
            }
            case 7 : {
                System.out.println("It is Sunday");
                break;
            }
            default:
                System.out.println("Enter a number of a day please");
        }

    }
}
