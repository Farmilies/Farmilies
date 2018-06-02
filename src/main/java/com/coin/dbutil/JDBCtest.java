package com.coin.dbutil;

import java.sql.Date;
import java.util.List;

import com.coin.dao.ContractDAO;
import com.coin.dao.LocationDAO;
import com.coin.dao.PictureDAO;
import com.coin.dao.UserDAO;
import com.coin.dao.UserGroupDAO;
import com.coin.dao.WorkDAO;
import com.coin.vo.ContractVO;
import com.coin.vo.PictureVO;
import com.coin.vo.UserGroupVO;
import com.coin.vo.UserVO;
import com.coin.vo.WorkVO;

public class JDBCtest {
	
	
	
	public static void main(String[] args) {
		ContractDAO contractDao = new ContractDAO();
		LocationDAO locationDao = new LocationDAO();
		PictureDAO pictureDao = new PictureDAO();
		UserDAO userDao = new UserDAO();
		UserGroupDAO userGroupDao = new UserGroupDAO();
		WorkDAO workDao = new WorkDAO();
		
		
		
		/*
		getById functions return null if no corresponding record
		
		userDao.getById(String id);
		workDao.getById(int id);
		contractDao.getById(int id);
		locationDao.getById(int id);
		pictureDao.getById(int id);
		*/	
		

		
		System.out.println("sgwe");
		
		
		
		
		
	}
}
