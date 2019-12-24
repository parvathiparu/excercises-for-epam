import java.util.*;
import java.util.*;
class Box{
int w,h;
double d;
Box(int width,int height,double depth){
 w=width;
 h=height;
 d=depth;
}
double ans(){
return w*h*d;

}
}
public class Pro41{
public static void main(String[] args){
Box b=new Box(5,4,100);

 System.out.println(b.ans());
}
}