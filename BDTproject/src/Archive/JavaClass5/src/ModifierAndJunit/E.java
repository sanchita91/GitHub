package ModifierAndJunit;

import org.junit.Test;

import com.C;
import com.SignUpBean;

public class E extends C {
	@Test
	public void test4() {
		//different package using inheritance
		//m1(); default is not possible
		m2();
		m3();
		//m4();  private is not accessible
	}
	
	@Test
	public void gettersetterconcept() {
		//using constructor
		SignUpBean shahid=new SignUpBean("shahid", "islam", 12345, "s@yahoo.com", "s123");
		
		shahid.signUp();
		SignUpBean junal=new SignUpBean("junal", "ahmen", 142345, "s45@yahoo.com", "s15623");
		
		
		Login l=new Login();
		Bean shahid1=new Bean();
		shahid1.setUserId("shahid01");
		shahid1.setPassword("s1234");
		l.login(shahid1.getUserId(),shahid1.getPassword());
		
		//junal
		Bean junal1=new Bean();
		junal1.setUserId("junal01");
		junal1.setPassword("s123434");
		l.login(junal1.getUserId(),junal1.getPassword());
		
		
	}

}
