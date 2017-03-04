package com.altimetrik.wms.api.service;

import com.altimetrik.wms.model.UserDetails;

import com.altimetrik.wms.exception.NotFoundException;
import java.util.List;
public interface UserDetailsApiService {
  
      List<UserDetails> findAllUserDetails()
      throws NotFoundException;
  
      UserDetails updateUserDetails(UserDetails userDetails)
      throws NotFoundException;
  
      UserDetails addUserDetails(UserDetails userDetails)
      throws NotFoundException;
  
      UserDetails findByIdUserDetails(String id)
      throws NotFoundException;
  
      void deleteUserDetails(String id)
      throws NotFoundException;
  
}
