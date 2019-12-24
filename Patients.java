import java.io.*;
import java.util.*;
class Patient{
String name;
double weight,height;
double BMI(double weight,double height){
double v=((weight*2.205)/((height*12)*(height*12))*703);
return v;
}
}
public class Patients{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
Patient p=new Patient();
String name=sc.next();
double weight=sc.nextDouble();
double height=sc.nextDouble();
System.out.println(p.BMI(weight,height));
}
}