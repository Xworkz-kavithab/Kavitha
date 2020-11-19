class GreatestNumber
{
public static void main(String a[])
{
	int finalvalue =maxOfTwoNum(345,345);
	System.out.println(finalvalue);
}	
   static int maxOfTwoNum(int firstnum,int secondnum)
{
if(firstnum > secondnum)
return firstnum;
else
return secondnum;
}
}



