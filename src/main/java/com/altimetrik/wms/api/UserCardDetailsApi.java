package com.altimetrik.wms.api;

import com.altimetrik.wms.model.*;

import com.altimetrik.wms.api.service.UserCardDetailsApiService;

import com.altimetrik.wms.exception.NotFoundException;

import com.altimetrik.wms.model.UserCardDetails;

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
@RequestMapping(value = "/user_card_details", produces = {APPLICATION_JSON_VALUE})
public class UserCardDetailsApi {

   @Autowired
   private UserCardDetailsApiService service;
  

  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<UserCardDetails>> findAllUserCardDetails()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<UserCardDetails>>(service.findAllUserCardDetails(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< UserCardDetails> updateUserCardDetails(@RequestBody UserCardDetails userCardDetails
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<UserCardDetails>(service.updateUserCardDetails(userCardDetails), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< UserCardDetails> addUserCardDetails(@RequestBody UserCardDetails userCardDetails
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<UserCardDetails>(service.addUserCardDetails(userCardDetails), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< UserCardDetails> findByIdUserCardDetails(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<UserCardDetails>(service.findByIdUserCardDetails(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteUserCardDetails(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deleteUserCardDetails(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}
