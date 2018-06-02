package com.coin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.coin.dbutil.JDBCutil;
import com.coin.vo.UserGroupVO;
import com.coin.vo.UserVO;

public class UserGroupDAO {
	static final String table_name = "user_groups";
	static final String[] columnNames = {
			"id",
			"name",
			"update_at",
			"create_at"
	};
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
	
	public List<UserGroupVO> getListBy(String type, String val , boolean like) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		//int result = 0;
		List<UserGroupVO> list  = new ArrayList<>();
		
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
				UserGroupVO vo = new UserGroupVO();
				vo.setId(rs.getInt(columnNames[0]));
				vo.setName(rs.getString(columnNames[1]));
				vo.setCreate_at(rs.getDate(columnNames[2]));
				vo.setUpdate_at(rs.getDate(columnNames[3]));
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
	
}
