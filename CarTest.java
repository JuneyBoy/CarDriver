import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarTest {
	
	private static final int HUNDRED = 100;
	Car car;

	@Before
	public void setUp() throws Exception{
		car = new Car(HUNDRED);
	}
	
	@Test
	public void testCar() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsCar() {
		Car x = new Car(50);
		assertFalse(car.equals(x));
	}

	@Test
	public void testEqualsObject() {
		Object x = new Car(HUNDRED);
		boolean expected = true;
		boolean actual = car.equals(x);
		assertEquals(expected, actual);
		
		String y = new String ("Bogus car");
		assertEquals(false, car.equals(y));
	}

	@Test
	public void testToString() {
		//Stick to stringent government requirements
		//about a product information
		
		String expected = "This vehicle has a range of 100 miles";
		String actual = car.toString();
		assertEquals(expected, actual);
	}

}
