package com.altimetrik.wms.api.service.impl;

import com.altimetrik.wms.api.service.*;
import com.altimetrik.wms.model.*;
import org.springframework.stereotype.Service;
import com.altimetrik.wms.model.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import com.altimetrik.wms.model.CardDetails;

import java.util.List;
import com.altimetrik.wms.exception.NotFoundException;

@Service
public class CardDetailsApiServiceImpl implements CardDetailsApiService {
  	  @Autowired
  	  private CardDetailsRepository card_detailsRepository ;
  	  
  
  
      @Override
      public List<CardDetails> findAllCardDetails()
      throws NotFoundException {
      
        
  		
  		
  			return card_detailsRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public CardDetails updateCardDetails(CardDetails cardDetails)
      throws NotFoundException {
      
         
        	return card_detailsRepository.save(cardDetails);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public CardDetails addCardDetails(CardDetails cardDetails)
      throws NotFoundException {
      
         
        	return card_detailsRepository.save(cardDetails);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public CardDetails findByIdCardDetails(String id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return card_detailsRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public void deleteCardDetails(String id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
  		  card_detailsRepository.delete(id);
  		
  		
  		
  }
  
}
