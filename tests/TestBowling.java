import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test_isStrike() throws BowlingException {
		Frame frame=new Frame(10,4);
		assertTrue(frame.isStrike());
	}
	
	@Test
	public void test_isSpare()) throws BowlingException {
		Frame frame=new Frame(6,4);
		assertTrue(frame.isSpare());
	}

}
