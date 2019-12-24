import java.io.*;
import java.util.*;
class Calculator{
static double powerInt(int num1,int num2){
return Math.pow(num1,num2);
}
static double powerDouble(double num1,int num2){
return Math.pow(num1,num2);
}
}
public class Pro42{
public static void main(String[] args){
double a=Calculator.powerInt(12,10);
double b=Calculator.powerDouble(14.5,2);
System.out.println(a);
System.out.println(b);
}
}