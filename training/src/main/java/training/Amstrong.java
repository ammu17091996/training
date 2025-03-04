package training;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		int a,remainder,sum=0;
		String st;
		System.out.print("enter the number");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		int exp=a;
		int number=a;
st=Integer.toString(a);
int length=st.length();

while(number>0)
{
remainder=number%10;
int mul=1;
for(int i=1;i<=length;i++)
{
mul=mul*remainder;	
}
sum=sum+mul;
number=number/10;

}
if(sum==exp)
	System.out.print("armstrong");
		else
		System.out.print("Not armstrong");

	}

}
