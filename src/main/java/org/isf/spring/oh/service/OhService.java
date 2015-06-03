package org.isf.spring.oh.service;

import org.isf.spring.oh.repository.jdbc.Hospital;
import org.springframework.dao.DataAccessException;

public interface OhService {

	Hospital getHospitalDetails() throws DataAccessException;
}
