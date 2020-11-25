class BarUtill
{
public static void main(String a[])
{
              BarTwo bar = new BarTwo();
			  bar.name= "Navrang Bar";
   bar.address= "Rajkumar Road";
  bar.noOfBrands= 32;
  System.out.println( bar.name);
  System.out.println( bar.address);
  System.out.println( bar.noOfBrands);
  
  bar.makePeopleHappy();
  bar.worsen();
  BarTwo.worsen();
  
  
  
			  

}
}
