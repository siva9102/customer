package com.MarkSheet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MarkSheet.Entity.MarkSheetEntity;

public interface MarkSheetRepository extends JpaRepository<MarkSheetEntity,Integer>  {
	
}
