package com.altimetrik.wms.api.service;

import com.altimetrik.wms.model.CardDetails;

import com.altimetrik.wms.exception.NotFoundException;
import java.util.List;
public interface CardDetailsApiService {
  
      List<CardDetails> findAllCardDetails()
      throws NotFoundException;
  
      CardDetails updateCardDetails(CardDetails cardDetails)
      throws NotFoundException;
  
      CardDetails addCardDetails(CardDetails cardDetails)
      throws NotFoundException;
  
      CardDetails findByIdCardDetails(String id)
      throws NotFoundException;
  
      void deleteCardDetails(String id)
      throws NotFoundException;
  
}
