import java.io.*;
import java.util.*;
public class Pro36{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);

int a[]={98,85 ,12 ,54 ,67};
int c=0;
int i,j,temp;

for(i=0;i<a.length;i++){
for(j=i+1;j<a.length;j++){
if(a[i]>a[j]){
temp=a[i];
a[i]=a[j];
a[j]=temp;}
}
}

for(i=0;i<5;i++){
System.out.println(a[i]);
}
}
}
