package com.qa.ims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.qa.ims.controller.service.SupplierService;
import com.qa.ims.model.SupplierModel;

@Controller
public class SupplierController {

	@Autowired
	private SupplierService supplierService;

	public String persistSupplier(SupplierModel supplierModel){
		System.out.println("id - " +supplierModel.getId());
		System.out.println("name - " +supplierModel.getName());
		supplierService.persistSupplier(supplierModel);
		return "Added Supplier";

	}
	
	public List<SupplierModel> findSupplierByName(String name){
		return supplierService.findSupplierByName(name);
	}

}
