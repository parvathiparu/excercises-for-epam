import java.io.*;
import java.util.*;
public class Sumavg{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];

int i,sum=0;
float avg;
for(i=0;i<a.length;i++){
a[i]=sc.nextInt();
}
for(i=0;i<a.length;i++){
sum+=a[i];
}
avg=(float)sum/n;
System.out.println("sum is"+sum+"and avg is" +avg);
}
}
