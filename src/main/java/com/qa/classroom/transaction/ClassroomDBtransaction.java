package com.qa.classroom.transaction;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.classroom.util.JSONUtil;
import com.qa.classroom.persistance.Classroom;


import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

@Default

@Transactional(SUPPORTS)
public class ClassroomDBtransaction implements ClassroomReposity {
	@Inject
	JSONUtil util;
	@PersistenceContext(unitName ="primary")
	private EntityManager manager; 

	public Classroom findmemebers (Long id)
	{
		return manager.find(Classroom.class, id ); 
	}
	public String findalldata()
	{
		TypedQuery<Classroom> query = manager.createQuery("SELECT a FROM Classroom a ", Classroom.class); 
		return util.getJSONForObject(query.getResultList()); 
	}
	
	@Transactional(REQUIRED)
	public String ClassroomCreate (String account_details)
	{
		Classroom create_Data = util.getObjectForJSON(account_details, Classroom.class); 
		manager.persist(create_Data);
		return account_details;
	}
	@Transactional(REQUIRED)
	public String classroomUpdated (String account_details, Long id )
	{
		Classroom updateaccount  = util.getObjectForJSON(account_details, Classroom.class); 
		Classroom a = findmemebers(id);
		
		if (account_details !=null)
		{
			a = updateaccount; 
			manager.merge(a);
		}
		
		return account_details ; 
		
	}
	@Transactional(REQUIRED)
	public String ClassroomRemove (Long id )
	{
		Classroom delete = findmemebers (id); 
		if (delete != null)
		{
			manager.remove(delete);
		}
		return "{\\\"message\\\":}\\\"succesfully removed\\\"";
		
	}

	

}
