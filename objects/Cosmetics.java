class Cosmetics
{
double price;
String name;
String color;
String brand;
int id;
 
 
   static void makeUpKit()
	{
	System.out.println("for Bride");
	}
	
	
	public static void main(String a[])
	{
	Cosmetics cos = new Cosmetics();
	cos.price = 150.00;
	cos.name = "Kajal";
	cos.color = "Black";
	cos.brand = "Lakme";
	cos.id = 2345;
	System.out.println(cos.price);
    Cosmetics.makeUpKit();
}

}
	