import java.util.*;
public class cow{

    public  static void main(String[] args)
    {

Scanner input=new Scanner(System.in);
    
    int [] sales= new int [5];
int sum;
System.out.println("Enter five integers:");
sum=0;
for (int i=0; i<sales.length; i++)
{
    sales[i]=input.nextInt();
    sum= sum + sales[i];
}
System.out.println("The sum of the numbers " + sum);
}

}