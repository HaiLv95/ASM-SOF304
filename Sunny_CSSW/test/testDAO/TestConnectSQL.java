package testDAO;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestConnectSQL {
	String url;
	String user;
	String pass;
	Connection connection;
	Map<String, Object> testResult;
	HSSFWorkbook workbook;
	HSSFSheet sheet;
	@BeforeClass
	public void setUpTest() {
		workbook = new HSSFWorkbook();
		sheet = workbook.createSheet("TestConnectSQL");
		testResult = new LinkedHashMap<String, Object>();
		testResult.put("1", new Object[] { "Testcase Name", "Testing Purpose", "Expected Output", "Actual Output" });
	}
	@Parameters({"host","user", "pass", "db", "port"})
	@Test
	public void TCDB_TC001_Success(String host, String user, String pass, String db, String port) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			url = "jdbc:sqlserver://" + host + ":" + port + ";databaseName=" + db;
			this.user = user;
			this.pass = pass;
			connection = DriverManager.getConnection(url, user, pass);
			assertTrue(connection != null);
			testResult.put("2", new Object[] { "CDB_TC001_ConectSuccess", "Database connection",
					"Database connection successful", "Pass" });
		} catch (Exception e) {
			testResult.put("2", new Object[] { "CDB_TC001_ConectSuccess", "Database connection",
					"Database connection successful", "Fail" });
		}
	}
	@AfterClass
	public void tearDown() {
		Set<String> keySet = testResult.keySet();
		int index = 0;
		for (String key : keySet) {
			Row row = sheet.createRow(index ++);
			Object[] results = (Object[]) testResult.get(key);
			int col = 0;
			for (Object result : results) {
				Cell cell = row.createCell(col++);
				if (result instanceof Date) {
					cell.setCellValue((Date) result);
				} else if (result instanceof Boolean) {
					cell.setCellValue((Boolean) result);
				} else if (result instanceof String) {
					cell.setCellValue((String) result);
				} else if (result instanceof Double) {
					cell.setCellValue((Double) result);
				}
			}
			try {
				FileOutputStream out = new FileOutputStream(new File("C:\\Users\\hai95\\OneDrive\\Desktop\\SOF304-ASM\\TestReport\\TestConnectSQL.xls"));
				workbook.write(out);
				System.out.println("success");
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
