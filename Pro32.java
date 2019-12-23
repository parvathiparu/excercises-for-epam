import java.io.*;
import java.util.*;
public class Pro32{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
int i;

for(i=0;i<a.length;i++){
a[i]=sc.nextInt();
}
int ma=a[0];
int mi=a[0];
for(i=0;i<a.length;i++){
if(ma<a[i]){
ma=a[i];
}
else if(mi>a[i]){
mi=a[i];
}
}
System.out.println("min is"+mi+"and max is" +ma);
}
}
