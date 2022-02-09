import java.util.Scanner;
class factorialsc
{
public static void main(String args[])
{
int n,s=1,i;
Scanner obj=new Scanner(System.in);
System.out.println("enter the num");
n=obj.nextInt();
for(i=1;i<=n;i++)
{s=s*i;
}
System.out.println("factorial="+s);
}}

