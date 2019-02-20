package com.linjb.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PoliticalStatusRepository extends JpaRepository<PoliticalStatus, Long>{

	public PoliticalStatus findByPoliticalStatusId(Integer politicalStatusId);
	
	public PoliticalStatus findByPoliticalStatusName(String politicalStatusName);
	
	@Query("select politicalStatus from PoliticalStatus politicalStatus where politicalStatus.politicalStatusName like %:nn")
	List<PoliticalStatus> fuzzyQueryByPoliticalStatusName(@Param("nn") String politicalStatusName);
}
