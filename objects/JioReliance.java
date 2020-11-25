class JioReliance
{
public static void main(String a[])
{
   JioNetwork jio = new JioNetwork();
   jio.name = "SIMCard";
  jio.size = "small";
  jio.price = 150;
  System.out.println(jio.name);
  System.out.println(jio.size);
  System.out.println(jio.price);
  
  jio.receiveCalls("information");
  jio.sendSMS("hi");
 
  }
  }
  