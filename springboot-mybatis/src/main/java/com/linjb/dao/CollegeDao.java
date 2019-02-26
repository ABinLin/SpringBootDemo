package com.linjb.dao;

import com.linjb.model.College;

public interface CollegeDao {

	public College findByName(String collegeName);
}
