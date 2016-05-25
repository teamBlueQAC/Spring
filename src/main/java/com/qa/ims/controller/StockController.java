package com.qa.ims.controller;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.qa.ims.controller.service.StockService;
import com.qa.ims.model.repository.Stock;

@Controller
public class StockController {
	@Autowired 
	private StockService stockService;
	private ArrayList<Stock> stocks;
	
	
	@PostConstruct
	public void init(){
		this.stocks = stockService.getStocks();
	}
	

	public ArrayList<Stock> getStocks() {
		return stocks;
	}

	public void setStocks(ArrayList<Stock> stocks) {
		this.stocks = stocks;
	}
	
	public void filterStocks(String filer){
		
	}
	
	public void searchStocks(String filer){
		
	}
	
	
}
