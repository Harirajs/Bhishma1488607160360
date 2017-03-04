package com.altimetrik.wms.api.service;

import com.altimetrik.wms.model.UserCardDetails;

import com.altimetrik.wms.exception.NotFoundException;
import java.util.List;
public interface UserCardDetailsApiService {
  
      List<UserCardDetails> findAllUserCardDetails()
      throws NotFoundException;
  
      UserCardDetails updateUserCardDetails(UserCardDetails userCardDetails)
      throws NotFoundException;
  
      UserCardDetails addUserCardDetails(UserCardDetails userCardDetails)
      throws NotFoundException;
  
      UserCardDetails findByIdUserCardDetails(Long id)
      throws NotFoundException;
  
      void deleteUserCardDetails(Long id)
      throws NotFoundException;
  
}
