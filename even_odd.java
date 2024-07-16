import java.util.*;
public class even_odd
{
    public static void main(String[] args)
    {
        System.out.print("Enter a number \n = ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number % 2 == 0) {
            System.out.println("Number is EVEN");
        }
        else{
            System.out.println("Number is ODD");
        }
    }
}