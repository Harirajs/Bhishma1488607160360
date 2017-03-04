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
public class UserCardDetails  {
  
  
   
   private String userId = null;
  
   
   private String cardId = null;

  
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
    UserCardDetails userCardDetails = (UserCardDetails) o;
    return Objects.equals(userId, userCardDetails.userId) &&
        Objects.equals(cardId, userCardDetails.cardId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, cardId);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCardDetails {\n");
    
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  cardId: ").append(cardId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

