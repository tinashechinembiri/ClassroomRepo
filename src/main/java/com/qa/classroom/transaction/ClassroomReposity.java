package com.qa.classroom.transaction;

import com.qa.classroom.persistance.Classroom;

public interface ClassroomReposity {
	Classroom findmemebers(Long id);
	String findalldata(); 
	String ClassroomCreate (String account_details);
	String classroomUpdated (Classroom account_details, Long id );
	String ClassroomRemove (Long id );

}
