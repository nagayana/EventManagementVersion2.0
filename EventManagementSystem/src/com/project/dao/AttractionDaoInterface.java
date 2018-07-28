package com.project.dao;
import com.project.pojo.*;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public interface AttractionDaoInterface {
	
	boolean insertAttraction(Attraction attraction) throws SQLException, ClassNotFoundException;
	boolean deleteAttraction(int attractionId) throws SQLException, ClassNotFoundException;
	boolean updateAttraction(int attractionId,Attraction attraction) throws SQLException, ClassNotFoundException;
	ArrayList<Attraction> getEventAttractions(int eventId) throws SQLException, ClassNotFoundException;
    Attraction getAttractionById(int attractionId) throws SQLException, ClassNotFoundException;
    boolean deleteAttractionByEvenetId(int attractionId)throws ClassNotFoundException, SQLException;
    boolean updateAttrationCoordinator(int attractionId,String newName) throws SQLException,ClassNotFoundException;
	boolean updateAttractionDuration(int attractionId,int duration) throws SQLException,ClassNotFoundException;
	boolean updateAttractionPrice(int attractionId,int price) throws SQLException,ClassNotFoundException;
	
}
