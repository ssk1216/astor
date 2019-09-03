import static org.junit.Assert.*;

import org.junit.Test;

public class GCDTest {
 GCDEx a=new GCDEx();
	@Test
	public void testvalidgcd()
	{
	assertEquals(2,a.gcd(4, 2) );
	}
	@Test(timeout=5000)
	public void testinvalidgcd()
	{
	assertEquals(5,a.gcd(0, 5) );
	}

}
