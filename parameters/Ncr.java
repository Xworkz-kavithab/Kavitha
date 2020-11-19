class NcrFact
{
public static void main(String a[])
{
  int f=myFact(7);
  int g=myFact(3);
  int r=myFact(5);
  int op=f/(g*r);
  System.out.println(op);
  double t=Avg.avg(45.5,45.2,45.1);
  System.out.println(t);
  }
  
 




static int myFact(int nm)
{
  int fact=1;
for(int i=1;i<=nm;i++)
{
fact=fact*i;
}
System.out.println(fact);
return fact;
}
}