import java.io.*;
import java.util.*;
public class Pro35{
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

int larg1=a[a.length-1];
int lar2=a[a.length-2];
int smal1=a[0];
int smal2=a[1];
System.out.println("larg1 : "+larg1+" larg2 :"+lar2+" smal1 : "+smal1+" smal2 : "+smal2);

}
}
