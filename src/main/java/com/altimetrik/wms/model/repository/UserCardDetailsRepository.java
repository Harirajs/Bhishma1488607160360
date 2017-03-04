package com.altimetrik.wms.model.repository;

import com.altimetrik.wms.model.*;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface UserCardDetailsRepository extends JpaRepository<UserCardDetails, Long>{

}



