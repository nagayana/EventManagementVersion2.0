package com.project.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.project.dao.AttractionDaoImplement;
import com.project.pojo.Attraction;

public class AttractionServiceImp implements AttractionService {

	@Override
	public boolean insertAttraction(Attraction attraction) throws ClassNotFoundException, SQLException {
		AttractionDaoImplement attractionObj=new AttractionDaoImplement();
		return attractionObj.insertAttraction(attraction);
	}

	@Override
	public boolean deleteAttraction(int attractionId) throws ClassNotFoundException, SQLException {
		AttractionDaoImplement attractionObj=new AttractionDaoImplement();
		return attractionObj.deleteAttraction(attractionId);
	}

	@Override
	public ArrayList<Attraction> getAttractionList(int eventId) throws ClassNotFoundException, SQLException {
		AttractionDaoImplement attractionObj=new AttractionDaoImplement();
		return attractionObj.getEventAttractions(eventId);
	}

	@Override
	public boolean updateAttraction(int attractionId, Attraction attraction) throws ClassNotFoundException, SQLException {
		AttractionDaoImplement attractionObj=new AttractionDaoImplement();
		return attractionObj.updateAttraction(attractionId, attraction); 
	}

	@Override
	public Attraction getAttractionById(int attractionId) throws ClassNotFoundException, SQLException {
		AttractionDaoImplement attractionObj=new AttractionDaoImplement();
		return attractionObj.getAttractionById(attractionId);
	}

	@Override
	public boolean deleteAttractionByEvenetId(int eventId) throws ClassNotFoundException, SQLException {
		AttractionDaoImplement attractionObj=new AttractionDaoImplement();
		return attractionObj.deleteAttractionByEvenetId(eventId);
	}

	@Override
	public boolean updateAttrationCoordinator(int attractionId, String newName)
			throws SQLException, ClassNotFoundException {
		AttractionDaoImplement attractionObj=new AttractionDaoImplement();
		return attractionObj.updateAttrationCoordinator(attractionId, newName);
		
	}

	@Override
	public boolean updateAttractionDuration(int attractionId, int duration)
			throws SQLException, ClassNotFoundException {
		AttractionDaoImplement attractionObj=new AttractionDaoImplement();
		return attractionObj.updateAttractionDuration(attractionId,duration);
	}

	@Override
	public boolean updateAttractionPrice(int attractionId, int price) throws SQLException, ClassNotFoundException {
		
		AttractionDaoImplement attractionObj=new AttractionDaoImplement();
		return attractionObj.updateAttractionPrice(attractionId,price);
	}

	
	
}
