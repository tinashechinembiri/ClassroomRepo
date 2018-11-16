package com.classroom.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.classroom.business.BussinessReposity;
import com.qa.classroom.persistance.Classroom;

@Path ("/classroom")
public class Classinformation {
@Inject 
private BussinessReposity business; 
@Path ("/json")
@GET
@Produces({"application/json"})
public String findalldata()
{
	return business.findalldata(); 
}

@Path ("/json")
@POST 
@Produces({"application/json"}) 
public String ClassroomCreate (String account_details)
{
	return business.ClassroomCreate(account_details); 
}
@Path ("/json/{id}")
@PUT
@Produces({"application/json"})
public String classroomUpdated (String account_details, @PathParam("id")Long id )
{
	return business.classroomUpdated(account_details, id); 
}
@Path ("/json/{id}")
@DELETE
@Produces({"application/json"})
public String ClassroomRemove (@PathParam("id") Long id )
{
	return business.ClassroomRemove(id); 
}
}
