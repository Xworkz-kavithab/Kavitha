class Book
{
static String name;
 double price;
static String size;

static void toWrite()
{
System.out.println("hkjkhk");
}


public static void main(String a[])
{

Book.name="Gold";

Book.size="6inch";
Book book = new Book();
book.price=12.00;

System.out.println(Book.name);
System.out.println(book.price);
System.out.println(Book.size);
Book.toWrite();


book.price=13.00;
System.out.println(book.price);
}
}










