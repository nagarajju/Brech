package com.rbs.breach.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rbs.breach.beans.BreachBean;
import com.rbs.breach.dao.BreachDao;
import com.rbs.breach.service.BreachExportService;

public class BreachExportServiceImpl implements BreachExportService{

	@Autowired
	private BreachDao breachDao;
	
	@Override
	public List<BreachBean> exportToExcel() {
		
				
		return breachDao.findAll();
	}

}
