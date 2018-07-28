package com.project.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.project.pojo.Attraction;

public interface AttractionService {

	boolean insertAttraction(Attraction attraction) throws ClassNotFoundException, SQLException;

	boolean deleteAttraction(int attractionId) throws ClassNotFoundException, SQLException;

	ArrayList<Attraction> getAttractionList(int eventId) throws ClassNotFoundException, SQLException;

	boolean updateAttraction(int attractionId, Attraction attraction) throws ClassNotFoundException, SQLException;

	Attraction getAttractionById(int attractionId) throws ClassNotFoundException, SQLException;

	boolean deleteAttractionByEvenetId(int eventId) throws ClassNotFoundException, SQLException;

	boolean updateAttrationCoordinator(int attractionId, String newName) throws SQLException, ClassNotFoundException;

	boolean updateAttractionDuration(int attractionId, int duration) throws SQLException, ClassNotFoundException;

	boolean updateAttractionPrice(int attractionId,int price) throws SQLException,ClassNotFoundException;

}
