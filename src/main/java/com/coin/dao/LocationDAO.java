package com.coin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.coin.dbutil.JDBCutil;
import com.coin.vo.ContractVO;
import com.coin.vo.LocationVO;
import com.coin.vo.UserVO;

public class LocationDAO {
	static final String table_name = "locations";
	static final String[] columnNames = {
			"id",
			"address_name",
			"address_type",
			"x",
			"y",
			"region_address",
			"road_address"
	};
	
	public LocationVO getById(int id) {
		return getById_private(id);
	}
	public int delete(LocationVO vo) {
		return delete_private(vo.getId());
	}
	public int delete(int id) {
		return delete_private(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static final String insert_values;
	static {
		StringBuilder sb = new StringBuilder();
		
		sb.append("(");
		for(int i = 0 ; i < columnNames.length ; i++) {
			sb.append(columnNames[i]);
			if(i != columnNames.length -1) {
				sb.append(",");
			}
		}
		sb.append(") values (");
		for(int i = 0 ; i < columnNames.length ; i++) {
			sb.append("?");
			if(i != columnNames.length -1) {
				sb.append(",");
			}
		}
		sb.append(")");
		
		insert_values = sb.toString();
	}
	
	private List<LocationVO> getListBy(String type, String val, boolean like){
		if(like) {
			return getListBy_private(type, val, like);
		}else {
			return getListBy_private(type,"'"+val+"'",like);
		}
	}
	private List<LocationVO> getListBy(String type, double val){
		return getListBy_private(type, Double.toString(val), false);
	}
	private List<LocationVO> getListBy(String type, int val){
		return getListBy_private(type, Integer.toString(val), false);
	}
	private List<LocationVO> getListBy_private(String type, String val , boolean like) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		//int result = 0;
		List<LocationVO> list  = new ArrayList<>();
		
		try {
			con = JDBCutil.getConnection();
			
			String likeOrEquals = null;
			if(like) {
				likeOrEquals = " like '%"+val+"%'";
			}else {
				likeOrEquals = "="+val;				
			}
			
			
			ps = con.prepareStatement("select * from "
										+table_name
										+" where " 
										+ type 
										+likeOrEquals);
			
			
										
			//result = ps.executeUpdate();
			rs = ps.executeQuery();
		
			
			while(rs.next()) {
				LocationVO vo = new LocationVO();
				vo.setId(rs.getInt(columnNames[0]));
				vo.setAddress_name(rs.getString(columnNames[1]));
				vo.setAddress_type(rs.getString(columnNames[2]));
				vo.setX(rs.getDouble(columnNames[3]));
				vo.setY(rs.getDouble(columnNames[4]));
				vo.setRegion_address(rs.getString(columnNames[5]));
				vo.setRoad_address(rs.getString(columnNames[6]));
				list.add(vo);
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCutil.close(con, ps, rs);
		}
		return list;
	}
	
	
	private int insert(LocationVO vo) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int result = 0;
		//List<UserVO> list  = new ArrayList<>();
		
		try {
			con = JDBCutil.getConnection();
			
			
			ps = con.prepareStatement("insert into "
										+table_name
										+ insert_values);
			
			int count = 1;
			ps.setInt(count++,vo.getId());
			ps.setString(count++,vo.getAddress_name());
			ps.setString(count++,vo.getAddress_type());
			ps.setDouble(count++,vo.getX());
			ps.setDouble(count++,vo.getY());
			ps.setString(count++,vo.getRegion_address());
			ps.setString(count++,vo.getRoad_address());
			
										
			result = ps.executeUpdate();
			//rs = ps.executeQuery();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCutil.close(con, ps, rs);
		}
		return result;
	}
	private int delete_private(LocationVO vo) {
		return delete(vo.getId());
	}
	private int delete_private(int id) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int result = 0;
		//List<UserVO> list  = new ArrayList<>();
		
		try {
			con = JDBCutil.getConnection();
			
			
			ps = con.prepareStatement("delete from "
										+table_name
										+ "where id=?");
			
			int count = 1;
			ps.setInt(count++,id);
			
										
			result = ps.executeUpdate();
			//rs = ps.executeQuery();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCutil.close(con, ps, rs);
		}
		return result;
	}
	private int update(int id,String type , String val) {
		return update_private(id,type, new StringBuilder().append("'").append(val).append("'").toString());
	}
	private int update(int id,String type , int val) {
		return update_private(id,type, Integer.toString(val));
	}
	private int update(int id,String type , double val) {
		return update_private(id,type, Double.toString(val));
	}
	private int update_private(int id,String type, String val) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int result = 0;
		//List<UserVO> list  = new ArrayList<>();
		
		try {
			con = JDBCutil.getConnection();
			
			
			ps = con.prepareStatement("update "
										+table_name
										+" set "
										+ type
										+" = "
										+val
										+ "where id=?");		
			int count = 1;
			ps.setInt(count++,id);
			
										
			result = ps.executeUpdate();
			//rs = ps.executeQuery();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCutil.close(con, ps, rs);
		}
		return result;
	}
	
	
	private LocationVO getById_private(int id) {
		List<LocationVO> list = getListBy("id",Integer.toString(id),false);
		if(!list.isEmpty()) {
			return list.get(0);
		}else {
			return null;
		}
	}
	
}
