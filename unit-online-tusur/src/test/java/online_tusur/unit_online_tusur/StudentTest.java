package online_tusur.unit_online_tusur;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
public class StudentTest {
	
	private Student s = new Student();	 	 /*объект тестового класса  Student*/  
	    
	  @Test									/* проверка возраста студента, выходящего за диапазон */
	  void test_assert0() {
		int age = 16;
		s.setAge(age);
	    int expectedAge = 18;
	    int actualsAge=s.getAge();
	    long id = Thread.currentThread().getId();
	    System.out.println("thread="+id);
	    assertEquals(expectedAge, actualsAge);	
	  }
	  
	  @Test
	  void test_assert1() {
		int age = 26;
		s.setAge(age);
	    int expectedAge = 26;
	    int actualsAge=s.getAge();
	    long id = Thread.currentThread().getId();
	    System.out.println("thread="+id);
	    assertEquals(expectedAge, actualsAge);	
	  }
	  
	  @Test
	  void test_assert2() {
		int age = 36;
		s.setAge(age);
	    int expectedAge = 36;
	    int actualsAge=s.getAge();
	    long id = Thread.currentThread().getId();
	    System.out.println("thread="+id);	    
	    assertEquals(expectedAge, actualsAge);	
	  }
	  
}