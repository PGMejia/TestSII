package com.thales.repository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import com.thales.entity.Employee;
import com.thales.entity.EmployeeResponse;
import com.thales.entity.EmployeeResponseWrapper;

@Repository
public class EmployeeRepository implements IEmployeeRepository {

	
	private static final String BASE_URL = "https://dummy.restapiexample.com/api/v1";

	private RestTemplate _restTemplate;
		
	
	public EmployeeRepository(RestTemplate restTemplate) {
		this._restTemplate = restTemplate;
	}

	@Override
    public List<Employee> getEmployees() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
      
        ResponseEntity<EmployeeResponse> response = _restTemplate.exchange(
            BASE_URL + "/employees",
            HttpMethod.GET,
            entity,
            EmployeeResponse.class
        );
        

        if (response.getBody() != null) {
            return response.getBody().getData();
        } else {
            return Collections.emptyList();
        }
        	
        
    }
	
	@Override
	public Employee getEmployeeById(String id) {
	    EmployeeResponseWrapper response = _restTemplate.getForObject(BASE_URL + "/employee/" + id, EmployeeResponseWrapper.class);
	    if (response != null && "success".equalsIgnoreCase(response.getStatus())) {
	        return response.getData();
	    } else {
	        return null;
	    }
	}


}