package uts.drmon.uts.drmon.controller;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import uts.drmon.uts.drmon.model.*;
import uts.drmon.uts.drmon.repository.ServerStatusRepository;

@RestController
//@RequestMapping("/serverstatus")
public class ServerStatusController {
@Autowired
private ServerStatusRepository repository;
@RequestMapping (value="/gethealthcheck",method=RequestMethod.GET)
public List<ServerStatus> getAllServerstatus(){
	return repository.findAll();
}
@RequestMapping(value = "/{hostname}", method = RequestMethod.GET)
public ServerStatus getServerStatusByHostname(@PathVariable("hostname") String hostname ) {
  return repository.findByHostname(hostname);
}

@RequestMapping(value = "/{hostname}", method = RequestMethod.PUT)
public void modifyServerStatus(@PathVariable("hostname") String hostname, @Valid @RequestBody ServerStatus serverstatus) {
  serverstatus.setHostname(hostname);
  //serverstatus.setStatus(status);
  repository.save(serverstatus);
}
@RequestMapping(value = "/", method = RequestMethod.POST)
public ServerStatus createServerStatus(@Valid @RequestBody ServerStatus serverstatus) {
	serverstatus.set_id(ObjectId.get());
  repository.save(serverstatus);
  return serverstatus;
}
}