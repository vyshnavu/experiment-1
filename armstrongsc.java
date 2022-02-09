import java.util.Scanner;
class armstrongsc
{
public static void main(String args[])
{
int n,m,d,arm=0;
Scanner obj =new Scanner(System.in);
System.out.println("enter the num");
n=obj.nextInt();
m=n;
while(n!=0)
{d=n%10;
arm=arm+(d*d*d);
n=n/10;
}
if(m==arm)
System.out.println("armstrong");
else
System.out.println("not armstrong");
}}

