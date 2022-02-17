package online_tusur.unit_online_tusur;
import org.testng.annotations.*;

public class NewTestNG {
  @Test(threadPoolSize=6, invocationCount=3)
  public void test1() {
	  long id = Thread.currentThread().getId();
	  System.out.println("test1, thread="+id);
  }
  @Test(threadPoolSize=3, invocationCount=6)
  public void test2() {
	  long id = Thread.currentThread().getId();
	  System.out.println("test2, thread="+id);
  }
  
  @BeforeMethod
  public void testBeforeMethod() {
	  long id = Thread.currentThread().getId();
	  System.out.println("testBeforeMethod, thread="+id);
  }
  
  @AfterMethod
  public void testAfterMethod() {
	  long id = Thread.currentThread().getId();
	  System.out.println("testAfterMethod, thread="+id);
  }
  
  @BeforeClass
  public void testBeforeClass() {
	  long id = Thread.currentThread().getId();
	  System.out.println("testBeforeClass, thread="+id);
  }
  
  @AfterClass
  public void testAfterClass() {
	  long id = Thread.currentThread().getId();
	  System.out.println("testAfterClass, thread="+id);
  }
  
  @BeforeTest
  public void testBeforeTest() {
	  long id = Thread.currentThread().getId();
	  System.out.println("testBeforeTest, thread="+id);
  }
  
  @AfterTest
  public void testAfterTest() {
	  long id = Thread.currentThread().getId();
	  System.out.println("testAfterTest, thread="+id);
  }
   
  @BeforeSuite
  public void testBeforeSuite() {
	  long id = Thread.currentThread().getId();
	  System.out.println("testBeforeSuite, thread="+id);
  }
  
  @AfterSuite
  public void testAfterSuite() {
	  long id = Thread.currentThread().getId();
	  System.out.println("testAfterSuite, thread="+id);
  }
  
}
