package com.altimetrik.wms.api.service.impl;

import com.altimetrik.wms.api.service.*;
import com.altimetrik.wms.model.*;
import org.springframework.stereotype.Service;
import com.altimetrik.wms.model.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import com.altimetrik.wms.model.WalletCardDetails;

import java.util.List;
import com.altimetrik.wms.exception.NotFoundException;

@Service
public class WalletCardDetailsApiServiceImpl implements WalletCardDetailsApiService {
  	  @Autowired
  	  private WalletCardDetailsRepository wallet_card_detailsRepository ;
  	  
  
  
      @Override
      public List<WalletCardDetails> findAllWalletCardDetails()
      throws NotFoundException {
      
        
  		
  		
  			return wallet_card_detailsRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public WalletCardDetails updateWalletCardDetails(WalletCardDetails walletCardDetails)
      throws NotFoundException {
      
         
        	return wallet_card_detailsRepository.save(walletCardDetails);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public WalletCardDetails addWalletCardDetails(WalletCardDetails walletCardDetails)
      throws NotFoundException {
      
         
        	return wallet_card_detailsRepository.save(walletCardDetails);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public WalletCardDetails findByIdWalletCardDetails(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return wallet_card_detailsRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public void deleteWalletCardDetails(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
  		  wallet_card_detailsRepository.delete(id);
  		
  		
  		
  }
  
}
