
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
import uts.drmon.uts.drmon.repository.LoginRepository;


@RestController
//@RequestMapping("/login")
public class LoginController {
 
@Autowired
private LoginRepository repository;
@RequestMapping (value="/getAllUsers",method=RequestMethod.GET)
public List<Login> getAllLogin(){
	return repository.findAll();
}
@RequestMapping(value = "/{username}/{password}", method = RequestMethod.GET)
public Login getLoginByUsernameAndPassword(@PathVariable("username") String username ,@PathVariable("password") String password ) {
  return repository.findByUsernameAndPassword(username,password);
}

@RequestMapping(value = "/{username}", method = RequestMethod.PUT)
public void modifylogin(@PathVariable("username") String username, @Valid @RequestBody Login login) {
  login.setUsername(username);
  
 
  repository.save(login);
}
@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
public Login createlogin(@Valid @RequestBody Login login) {
	
  repository.save(login);
  return login;
}
}