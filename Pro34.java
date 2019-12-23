import java.io.*;
import java.util.*;
public class Pro34{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
int c=0;
int i;
for(i=0;i<a.length;i++){
a[i]=sc.nextInt();
}

for(i=0;i<a.length;i++){
System.out.print((char)a[i]);
}
}
}
