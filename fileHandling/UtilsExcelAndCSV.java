public static void main(String[] s) {
		// List<TreeMap<String, List<String>>>
		List<TreeMap<String, List<String>>> listOfMapExcelColumns = readColumnsDataFromExcelWithJava8("Sheet1", "Month",
				"OrderId");
		// displayNestedListWithMapWithJava8(listOfMapExcelColumns);
		Map<String, Integer> mp = displayJava8(listOfMapExcelColumns);
		mp.forEach((k, v) -> System.out.println(k + " " + v));
	}*/

	public static Map<String, Integer> displayJava8(List<TreeMap<String, List<String>>> listOfMapList) {
		// key: " + entry.getKey() + " with value:
		Map<String, Integer> map = new TreeMap<String, Integer>();

		for (int i = 0; i < listOfMapList.size(); i++) {
			String key = "";
			Integer count = 0;
			TreeMap<String, List<String>> mapofmaps = listOfMapList.get(i);

			// System.out.println(""+mapofmaps.get("June"));
			for (Map.Entry<String, List<String>> entry : mapofmaps.entrySet()) {
				System.out.print(" " + entry.getKey().toString());
				key = entry.getKey().toString();
				System.out.print(" : " + entry.getValue().toString());
				count = entry.getValue().size();
				map.put(key, count);
			}
			map.entrySet().removeIf(e -> e.getKey().compareTo("") <= 0);
			System.out.println("");
			System.out.println(" *********** ");

		}
		return map;
	}

	public static final String delimiter = ",";

	public static List<Map<String, String>> readDataFromExcel(String excelFileName, String excelWorksheetName) {
		List<Map<String, String>> sheetData = new ArrayList<Map<String, String>>();
		FileInputStream fis = null;
		try {

			XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(excelFileName));
			List<String> listOfHeaders = new ArrayList<String>();
			XSSFSheet sheet = workbook.getSheet(excelWorksheetName);
			int maxNumOfCells = sheet.getRow(0).getLastCellNum(); // The the
			XSSFRow row = sheet.getRow(0);
			for (int cellCounter = 0; cellCounter < maxNumOfCells; cellCounter++) { // Loop
				XSSFCell cell;

				if (row.getCell(cellCounter) == null) {
					cell = row.createCell(cellCounter);
				} else {
					cell = row.getCell(cellCounter);
				}
				listOfHeaders.add(cell.toString());

			}
			Iterator rows = sheet.rowIterator();

			while (rows.hasNext()) {
				XSSFRow row1 = (XSSFRow) rows.next();
				Iterator cells = row1.cellIterator();
				Map<String, String> dataHash = new TreeMap<String, String>();
				for (int cellCounter = 0; cellCounter < maxNumOfCells; cellCounter++) { // Loop
																						// through
					// cells
					XSSFCell cell;
					if (row1.getCell(cellCounter) == null) {
						cell = row1.createCell(cellCounter);
					} else {
						cell = row1.getCell(cellCounter);
					}
					dataHash.put(listOfHeaders.get(cellCounter), cell.toString());
				}
				sheetData.add(dataHash);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sheetData;
	}

	/*
	 * 
	 * OrderId Month A1 June A2 June B2 May C4 July D5 August
	 * 
	 * 
	 */
	public static List<TreeMap<String, List<String>>> readColumnsDataFromExcelWithJava8(String excelWorksheetName,
			String column1, String column2) {
		// boolean flag = false;
		List<Map<String, String>> sheetData = Utils.readDataFromExcel(Constants.configfileName, excelWorksheetName);

		List<TreeMap<String, List<String>>> listOfMapExcelColumns = new ArrayList<TreeMap<String, List<String>>>();

		TreeMap<String, String> hashMap = new TreeMap<String, String>();
		List<String> list = new ArrayList<String>();

		// List<TreeMap<String, String>> sheetDataMapListValue = new
		// ArrayList<TreeMap<String, String>>();
		TreeMap<String, List<String>> sheetDataMap = new TreeMap<String, List<String>>();

		for (int i = 1; i < sheetData.size(); i++) {
			String firstColumn = "";
			String secondColumn = "";
			hashMap = (TreeMap<String, String>) sheetData.get(i);

			hashMap.entrySet().removeIf(e -> e.getKey().compareTo("") <= 0);
			for (Map.Entry dataIterate : hashMap.entrySet()) {
				list = new ArrayList<String>();
				// TreeMap<String, List<String>>

				if (dataIterate.getKey().equals(column1)) {
					firstColumn = dataIterate.getValue().toString();
					firstColumn = firstColumn.trim();
				}
				if (dataIterate.getKey().equals(column2)) {
					secondColumn = dataIterate.getValue().toString();
					secondColumn = secondColumn.trim();
					// flag=true;
				}

				if (sheetDataMap.containsKey(firstColumn)) {
					list.addAll(sheetDataMap.get(firstColumn));
					list.add(secondColumn);
				} else {
					list.add(secondColumn);
				}
				list = list.stream().filter(item -> !item.isEmpty()).collect(Collectors.toList());
				list = list.stream().distinct().collect(Collectors.toList());
				sheetDataMap.put(firstColumn, list);

			}
			listOfMapExcelColumns = listOfMapExcelColumns.stream().distinct().collect(Collectors.toList());
			listOfMapExcelColumns.add(sheetDataMap);
		}
		listOfMapExcelColumns = listOfMapExcelColumns.stream().distinct().collect(Collectors.toList());

		return listOfMapExcelColumns;
	}

	public static void displayNestedListWithMapWithJava8(List<TreeMap<String, List<String>>> listOfMapList) {
		// key: " + entry.getKey() + " with value:
		for (int i = 0; i < listOfMapList.size(); i++) {

			TreeMap<String, List<String>> mapofmaps = listOfMapList.get(i);

			// System.out.println(""+mapofmaps.get("June"));
			for (Map.Entry<String, List<String>> entry : mapofmaps.entrySet()) {
				System.out.print(" " + entry.getKey().toString());

				System.out.print(" : " + entry.getValue().toString());
			}
			System.out.println("");
			System.out.println(" *********** ");

		}
	}

	public static List<String> listOfNonDuplicateValues(List<String> list) {
		return null;
	}

	public static void displayWithJava8(List<TreeMap<String, String>> listOfMapExcelColumns) {
		// HashMap<String, String> hashMap = new HashMap<String, String>();
		for (int i = 0; i < listOfMapExcelColumns.size(); i++) {
			TreeMap<String, String> hashMap = listOfMapExcelColumns.get(i);
			hashMap.forEach((k, v) -> System.out.println(k + " & " + v));

			System.out.println("*******************************************8");
		}
	}

	/**********************************************************************************************************************************************************************/
	public static void readCSVFile() throws FileNotFoundException { // Creating a Workbook from an Excel file (.xls or
																	// .xlsx)
		// ;
		try {
			Workbook workbook = WorkbookFactory.create(new FileInputStream(new File(Constants.configfileName)));

			// Retrieving the number of sheets in the Workbook
			System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");

			/*
			 * ============================================================= Iterating over
			 * all the sheets in the workbook (Multiple ways)
			 * =============================================================
			 */

			// 1. You can obtain a sheetIterator and iterate over it
			/*
			 * Iterator<Sheet> sheetIterator = workbook.sheetIterator();
			 * System.out.println("Retrieving Sheets using Iterator"); while
			 * (sheetIterator.hasNext()) { Sheet sheet = sheetIterator.next();
			 * System.out.println("=> " + sheet.getSheetName()); }
			 * 
			 * // 2. Or you can use a for-each loop
			 * System.out.println("Retrieving Sheets using for-each loop"); for (Sheet sheet
			 * : workbook) { System.out.println("=> " + sheet.getSheetName()); }
			 * 
			 * // 3. Or you can use a Java 8 forEach with lambda
			 * System.out.println("Retrieving Sheets using Java 8 forEach with lambda");
			 * workbook.forEach(sheet -> { System.out.println("=> " + sheet.getSheetName());
			 * });
			 */

			/*
			 * ================================================================== Iterating
			 * over all the rows and columns in a Sheet (Multiple ways)
			 * ==================================================================
			 */

			// Getting the Sheet at index zero
			Sheet sheet = workbook.getSheetAt(0);

			// Create a DataFormatter to format and get each cell's value as String
			DataFormatter dataFormatter = new DataFormatter();

			// 1. You can obtain a rowIterator and columnIterator and iterate over them
			System.out.println("\n\nIterating over Rows and Columns using Iterator\n");
			Iterator<Row> rowIterator = sheet.rowIterator();
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();

				// Now let's iterate over the columns of the current row
				Iterator<Cell> cellIterator = row.cellIterator();

				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					String cellValue = dataFormatter.formatCellValue(cell);
					System.out.print(cellValue + "\t");
				}
				System.out.println();
			}

			// 2. Or you can use a for-each loop to iterate over the rows and columns
			System.out.println("\n\nIterating over Rows and Columns using for-each loop\n");
			for (Row row : sheet) {
				for (Cell cell : row) {
					String cellValue = dataFormatter.formatCellValue(cell);
					System.out.print("abc: " + cellValue + "\t");
				}
				System.out.println("******************8");
			}

			// 3. Or you can use Java 8 forEach loop with lambda
			System.out.println("\n\nIterating over Rows and Columns using Java 8 forEach with lambda\n");
			sheet.forEach(row -> {
				row.forEach(cell -> {
					String cellValue = dataFormatter.formatCellValue(cell);
					System.out.print(cellValue + "\t");
				});
				System.out.println();
			});

			// Closing the workbook
			// workbook.close();

		} catch (InvalidFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
