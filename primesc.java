import java.util.*;
class primesc
{
public static void main(String args[])
{
int n,i,flag=0;
Scanner obj= new Scanner(System.in);
System.out.println("enter a num");
n=obj.nextInt();
if(n==0||n==1)
System.out.println("neither prime not composite");
for(i=2;i<n;i++)
{if(n%i==0)
{System.out.println("not prime");
flag=1;
break;
}}
if(flag==0)
System.out.println("prime");
}}

