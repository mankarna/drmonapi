package uts.drmon.uts.drmon.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import uts.drmon.uts.drmon.model.ServerStatus;

public interface ServerStatusRepository extends  MongoRepository < ServerStatus ,String> {
//ServerStatus findbyHostName( String hostName );
	ServerStatus  findBy_id(ObjectId _id);
	ServerStatus  findByHostname(String hostname);
}
