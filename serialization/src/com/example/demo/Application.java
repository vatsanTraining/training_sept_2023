package com.example.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.example.demo.stereotype.Table;

public class Application {

	
	public static void serialize(CreditCard card, File fileName) throws IOException {
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
		
		
		out.writeObject(card);
		
	
		System.out.println("Object Saved");
				
		out.close();
		
	}
	
    public static void deSerialize( File fileName) throws IOException,ClassNotFoundException {
		
    	
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));

		CreditCard card = (CreditCard)in.readObject();
		
		System.out.println(card);
		
		in.close();
	}
	
	
	public static void main(String[] args) {

		
		CreditCard card = new CreditCard(203030, "ram", 450000, 231);
		
		try {
			
			serialize(card, new File("card.ser"));
			
			deSerialize(new File("card.ser"));
		}	
	     catch (Exception e) {
			e.printStackTrace();
		}
		
		
		      Class cls =  card.getClass();
		      
		      Table tableRef =  (Table)cls.getAnnotation(Table.class);
		      
		      String selectQry = "select * from "+tableRef.tableName();
		      
		      System.out.println(selectQry);
		      
		      System.out.println("Done");
		           
		
		
	}

}
