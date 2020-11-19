class Avg
{
public static void main(String a[])
{

double t=avg(45.4,45.0,45.2);
System.out.println(t);
}
static double avg(double f1,double f2,double f3)
{
double total=(f1+f2+f3)/3;
return total;
}
}