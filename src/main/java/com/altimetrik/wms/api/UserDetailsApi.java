package com.altimetrik.wms.api;

import com.altimetrik.wms.model.*;

import com.altimetrik.wms.api.service.UserDetailsApiService;

import com.altimetrik.wms.exception.NotFoundException;

import com.altimetrik.wms.model.UserDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/user_details", produces = {APPLICATION_JSON_VALUE})
public class UserDetailsApi {

   @Autowired
   private UserDetailsApiService service;
  

  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<UserDetails>> findAllUserDetails()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<UserDetails>>(service.findAllUserDetails(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< UserDetails> updateUserDetails(@RequestBody UserDetails userDetails
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<UserDetails>(service.updateUserDetails(userDetails), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< UserDetails> addUserDetails(@RequestBody UserDetails userDetails
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<UserDetails>(service.addUserDetails(userDetails), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< UserDetails> findByIdUserDetails(@PathVariable("id") String id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<UserDetails>(service.findByIdUserDetails(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteUserDetails(@PathVariable("id") String id
)
      throws NotFoundException {
        
       	  service.deleteUserDetails(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}
