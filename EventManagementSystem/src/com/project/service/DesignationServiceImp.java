package com.project.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.project.dao.DesignationDao;
import com.project.dao.DesignationDaoImp;
import com.project.pojo.Designation;
import com.project.pojo.GuestList;

import sun.security.krb5.internal.crypto.Des;

public class DesignationServiceImp implements DesignationService {

	

	public ArrayList<Designation> getAllDesignations(int eventId)throws ClassNotFoundException, SQLException {
		DesignationDao designationdao = new DesignationDaoImp();
		return designationdao.getDesignationList(eventId);
	}
	
	public ArrayList<Designation> getDesignationList() throws ClassNotFoundException, SQLException{
		return new DesignationDaoImp().getAllDesignations();
	}
}
