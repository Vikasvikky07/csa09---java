import java.util.*;
class Main
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of terms:");
int n=sc.nextInt();
int a=0,b=1,c;
System.out.println("fibonacci series:");
System.out.print("0\t1\t");
for(int i=1;i<=n-2;i++)
{
 c=a+b;
 a=b;
 b=c;
 System.out.print(c+"\t");
}
}
}

