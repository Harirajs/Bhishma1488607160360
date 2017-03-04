package com.altimetrik.wms.api;

import com.altimetrik.wms.model.*;

import com.altimetrik.wms.api.service.CardDetailsApiService;

import com.altimetrik.wms.exception.NotFoundException;

import com.altimetrik.wms.model.CardDetails;

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
@RequestMapping(value = "/card_details", produces = {APPLICATION_JSON_VALUE})
public class CardDetailsApi {

   @Autowired
   private CardDetailsApiService service;
  

  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<CardDetails>> findAllCardDetails()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<CardDetails>>(service.findAllCardDetails(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< CardDetails> updateCardDetails(@RequestBody CardDetails cardDetails
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<CardDetails>(service.updateCardDetails(cardDetails), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< CardDetails> addCardDetails(@RequestBody CardDetails cardDetails
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<CardDetails>(service.addCardDetails(cardDetails), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< CardDetails> findByIdCardDetails(@PathVariable("id") String id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<CardDetails>(service.findByIdCardDetails(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteCardDetails(@PathVariable("id") String id
)
      throws NotFoundException {
        
       	  service.deleteCardDetails(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}
