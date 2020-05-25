package ModifierAndJunit;

import org.junit.Test;

public class D extends B{
	@Test
	public void test3() {
		//same package using inheritance
		m1();
		m2();
		m3();
		//m4(); only private is not accessible
	}

}
