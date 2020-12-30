package com.xworkz.xworkzapp.citywards;

public class WardInformation {
	public CityWardDTO[] cityWard= new CityWardDTO[2];
	public int index;
	public int i;
public void addWardDetails(CityWardDTO cityward) {
		
		System.out.println("Adding Ward Details");
		if(cityward!=null) {
		  if(cityward.getWardNo()!=0){
			if(cityward.getWardName()!=null){
				if(cityward.getPopulation() >= 5000) {
					cityWard[index++]=cityward;
						System.out.println(" Ward Details are added ");
					}else 
					{
						System.out.println("Ward details are not available");
				}
			}else {
				System.out.println("Population should be greater than 5000");
			}
		}	
	}
  }
	
	public void displayWardDetails() {
		for (int i = 0; i < cityWard.length; i++) {
			if(cityWard!=null) {
				System.out.println("The Ward No is"+cityWard[i].getWardNo()+" "+"Ward Name is"+cityWard[i].getWardName()+" "+"Corporate Name is"+cityWard[i].getCorporateName()+" "+"Population"+cityWard[i].getPopulation()+"Area"+cityWard[i].getAreaInSqKiloMeters());
			}else 
			{
				System.out.println("Ward is not available");
			}
		}
	}
	
	public void searchCityWardByWardName(String name) {
		
		System.out.println("Searching the city by the wardName " + name);
		for (int i = 0; i < cityWard.length; i++) {
			if(cityWard[i]!=null) {
				if(cityWard[i].getWardName().equals(name)) {
					System.out.println("condition satisfied");
					
					System.out.println(cityWard[i].getWardNo()+" "+cityWard[i].getWardName()+" "+cityWard[i].getPopulation()+" "+cityWard[i].getCorporateName()+" "+cityWard[i].getAreaInSqKiloMeters());
			}else
		 {
			System.out.println("CityWard Details is not available of " + name);
		}
			}
		}
	}

	
	public void returningCorparatorNameByWardNo(int wardNo) {
		
		System.out.println("Returning the corparator name by ward No "+ wardNo);
		for (int i = 0; i < cityWard.length; i++) {
			if(cityWard!=null) {
			if(cityWard[i].getWardNo()==wardNo)	{
			
			System.out.println(cityWard[i].getCorporateName());
			}
			
		}else
		{
		
			System.out.println("But Corparator name is not present in ward no " + wardNo);
		}
 }
}
}

