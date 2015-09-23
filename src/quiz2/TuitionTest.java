package quiz2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TuitionTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testfulltuition() {
		TuitionBill runone = new TuitionBill(42000,0.30,0.65,78);
		assertTrue(runone.fullTuition()== 428759.1);
		TuitionBill runtwo = new TuitionBill(12000,0.50,0.35,65);
		assertTrue(runtwo.fullTuition()== 131625.0);
		TuitionBill runthree = new TuitionBill(50000,0.15,0.37,4);
		assertTrue(runthree.fullTuition()== 342046.18);
		TuitionBill runfour = new TuitionBill(30000,0.03,0.43,10);
		assertTrue(runfour.fullTuition()== 179477.59);
	
	}

}
