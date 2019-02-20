package com.linjb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
  * 政治面貌表模型
  * @Copyright Copyright (C) 2019 linjb  
  * @author linjb
  * @version 1.0
  * @CreateDate 2019年2月3日下午6:12:14
 */
@Entity
public class PoliticalStatus {

	@Id
    @GeneratedValue
	private Integer politicalStatusId;
	@Column
	private String politicalStatusName;
	public Integer getPoliticalStatusId() {
		return politicalStatusId;
	}
	public void setPoliticalStatusId(Integer politicalStatusId) {
		this.politicalStatusId = politicalStatusId;
	}
	public String getPoliticalStatusName() {
		return politicalStatusName;
	}
	public void setPoliticalStatusName(String politicalStatusName) {
		this.politicalStatusName = politicalStatusName;
	}
	@Override
	public String toString() {
		return "PoliticalStatus [politicalStatusId=" + politicalStatusId + ", politicalStatusName="
				+ politicalStatusName + "]";
	}
	
	
}
