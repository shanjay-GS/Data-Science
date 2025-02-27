import java.util.*;
class leapyear
{
    public static void main(String[] args)
    {
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        if(a%400==0 || a%4==0 && a%100!=0)
        {
            System.out.println("leap year");
        }
        else{
            System.out.println("it is not a leap year");
        }


    }
}
