public class Calc_Project{
public int add(int a,int b){
int c=a+b;
return c;
}
public static void main(String[] args){
Calc_Project cal=new Calc_Project();
System.out.println("The sum of two numbers is "+(cal.add(2,7)));
}
}
