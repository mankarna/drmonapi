package uts.drmon.uts.drmon.repository;

import uts.drmon.uts.drmon.model.Login;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

//import uts.drmon.uts.drmon.model.ServerStatus;

public interface LoginRepository extends  MongoRepository < Login ,String> {
//ServerStatus findbyHostName( String hostName );
	//ServerStatus  findBy_id(ObjectId _id);
	Login  findByUsernameAndPassword(String hostname,String password);
}