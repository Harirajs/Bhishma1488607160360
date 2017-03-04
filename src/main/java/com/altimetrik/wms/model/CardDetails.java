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
public class CardDetails  {
  
  
   
  
  @Id
   private String cardId = null;
  
   
   private String cardNumber = null;
  
   
   private String userId = null;
  
   
   private Integer cardCvv = null;
  
   
   private Integer cardPin = null;
  
   
   private String validFrom = null;
  
   
   private String validThru = null;
  
   
   private String cardProvider = null;

  
  /**
   * {"primaryKey":true}
   **/
  public String getCardId() {
    return cardId;
  }
  public void setCardId(String cardId) {
    this.cardId = cardId;
  }

  
  /**
   * {}
   **/
  public String getCardNumber() {
    return cardNumber;
  }
  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
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
  public Integer getCardCvv() {
    return cardCvv;
  }
  public void setCardCvv(Integer cardCvv) {
    this.cardCvv = cardCvv;
  }

  
  /**
   * {}
   **/
  public Integer getCardPin() {
    return cardPin;
  }
  public void setCardPin(Integer cardPin) {
    this.cardPin = cardPin;
  }

  
  /**
   * {}
   **/
  public String getValidFrom() {
    return validFrom;
  }
  public void setValidFrom(String validFrom) {
    this.validFrom = validFrom;
  }

  
  /**
   * {}
   **/
  public String getValidThru() {
    return validThru;
  }
  public void setValidThru(String validThru) {
    this.validThru = validThru;
  }

  
  /**
   * {}
   **/
  public String getCardProvider() {
    return cardProvider;
  }
  public void setCardProvider(String cardProvider) {
    this.cardProvider = cardProvider;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardDetails cardDetails = (CardDetails) o;
    return Objects.equals(cardId, cardDetails.cardId) &&
        Objects.equals(cardNumber, cardDetails.cardNumber) &&
        Objects.equals(userId, cardDetails.userId) &&
        Objects.equals(cardCvv, cardDetails.cardCvv) &&
        Objects.equals(cardPin, cardDetails.cardPin) &&
        Objects.equals(validFrom, cardDetails.validFrom) &&
        Objects.equals(validThru, cardDetails.validThru) &&
        Objects.equals(cardProvider, cardDetails.cardProvider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardId, cardNumber, userId, cardCvv, cardPin, validFrom, validThru, cardProvider);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardDetails {\n");
    
    sb.append("  cardId: ").append(cardId).append("\n");
    sb.append("  cardNumber: ").append(cardNumber).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  cardCvv: ").append(cardCvv).append("\n");
    sb.append("  cardPin: ").append(cardPin).append("\n");
    sb.append("  validFrom: ").append(validFrom).append("\n");
    sb.append("  validThru: ").append(validThru).append("\n");
    sb.append("  cardProvider: ").append(cardProvider).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

