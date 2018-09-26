import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class ICalculateTest {
	private double vOne, vTwo;
	private ICalculate calc;

	@Before
	public void setUp() throws Exception {
		calc = new ICalculate();
		vOne = 2.0;
		vTwo = 4.0;
	}

	@After
	public void tearDown() throws Exception {
		calc = null;
	
	}

	@Test
	public void testAddTwo() {
		Assert.assertEquals((vOne + vTwo), calc.addTwo(vOne, vTwo), 0.1);
	}

	@Test
	public void testTimesTwo() {
		Assert.assertEquals((vOne * vTwo), calc.timesTwo(vOne, vTwo), 0.1);	}

}
