import java.util.*;

public class CollatzSequence {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number - ");
        long number = scanner.nextLong();

        if(number<=1)
            System.out.println("Collatz Sequence of " + number +" cannot be generated");
        else
        {
            System.out.println(number);
            while(number!=1)
            {
                if(number%2==0)
                    number=number/2;
                else
                    number=3*number+1;
                System.out.println(number);
            }
        }
    }
}
