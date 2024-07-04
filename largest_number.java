import java.util.*;
public class largest_number
{
    public static void main(String[] args)
    {
        int A = 3, B = 2, C = 1;

        if((A>=B) && (A>=C)) {
            System.out.println("Largest Number is A ");
        }
        else if((B>=C)) {
            System.out.println("Largest Number is B ");
        }
        else{
            System.out.println("Largest Number is C ");;
        }
    }
}