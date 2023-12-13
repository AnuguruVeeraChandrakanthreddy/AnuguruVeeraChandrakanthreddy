// to read first n natural numbers
import java.util.Scanner;

public class readingnumbers
{
  public static void main (String arg[])
  {
    System.out.println("enter the total number of numbers you want to read : ");
    Scanner reader = new Scanner(System.in);
    int n = reader.nextInt();
    for(int i=1;i<n;i++)
    {
      System.out.println(i);
    }
  }
}