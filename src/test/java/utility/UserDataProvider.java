package utility;

import org.testng.annotations.DataProvider;

public class UserDataProvider {

	@DataProvider(name = "loginData")
	public Object[][] loginData() throws Exception {
		ExcelUtility.setExcelFile(
				"C:\\Users\\xmedia\\eclipse-workspace\\demowebshop.tricentis.com\\src\\main\\TestData.xlsx",
				"LoginPageTestData");
		int rowCount = ExcelUtility.getRowCount();
		int colCount = ExcelUtility.getColumnCount(0);

		Object[][] data = new Object[rowCount][colCount];
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				data[i][j] = ExcelUtility.getCellData(i, j);
			}
		}
		return data;
	}
	
	@DataProvider(name = "Registration")
	public Object[][] RegisterData() throws Exception {
		ExcelUtility.setExcelFile(
				"C:\\Users\\xmedia\\eclipse-workspace\\demowebshop.tricentis.com\\src\\main\\TestData.xlsx",
				"Rgeistration Page ");
		int rowCount = ExcelUtility.getRowCount();
		int colCount = ExcelUtility.getColumnCount(0);

		Object[][] data = new Object[rowCount][colCount];
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				data[i][j] = ExcelUtility.getCellData(i, j);
			}
		}
		return data;
	}

}
