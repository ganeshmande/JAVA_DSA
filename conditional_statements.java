import java.util.*;
public class conditional_statements
{
    public static void main(String[] args)
    {
        int age = 15;
        if(age >= 18) {
            System.out.println("adult = drive, vote");
        }
        if(age >13 && age<18) {
            System.out.println("Teenagers");
        }
        else{
            System.out.println("not adult");
        }
        
        int a=1;
        int b=5;

        if(a >= b) {
            System.out.println("a is  largest of 2");
        }
        else{
            System.out.println("b is largest of 2");
        }
    }
}