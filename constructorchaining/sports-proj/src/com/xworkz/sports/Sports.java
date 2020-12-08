package com.xworkz.sports;

import java.util.Date;

public class Sports {
private String name;
private int players;
private int types;
private int idNo;




public Sports() {
	// TODO Auto-generated constructor stub
}

public String getName()
{
	return name;
}

public void setName(String name)
{
	this.name=name;
}
public int getIdNo()
{
	return idNo;
}

public void setIdNo(int idNo)
{
	this.idNo=idNo;
}
public int getPlayers()
{
	return players;
}

public void setPlayers(int players)
{
	this.players=players;
}
public int getTypes()
{
	return types;
}

public void setTypes(int types)// seter method doesnt hv return type it is jst used to set the data n nly pass the parameters
{
	this.types=types;
}

}
