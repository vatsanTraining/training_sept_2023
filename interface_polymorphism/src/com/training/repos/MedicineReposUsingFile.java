package com.training.repos;

import com.training.exceptions.RangeCheckException;
import com.training.ifaces.CrudRepository;
import com.training.model.Medicine;
import java.io.*;

public class MedicineReposUsingFile implements CrudRepository {
	
	
	private File file;

	public MedicineReposUsingFile() {
		super();

		this.file = new File("Data.txt");
	}

	public MedicineReposUsingFile(File file) {
		super();
		this.file = file;
	}

	@Override
	public boolean add(Medicine obj) {
		
		boolean result = false;
		// try with resource
		try(PrintWriter writer = new PrintWriter(new FileWriter(file, true))) {
			
			writer.println(obj);
			
			result = true;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Medicine[] findAll() {
		
		Medicine[] medicineList = new Medicine[100];
		
		try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
			
			String line =null;
			
			int i =0;
			while((line=reader.readLine())!=null) {
				
			String[] values = line.split(",");
				 
			
			Medicine obj = new Medicine(
					     Integer.parseInt(values[0]), 
					     values[1], values[2],
					     Double.parseDouble(values[3]),
					     Boolean.parseBoolean(values[4]));
			
			 medicineList[i]=obj;
			 
			  i++;
				
			}
			
			
		} catch (IOException | RangeCheckException e) {
			e.printStackTrace();
		}
		
		
		return medicineList;
	}

	@Override
	public Medicine findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
