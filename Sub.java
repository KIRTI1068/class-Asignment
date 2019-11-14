import java.util.*;
class Sub
{
	public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
	int count=0;
	n=n-k+1;
	count=(n*(n+1))/2;
System.out.println(count);
}
}
}