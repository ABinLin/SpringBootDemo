package com.linjb.dao.master;

import com.linjb.model.College;

public interface CollegeDao {

	public College findByName(String collegeName);
}
