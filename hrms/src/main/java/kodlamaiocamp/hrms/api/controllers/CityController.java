package kodlamaiocamp.hrms.api.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaiocamp.hrms.business.abstracts.CityService;
import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.entities.concretes.Cities;

@RestController
@RequestMapping("/api/city")
public class CityController {
	
private CityService cityService;

@Autowired
public CityController(CityService cityService) {
	super();
	this.cityService=cityService;
}

@GetMapping("/getall")
public DataResult<List<Cities>> getAll(){
	return this.cityService.getAll();
}


}
