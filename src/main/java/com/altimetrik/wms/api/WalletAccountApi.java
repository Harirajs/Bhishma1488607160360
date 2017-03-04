package com.altimetrik.wms.api;

import com.altimetrik.wms.model.*;

import com.altimetrik.wms.api.service.WalletAccountApiService;

import com.altimetrik.wms.exception.NotFoundException;

import com.altimetrik.wms.model.WalletAccount;

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
@RequestMapping(value = "/wallet_account", produces = {APPLICATION_JSON_VALUE})
public class WalletAccountApi {

   @Autowired
   private WalletAccountApiService service;
  

  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<WalletAccount>> findAllWalletAccount()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<WalletAccount>>(service.findAllWalletAccount(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< WalletAccount> updateWalletAccount(@RequestBody WalletAccount walletAccount
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<WalletAccount>(service.updateWalletAccount(walletAccount), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< WalletAccount> addWalletAccount(@RequestBody WalletAccount walletAccount
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<WalletAccount>(service.addWalletAccount(walletAccount), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< WalletAccount> findByIdWalletAccount(@PathVariable("id") String id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<WalletAccount>(service.findByIdWalletAccount(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteWalletAccount(@PathVariable("id") String id
)
      throws NotFoundException {
        
       	  service.deleteWalletAccount(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}
