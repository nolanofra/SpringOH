package org.isf.spring.oh.repository.jdbc;

import org.springframework.dao.DataAccessException;

public interface HospitalRepository {

	Hospital getHospitalDetails() throws DataAccessException;
	
}
