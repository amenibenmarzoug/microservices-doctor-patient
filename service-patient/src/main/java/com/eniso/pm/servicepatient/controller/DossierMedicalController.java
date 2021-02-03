package com.eniso.pm.servicepatient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eniso.pm.servicepatient.entity.DossierMedical;
import com.eniso.pm.servicepatient.service.DossierMedicalService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@ComponentScan(basePackageClasses = DossierMedicalService.class )
@RequestMapping(value="/api")

public class DossierMedicalController {
	private DossierMedicalService dm;
	@Autowired
	public DossierMedicalController(DossierMedicalService dmService) {
		dm = dmService;
	} 
	//public ControlController () {}
	


	@GetMapping("/dm")
	public List<DossierMedical> findAll() {
		return dm.findAll();
	}
	
	@GetMapping("dm/{dmId}")
	public DossierMedical getDossierMedical(@PathVariable Long dmId) {
		
		DossierMedical d = dm.findById(dmId);
		
		if (d == null) {
			throw new RuntimeException("Dossier Medical id not found - " + dmId);
		}
		
		return d;
	}
	// add mapping for POST /controls - add new control

	@PostMapping("dm/add")
	public  DossierMedical adddm(@RequestBody DossierMedical d) {
	
		 dm.save(d);
		return d;
	}
	
	
	// add mapping for PUT /employees - update existing employee
	
		@PutMapping("/dm")
		public DossierMedical updatedm(@RequestBody DossierMedical d) {
			
			dm.save(d);
			
			return d;
		}

		@DeleteMapping("/dm/{dmId}")
		public String deletedm(@PathVariable Long id) {
			
			DossierMedical d = dm.findById(id);
			
			// throw exception if null
			
			if (d == null) {
				throw new RuntimeException("the DM id not found - " + id);
			}
			
			dm.deleteById(id);
			
			return "Deleted DM id - " + id;
		}
}