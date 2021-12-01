package testDAO;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.*;

import sunnycss.MODEL.NhanVien;
import sunnycssw.DAO.ConnectSQL;
import sunnycssw.DAO.QuanLyDAO;

public class TestQuanLyDAO {
	QuanLyDAO qlDAO = new QuanLyDAO();
//	@BeforeClass
//	public void Setup() {
//		
//	}
//	@AfterClass
//	public void Teardown() {
//		
//	}
//	@BeforeTest
//	public void Beforetest() {
//		
//	}
//	@AfterTest
//	public void Aftertest() {
//		
//	}
  @Test
  public void TC001_loadlstNV_Success() {
		Assert.assertTrue(qlDAO.loadlstNV() != null);
  }

  @Test
  public void TC002_loadlstSP_Success() throws SQLException {

     Assert.assertTrue(qlDAO.loadlstSP() != null);
  }
  @Parameters("ID")
  @Test
  public void TC003_findNVByID_Success(String ID) throws SQLException {
	  
	  Assert.assertTrue(qlDAO.findNVByID(ID) != null);
  }
  @Test
  public void TC004_findNVByID_Failed() throws SQLException{  
		  Assert.assertEquals(qlDAO.findNVByID(""), null);
  }
  @Parameters("IDSpFailed")
  @Test
  public void TC004_findSPbyID_Failed(int IDSpFailed) throws SQLException{  
	  Assert.assertTrue(qlDAO.findSPbyID(IDSpFailed) == null);
  }
  
}
