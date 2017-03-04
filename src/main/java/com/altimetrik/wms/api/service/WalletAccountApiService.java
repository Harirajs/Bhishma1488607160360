package com.altimetrik.wms.api.service;

import com.altimetrik.wms.model.WalletAccount;

import com.altimetrik.wms.exception.NotFoundException;
import java.util.List;
public interface WalletAccountApiService {
  
      List<WalletAccount> findAllWalletAccount()
      throws NotFoundException;
  
      WalletAccount updateWalletAccount(WalletAccount walletAccount)
      throws NotFoundException;
  
      WalletAccount addWalletAccount(WalletAccount walletAccount)
      throws NotFoundException;
  
      WalletAccount findByIdWalletAccount(String id)
      throws NotFoundException;
  
      void deleteWalletAccount(String id)
      throws NotFoundException;
  
}
