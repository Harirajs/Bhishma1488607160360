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
public class UserDetails  {
  
  
   
  
  @Id
   private String userId = null;
  
   
   private String userName = null;
  
   
   private String userEmail = null;
  
   
   private String userPhone = null;
  
   
   private String shippingAddress = null;

  
  /**
   * {"primaryKey":true}
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
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

  
  /**
   * {}
   **/
  public String getUserEmail() {
    return userEmail;
  }
  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  
  /**
   * {}
   **/
  public String getUserPhone() {
    return userPhone;
  }
  public void setUserPhone(String userPhone) {
    this.userPhone = userPhone;
  }

  
  /**
   * {}
   **/
  public String getShippingAddress() {
    return shippingAddress;
  }
  public void setShippingAddress(String shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDetails userDetails = (UserDetails) o;
    return Objects.equals(userId, userDetails.userId) &&
        Objects.equals(userName, userDetails.userName) &&
        Objects.equals(userEmail, userDetails.userEmail) &&
        Objects.equals(userPhone, userDetails.userPhone) &&
        Objects.equals(shippingAddress, userDetails.shippingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, userName, userEmail, userPhone, shippingAddress);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDetails {\n");
    
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  userName: ").append(userName).append("\n");
    sb.append("  userEmail: ").append(userEmail).append("\n");
    sb.append("  userPhone: ").append(userPhone).append("\n");
    sb.append("  shippingAddress: ").append(shippingAddress).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

