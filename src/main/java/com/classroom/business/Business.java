package com.classroom.business;

import javax.inject.Inject;

import com.qa.classroom.persistance.Classroom;
import com.qa.classroom.transaction.ClassroomReposity;

public class Business implements BussinessReposity {
	@Inject 
	private ClassroomReposity class_room;
	
	public Classroom findmemebers(Long id) 
	
	{
		return class_room.findmemebers(id); 
	}
	public String findalldata()
	{
		return class_room.findalldata(); 
	}
	public String ClassroomCreate (String account_details)
	{
		return class_room.ClassroomCreate(account_details); 
	}
	public String classroomUpdated (Classroom account_details, Long id )
	{
		return class_room.classroomUpdated(account_details, id); 
	}
	public String ClassroomRemove (Long id ) 
	{
		return class_room.ClassroomRemove(id); 
	}
	

}
