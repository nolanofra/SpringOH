package org.isf.spring.oh.web;

import java.util.Map;

import org.isf.spring.oh.repository.jdbc.Hospital;
import org.isf.spring.oh.service.OhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HospitalController {

	private final OhService ohService;
	
	@Autowired
    public HospitalController(OhService ohService) {
        this.ohService = ohService;
    }
	
	@RequestMapping(value = "/hospital/detail", method = RequestMethod.GET)
    public String showHospitalDetails(Map<String, Object> model) {
       
        Hospital hospital = this.ohService.getHospitalDetails();
        model.put("hospital", hospital);
        return "hospital/hospitalDetails";
    }
}
