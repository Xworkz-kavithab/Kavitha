class MobilePhones
{
public static void main(String a[])
{
Mobile mob = new Mobile();
 //mob.names[]={"MI","OnePlus","VIVO","OPPO",};
 //mob.color[]={"Blue","Green","Voilet"};
 mob.price=67000;
 mob.size="6inch";
 mob.memorySize="64GB";
 
 for(int namesval=0;namesval<=3;namesval++)
System.out.println(mob.names[namesval]);

for(int colorval=0;colorval<=2;colorval++)
	System.out.println(mob.color[colorval] );
System.out.println(mob.price);
System.out.println(mob.size);
System.out.println(mob.memorySize);

Mobile.gaming("play");
Mobile.watch("entertain");
}
}


 