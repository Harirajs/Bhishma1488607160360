package com.altimetrik.wms.model.repository;

import com.altimetrik.wms.model.*;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface CardDetailsRepository extends JpaRepository<CardDetails, String>{

}



