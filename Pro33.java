import java.io.*;
import java.util.*;
public class Pro33{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
int c=0;
int i,sum=0;
float avg;
for(i=0;i<a.length;i++){
a[i]=sc.nextInt();
}
System.out.println("search element:");
int search=sc.nextInt();
for(i=0;i<a.length;i++){
if(a[i]==search){
c=i;
}
else c=-1;
}System.out.println(c);
}
}
