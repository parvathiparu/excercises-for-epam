import java.io.*;
import java.util.*;
import java.util.Arrays;
public class Pro311{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
if(args.length==9){

int i,j,m=0,n=9;
System.out.println("the given array is");

for(i=0;i<3;i++){
for(j=0;j<3;j++){
System.out.print(args[m]+" ");
m++;

}System.out.println();
}

int max=Integer.parseInt(args[0]);
for(int k=0;k<9;k++){
if(max<Integer.parseInt(args[k])){
max=Integer.parseInt(args[k]);
}
}
System.out.println("max element"+max);
}
else{
System.out.println("enter only 9 elements");
}

}
}
