import java.util.Scanner;
public class OddEven {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        int i = s.nextInt();

        if(i%2==0)
            System.out.println("You enter EVEN number.");
        else
            System.out.println("You enter ODD number.");

    }
}
