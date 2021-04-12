package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CsvController {
	
	
	
	@RequestMapping(value = "/showJSON", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String showJSON() {
		
		return FormatJSON.getFormattedJSON();
	}
	
	@RequestMapping(value = "/showJSONCol", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String showJSONCol(@RequestParam String column) {

		return GetColumn.getJSONCol(column);
	}
	
	@RequestMapping(value = "/showInvalidRows", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String showInvalidRows() {

		return CalculateTotal.getInvalid();
	}

}
