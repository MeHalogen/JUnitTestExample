package JUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	@Test
	void test() {
		JUniitTesting junit = new JUniitTesting();
		int sum = junit.addNumbers(7, 7);
		assertEquals (14, sum);
		
	}

}
