package com.altimetrik.wms.api;

import com.altimetrik.wms.model.*;

import com.altimetrik.wms.api.service.WalletCardDetailsApiService;

import com.altimetrik.wms.exception.NotFoundException;

import com.altimetrik.wms.model.WalletCardDetails;

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
@RequestMapping(value = "/wallet_card_details", produces = {APPLICATION_JSON_VALUE})
public class WalletCardDetailsApi {

   @Autowired
   private WalletCardDetailsApiService service;
  

  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<WalletCardDetails>> findAllWalletCardDetails()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<WalletCardDetails>>(service.findAllWalletCardDetails(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< WalletCardDetails> updateWalletCardDetails(@RequestBody WalletCardDetails walletCardDetails
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<WalletCardDetails>(service.updateWalletCardDetails(walletCardDetails), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< WalletCardDetails> addWalletCardDetails(@RequestBody WalletCardDetails walletCardDetails
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<WalletCardDetails>(service.addWalletCardDetails(walletCardDetails), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< WalletCardDetails> findByIdWalletCardDetails(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<WalletCardDetails>(service.findByIdWalletCardDetails(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteWalletCardDetails(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deleteWalletCardDetails(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}
