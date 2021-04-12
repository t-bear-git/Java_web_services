package com.example.demo;

import java.util.ArrayList;

public class GetColumn {

	
	public static String getJSONCol(String column) {
		
		ArrayList<String> columnList = new ArrayList<>();
		String reqColumn = column;
		String columnJSON = "{\"Sample\":[";

		
		for (int i = 1; i < readCSV.getWholeSheet().size(); i++) {
			
			ArrayList<String> rows = new ArrayList<>();
			String pattern = "{\"Number\":\"%s\", \"%s\":\"%s\"}";
			
			rows.addAll(readCSV.getWholeSheet().get(i));
			
			columnList.add(rows.get(getReqCol(column)));
			
			columnJSON += String.format(pattern, i, reqColumn, columnList.get(i-1));

			if (i < readCSV.getWholeSheet().size() - 1) {

				columnJSON += ",";
			}

		}
		columnJSON += "]}";
		return columnJSON;

	}
	
	public static int getReqCol(String column) {

		int returnCol = 0;
		switch (column.toLowerCase()) {
		case "orderdate":
			returnCol = 1;
			break;
		case "region":
			returnCol = 2;
			break;
		case "rep1":
			returnCol = 3;
			break;
		case "rep2":
			returnCol = 4;
			break;
		case "item":
			returnCol = 5;
			break;
		case "units":
			returnCol = 6;
			break;
		case "unitcost":
			returnCol = 7;
			break;
		case "total":
			returnCol = 8;
			break;
		}
		return returnCol;

	}
}
