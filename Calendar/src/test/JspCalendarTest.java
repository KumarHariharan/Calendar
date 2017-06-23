/**
 * 
 */
package test;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import cal.JspCalendar;

/**
 * @author s.sannidhanam
 *
 */
public class JspCalendarTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetMonth() {
		//fail("Not yet implemented"); // TODO
		JspCalendar cal = new JspCalendar();
		assertEquals(Calendar.getInstance().get(Calendar.MONTH)+1,cal.getMonthInt());
	}

	@Test
	public void testGetDayOfMonth() {
		//fail("Not yet implemented"); // TODO
		JspCalendar cal = new JspCalendar();
		assertEquals(Calendar.getInstance().get(Calendar.DAY_OF_MONTH),cal.getDayOfMonth());
	}
	
	@Test
	public void testGetDayOfYear() {
		//fail("Not yet implemented"); // TODO
		JspCalendar cal = new JspCalendar();
		assertEquals(Calendar.getInstance().get(Calendar.DAY_OF_YEAR),cal.getDayOfYear());
	}
	
	@Test
	public void testGetDayOfWeek() {
		//fail("Not yet implemented"); // TODO
		JspCalendar cal = new JspCalendar();
		assertEquals(Calendar.getInstance().get(Calendar.DAY_OF_WEEK),cal.getDayOfWeek());
	}
}
