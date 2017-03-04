package com.altimetrik.wms.api.service.impl;

import com.altimetrik.wms.api.service.*;
import com.altimetrik.wms.model.*;
import org.springframework.stereotype.Service;
import com.altimetrik.wms.model.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import com.altimetrik.wms.model.UserDetails;

import java.util.List;
import com.altimetrik.wms.exception.NotFoundException;

@Service
public class UserDetailsApiServiceImpl implements UserDetailsApiService {
  	  @Autowired
  	  private UserDetailsRepository user_detailsRepository ;
  	  
  
  
      @Override
      public List<UserDetails> findAllUserDetails()
      throws NotFoundException {
      
        
  		
  		
  			return user_detailsRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public UserDetails updateUserDetails(UserDetails userDetails)
      throws NotFoundException {
      
         
        	return user_detailsRepository.save(userDetails);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public UserDetails addUserDetails(UserDetails userDetails)
      throws NotFoundException {
      
         
        	return user_detailsRepository.save(userDetails);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public UserDetails findByIdUserDetails(String id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return user_detailsRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public void deleteUserDetails(String id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
  		  user_detailsRepository.delete(id);
  		
  		
  		
  }
  
}
