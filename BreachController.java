/**
 * 
 */
package com.rbs.breach.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rbs.breach.beans.BreachBean;
import com.rbs.breach.dao.BreachDao;
import com.rbs.breach.service.BreachExportService;
import com.rbs.breach.service.BreachService;

/**
 * @author user
 *
 */
@RestController
public class BreachController {
	@Autowired	
	private BreachService breachService;
	
	@Autowired
	private BreachExportService	breachExportService;
	
	@Autowired
	private BreachDao breachDao;

	@PostMapping("/addDataBreach")
	public void addDataBreach(BreachBean breachBean){
		breachDao.save(breachBean);
		
	}
		
	@GetMapping("/getDataBreach")
	public BreachBean getDataBreach(){
		return null;
	}
		
	
	
	@GetMapping(value="/breachexport",produces=MediaType.APPLICATION_XML_VALUE)
	public List<BreachBean> getDataBreachToExcel(){
		
		System.out.println(" entering method getDataBreachToExcel ");
		
		return breachExportService.exportToExcel();
		
		
	}
	
	
	
}
