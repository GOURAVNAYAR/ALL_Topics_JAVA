package com.String;

public class Delete_Chartar {
	public static void main(String args []) {
		StringBuilder stringbuilder = new StringBuilder("Tonny"); 
		//stringbuilder.deleteCharAt(3);
		stringbuilder.delete(3, 5);  //3 Between 5
		System.out.println(stringbuilder);
	}
}
