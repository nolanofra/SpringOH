package orgisf.spring.oh.service;
import static org.assertj.core.api.Assertions.assertThat;

import org.isf.spring.oh.repository.jdbc.Hospital;
import org.isf.spring.oh.service.OhService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@ContextConfiguration(locations = {"classpath:spring/business-config.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("jdbc")
public class HospitalTest {

	@Autowired
	protected OhService ohService;
	
	@Test
	public void shouldGetHospitalDetails(){
		Hospital hospital = this.ohService.getHospitalDetails();
		assertThat(hospital.getName()).isEqualTo("St. Luke HOSPITAL - Angal");
	}
	
}
