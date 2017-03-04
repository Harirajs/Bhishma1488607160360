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
public class WalletCardDetails  {
  
  
   
   private String walletId = null;
  
   
   private String cardId = null;

  
  /**
   * {}
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
  public String getCardId() {
    return cardId;
  }
  public void setCardId(String cardId) {
    this.cardId = cardId;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletCardDetails walletCardDetails = (WalletCardDetails) o;
    return Objects.equals(walletId, walletCardDetails.walletId) &&
        Objects.equals(cardId, walletCardDetails.cardId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(walletId, cardId);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletCardDetails {\n");
    
    sb.append("  walletId: ").append(walletId).append("\n");
    sb.append("  cardId: ").append(cardId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

