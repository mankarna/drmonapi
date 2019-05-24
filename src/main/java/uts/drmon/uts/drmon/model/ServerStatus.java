package uts.drmon.uts.drmon.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
@Document(collection = "serverstatus")
public class ServerStatus {
@Field("hostname")
@NotEmpty(message = "hostname can not be empty.")
@Size(max = 100, message = " hostname can not be more than 100 characters.")
	public String hostname;
@Field("status")
@NotEmpty(message = "status can not be empty.")
@Size(max = 100, message = "hostname can not be more than 100 characters.")
public String status;
@Id
public ObjectId _id;

public ObjectId get_id() {
	return _id;
}
public void set_id(ObjectId _id) {
	this._id = _id;
}
public String getHostname() {
	return hostname;
}
public void setHostname(String hostname) {
	this.hostname = hostname;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}

public ServerStatus() {

}
public ServerStatus(String hostname, String status, ObjectId _id) {
	
	this.hostname = hostname;
	this.status = status;
	this._id = _id;
	
}


}
