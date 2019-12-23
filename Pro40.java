import java.io.*;
import java.util.*;
import java.util.Arrays;
public class Pro40{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
int i,j,m=0,n=4;
System.out.println("the given array is");
for(i=0;i<2;i++){
for(j=0;j<2;j++){
System.out.print(args[m]+" ");
m++;

}System.out.println();
}
System.out.println("the reversed array is");
for(i=0;i<2;i++){
for(j=0;j<2;j++){
System.out.print(args[n-1]+" ");
n--;
}
System.out.println();
}
}
}
