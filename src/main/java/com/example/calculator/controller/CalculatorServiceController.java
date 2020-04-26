package com.example.calculator.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.InputValues;
import com.example.model.Result;

@RestController  
public class CalculatorServiceController {
	
	private static final String MEDIA_TYPE = "application/json";
	
	@RequestMapping(value = {"/api/add"}, method = {RequestMethod.POST},
            consumes = {MEDIA_TYPE}, produces = {MEDIA_TYPE})
	public Result addDigits(@RequestBody InputValues input) {
		Result rs = new Result();
		rs.setResult(String.valueOf(Integer.valueOf(input.getX()) + Integer.valueOf(input.getY())));
		return rs;
	}
	
	@RequestMapping(value = {"/api/diff"}, method = {RequestMethod.POST},
            consumes = {MEDIA_TYPE}, produces = {MEDIA_TYPE})
	public Result minusDigits(@RequestBody InputValues input) {
		Result rs = new Result();
		rs.setResult(String.valueOf(Integer.valueOf(input.getX()) - Integer.valueOf(input.getY())));
		return rs;
	}

}
