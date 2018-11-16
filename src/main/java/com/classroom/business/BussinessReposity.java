package com.classroom.business;

import com.qa.classroom.persistance.Classroom;

public interface  BussinessReposity {
	Classroom findmemebers(Long id);
	String findalldata(); 
	String ClassroomCreate (String account_details);
	String classroomUpdated (String account_details, Long id );
	String ClassroomRemove (Long id );


}
