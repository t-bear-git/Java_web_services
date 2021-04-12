package com.example.demo;

import java.util.ArrayList;

public class CalculateTotal {

	
public static String getInvalid() {
		
		ArrayList<String> invalidRows = new ArrayList<String>();
		
		
		for (int i = 1; i< readCSV.getWholeSheet().size() ; i++) {
			
			ArrayList<String> row = new ArrayList<>();
			
			row.addAll(readCSV.getWholeSheet().get(i));
			
			double units = Double.parseDouble(row.get(6));
			double unitCost = Double.parseDouble(row.get(7));
			double total = Double.parseDouble(row.get(8));
			
			boolean checkTotal = Math.round(units * unitCost * 100)/100 == Math.round(total * 100)/100;
			

			if(!checkTotal) {
				invalidRows.add(String.format(FormatJSON.pattern, row.get(0),row.get(1),row.get(2),row.get(3),row.get(4),row.get(5),row.get(6),row.get(7),row.get(8)));	
			}
			
		}
		
		System.out.println(invalidRows);
		
		return invalidRows.toString();
	}

}
