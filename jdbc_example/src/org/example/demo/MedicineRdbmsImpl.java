package org.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.example.demo.ifaces.MedicineRepository;

import com.example.exceptions.ElementNotFoundException;
import com.example.ifaces.CrudRepository;
import com.training.exceptions.RangeCheckException;
import com.training.model.Medicine;

import java.sql.*;

public class MedicineRdbmsImpl implements MedicineRepository{
	
	
	private String  INSERT ="insert into medicine values(?,?,?,?,?)";
	
	private String  SELECT ="select * from  medicine";
	
	private String  SELECTBYID ="select * from  medicine where id =?";

	private String REMOVE= "delete from medicine where id =?";
	
	private String UPDATE = "update medicine set medicine_name =? ,generic_name=?,"
			+ "rate_per_unit=?,prescription_required=? where id =?";
	
	

	private Connection con;
	
		
	public MedicineRdbmsImpl(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public boolean add(Medicine obj)  {
		
		int rowAffected =0;
		
		try {
			if(this.findById(obj.getId())==null) {
				
				try(PreparedStatement pstmt = con.prepareStatement(INSERT)){
					
					pstmt.setInt(1, obj.getId());
					pstmt.setString(2, obj.getMedicineName());
					pstmt.setString(3, obj.getGenericName());
					pstmt.setDouble(4, obj.getRatePerUnit());
					pstmt.setBoolean(5, obj.isPrescriptionRequired());
					
					rowAffected = pstmt.executeUpdate();
				
					
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}else {
			
				
				try(PreparedStatement pstmt = con.prepareStatement(UPDATE)){
					
					pstmt.setString(1, obj.getMedicineName());
					pstmt.setString(2, obj.getGenericName());
					pstmt.setDouble(3, obj.getRatePerUnit());
					pstmt.setBoolean(4, obj.isPrescriptionRequired());
					
					pstmt.setInt(5, obj.getId());

					rowAffected = pstmt.executeUpdate();
				
					
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		} catch (ElementNotFoundException e1) {
			e1.printStackTrace();
		}
				return rowAffected==1?true:false;

	}

	@Override
	
	public List<Medicine> findAll() {
		
		List<Medicine> list = new ArrayList<>();
		try(PreparedStatement pstmt = con.prepareStatement(SELECT)){
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				rowMapper(rs);
			}
			
		}catch(SQLException | RangeCheckException e) {
			
			e.printStackTrace();
		}
		return list;
	}

	private Medicine rowMapper( ResultSet rs) throws SQLException, RangeCheckException {
		
		int id = rs.getInt("id");
		String medicineName = rs.getString("medicine_name");
		String genericName = rs.getString("generic_name");
		double ratePerUnit = rs.getDouble("rate_per_unit");
		boolean prescriptionRequired = rs.getBoolean("prescription_required");
		
		Medicine obj = new Medicine(id, medicineName, genericName, ratePerUnit, prescriptionRequired);
		
		return obj;
	}

	@Override
	public Medicine findById(int id) throws ElementNotFoundException {

		Medicine found = null;
		
		try (PreparedStatement pstmt = con.prepareStatement(SELECTBYID)){
			
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				found =rowMapper(rs);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return found;
	}

	@Override
	public int removeById(int id) throws ElementNotFoundException {

		int rowDeleted = 0;
		
		try(PreparedStatement pstmt = con.prepareStatement(REMOVE)) {
			
			pstmt.setInt(1, id);
			
			rowDeleted = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return rowDeleted;
	}

}
