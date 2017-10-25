package com.target.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.target.entity.GeneralInfo;

@Repository
public interface GeneralInfoRepository extends CrudRepository<GeneralInfo, Long>{

}
