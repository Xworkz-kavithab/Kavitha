class Factorial
{
public static void main(String a[])
{
 myFact(89);
 



}
static void myFact(double f)
{
  double fact=1;
for(int i=1;i<=f;i++)
{
fact=fact*i;
}
System.out.println(fact);

}
}
