package com.springboot.TRA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.TRA.Entity.Tourist;

@Repository
public interface Tourist_Repository extends JpaRepository<Tourist,Integer>{

}
