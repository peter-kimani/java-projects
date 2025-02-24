import java.util.*;
public class arrayin
{
    
public static void main(String[] args)
{
	Scanner input= new Scanner(System.in);
    
    int[] items =new int [5];
    int sum;
    System.out.println("Enter five integers");
    sum=0;

    for(int i=0; i< items.length; i++)
    {
        items[i]= input.nextInt();
        sum= sum + items[i];
    }

System.out.println("The sum of the numbers =" + sum);
System.out.println("The numbers in the reverse " + "Order are:");
for(int i=items.length - 1; i>=0; i--)

    System.out.println(items[i] + " ");
    System.out.println();

}
}