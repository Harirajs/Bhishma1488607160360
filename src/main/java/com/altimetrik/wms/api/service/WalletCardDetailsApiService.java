package com.altimetrik.wms.api.service;

import com.altimetrik.wms.model.WalletCardDetails;

import com.altimetrik.wms.exception.NotFoundException;
import java.util.List;
public interface WalletCardDetailsApiService {
  
      List<WalletCardDetails> findAllWalletCardDetails()
      throws NotFoundException;
  
      WalletCardDetails updateWalletCardDetails(WalletCardDetails walletCardDetails)
      throws NotFoundException;
  
      WalletCardDetails addWalletCardDetails(WalletCardDetails walletCardDetails)
      throws NotFoundException;
  
      WalletCardDetails findByIdWalletCardDetails(Long id)
      throws NotFoundException;
  
      void deleteWalletCardDetails(Long id)
      throws NotFoundException;
  
}
