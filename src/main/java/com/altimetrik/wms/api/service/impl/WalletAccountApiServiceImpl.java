package com.altimetrik.wms.api.service.impl;

import com.altimetrik.wms.api.service.*;
import com.altimetrik.wms.model.*;
import org.springframework.stereotype.Service;
import com.altimetrik.wms.model.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import com.altimetrik.wms.model.WalletAccount;

import java.util.List;
import com.altimetrik.wms.exception.NotFoundException;

@Service
public class WalletAccountApiServiceImpl implements WalletAccountApiService {
  	  @Autowired
  	  private WalletAccountRepository wallet_accountRepository ;
  	  
  
  
      @Override
      public List<WalletAccount> findAllWalletAccount()
      throws NotFoundException {
      
        
  		
  		
  			return wallet_accountRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public WalletAccount updateWalletAccount(WalletAccount walletAccount)
      throws NotFoundException {
      
         
        	return wallet_accountRepository.save(walletAccount);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public WalletAccount addWalletAccount(WalletAccount walletAccount)
      throws NotFoundException {
      
         
        	return wallet_accountRepository.save(walletAccount);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public WalletAccount findByIdWalletAccount(String id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return wallet_accountRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public void deleteWalletAccount(String id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
  		  wallet_accountRepository.delete(id);
  		
  		
  		
  }
  
}
