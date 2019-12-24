import java.io.*;
import java.util.*;
import java.util.Arrays;
public class Pro38{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
int k=0,i,j;
int n=sc.nextInt();
int[] a=new int[n];
for(i=0;i<n;i++){
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
int count=0,max=0;
for(j=i+1;j<n;j++)
{
if(a[i]==a[j])
count++;
}
if(count>max)
{
max=count;
System.out.println("max is : "+a[i]);
}
}


}
}
