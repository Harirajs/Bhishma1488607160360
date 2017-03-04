package com.altimetrik.wms.model;



import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;




@Entity
public class WalletAccount  {
  
  
   
  
  @Id
   private String walletId = null;
  
   
   private String userId = null;
  
   
   private Integer accountStatus = null;

  
  /**
   * {"primaryKey":true}
   **/
  public String getWalletId() {
    return walletId;
  }
  public void setWalletId(String walletId) {
    this.walletId = walletId;
  }

  
  /**
   * {}
   **/
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * {}
   **/
  public Integer getAccountStatus() {
    return accountStatus;
  }
  public void setAccountStatus(Integer accountStatus) {
    this.accountStatus = accountStatus;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletAccount walletAccount = (WalletAccount) o;
    return Objects.equals(walletId, walletAccount.walletId) &&
        Objects.equals(userId, walletAccount.userId) &&
        Objects.equals(accountStatus, walletAccount.accountStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(walletId, userId, accountStatus);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletAccount {\n");
    
    sb.append("  walletId: ").append(walletId).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  accountStatus: ").append(accountStatus).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

