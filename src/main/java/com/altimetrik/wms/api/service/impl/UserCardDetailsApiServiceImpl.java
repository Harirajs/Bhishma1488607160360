package com.altimetrik.wms.api.service.impl;

import com.altimetrik.wms.api.service.*;
import com.altimetrik.wms.model.*;
import org.springframework.stereotype.Service;
import com.altimetrik.wms.model.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import com.altimetrik.wms.model.UserCardDetails;

import java.util.List;
import com.altimetrik.wms.exception.NotFoundException;

@Service
public class UserCardDetailsApiServiceImpl implements UserCardDetailsApiService {
  	  @Autowired
  	  private UserCardDetailsRepository user_card_detailsRepository ;
  	  
  
  
      @Override
      public List<UserCardDetails> findAllUserCardDetails()
      throws NotFoundException {
      
        
  		
  		
  			return user_card_detailsRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public UserCardDetails updateUserCardDetails(UserCardDetails userCardDetails)
      throws NotFoundException {
      
         
        	return user_card_detailsRepository.save(userCardDetails);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public UserCardDetails addUserCardDetails(UserCardDetails userCardDetails)
      throws NotFoundException {
      
         
        	return user_card_detailsRepository.save(userCardDetails);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public UserCardDetails findByIdUserCardDetails(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return user_card_detailsRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public void deleteUserCardDetails(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
  		  user_card_detailsRepository.delete(id);
  		
  		
  		
  }
  
}
