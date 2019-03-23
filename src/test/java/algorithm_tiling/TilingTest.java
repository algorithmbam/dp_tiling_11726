package algorithm_tiling;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TilingTest {

	private Tiling tiling;
	private int input= 0;
	
	@Before
	public void setUp() {
		tiling= new Tiling();
	}
	
	@Test
	public void input1ouput1() {
		
		input= 1;
		int result= 0;
		result= tiling.dp(input);
		
		assertThat(result, is(1));
	}
	
	@Test
	public void input2ouput1() {
		
		input= 2;
		int result= 0;
		result= tiling.dp(input);
		
		assertThat(result, is(2));
	}
	
	@Test
	public void input9ouput55() {
		
		input= 9;
		int result= 0;
		result= tiling.dp(input);
		
		assertThat(result, is(55));
	}
}