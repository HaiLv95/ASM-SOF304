package testDAO;

import org.testng.annotations.Test;

import sunnycssw.DAO.ConnectSQL;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class TestConnectSQL {

	Connection connection;

	@AfterTest
	public void AfterTest() {
		ConnectSQL.pass = null;
		ConnectSQL.user = null;
		if (ConnectSQL.Connect() != null) {
			try {
				ConnectSQL.Connect().close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Parameters({ "user", "pass" })
	@Test
	public void TCDB_TC001_Success(String user, String pass) {
			ConnectSQL.user = user;
			ConnectSQL.pass = pass;
			connection = ConnectSQL.Connect();
			assertTrue(connection != null);
	}

//	@Parameters({ "user", "passNull" })
//	@Test(expectedExceptions = SQLException.class)
//	public void TCDB_TC002_PasswordNull(String user, String passNull) {
//		ConnectSQL.user = user;
//		ConnectSQL.pass = passNull;
//		connection = ConnectSQL.Connect();
//		assertEquals(connection, null);
//	}

	@Parameters({ "user", "passF" })
	@Test
	public void TCDB_TC003_PasswordFalse(String user, String passF) {
		ConnectSQL.user = user;
		ConnectSQL.pass = passF;
		connection = ConnectSQL.Connect();
		assertEquals(connection, null);
	}

	@Parameters({ "userF", "pass" })
	@Test
	public void TCDB_TC004_UserFalse(String userF, String pass) {
		ConnectSQL.user = userF;
		ConnectSQL.pass = pass;
		connection = ConnectSQL.Connect();
		assertEquals(connection, null);
	}

	@Parameters({ "userNull", "pass" })
	@Test
	public void TCDB_TC005_UserNull(String userNull, String pass) {

		ConnectSQL.user = userNull;
		ConnectSQL.pass = pass;
		connection = ConnectSQL.Connect();
		assertEquals(connection, null);

	}

}
