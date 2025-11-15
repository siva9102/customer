package com.GST.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.GST.Entity.GSTEntity;



public interface GSTRepository extends JpaRepository <GSTEntity,Integer> {
	@Query(value = "SELECT taxpercentage FROM gstdb.gsttable WHERE hsncode=?",nativeQuery=true)
	public Integer get(Integer a);
}
