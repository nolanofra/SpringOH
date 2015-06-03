package org.isf.spring.oh.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.isf.spring.oh.repository.jdbc.Hospital;
import org.isf.spring.oh.repository.jdbc.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

@Service
public class OhServiceImpl implements OhService{

	private HospitalRepository hospitalRepository;
	
	@Autowired
	public OhServiceImpl(HospitalRepository hospitalRepository){
		this.hospitalRepository = hospitalRepository;
	}
	
	@Override
    @Transactional(readOnly = true)
	public Hospital getHospitalDetails() throws DataAccessException {
		return this.hospitalRepository.getHospitalDetails();
	}

}
