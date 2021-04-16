package JUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		JUniitTesting junit = new JUniitTesting();
		String res = junit.addStrings("Mehal", "Srivastava");
		assertEquals ("MehalSrivastava", res);
	}

}
