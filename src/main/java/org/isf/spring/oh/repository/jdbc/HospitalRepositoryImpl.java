package org.isf.spring.oh.repository.jdbc;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HospitalRepositoryImpl implements HospitalRepository{

	
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	 @Autowired
	public HospitalRepositoryImpl(DataSource dataSource){
		 this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	 }
	
	public Hospital getHospitalDetails() throws DataAccessException {
		 Map<String, Object> params = new HashMap<String, Object>();
	        return this.namedParameterJdbcTemplate.query(
	                "SELECT HOS_ID_A as id, HOS_NAME as name FROM HOSPITAL",
	                params,
	                BeanPropertyRowMapper.newInstance(Hospital.class)).get(0);
	}
}
