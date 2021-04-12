package com.example.demo;

import java.util.ArrayList;

public class FormatJSON {
	
	public static String pattern = "{\"Number\":\"%s\", \"Orderdate\":\"%s\", \"Region\":\"%s\", \"Rep1\":\"%s\", \"Rep2\":\"%s\", \"Item\":\"%s\", \"Units\":\"%s\", \"Unit Cost\":\"%s\", \"Total\": \"%s\"}";
	
	public static String getFormattedJSON() {

		String formattedJSON = "{\"Sample\":[";

		for (int i = 1; i < readCSV.getWholeSheet().size(); i++) {
			ArrayList<String> row = new ArrayList<>();
			row.addAll(readCSV.getWholeSheet().get(i));

			formattedJSON += String.format(pattern, row.get(0), row.get(1), row.get(2), row.get(3), row.get(4), row.get(5), row.get(6), row.get(7), row.get(8));

			if (i < readCSV.getWholeSheet().size() - 1) {

				formattedJSON += ",";
			}

		}
		formattedJSON += "]}";
		return formattedJSON;
	}

}
