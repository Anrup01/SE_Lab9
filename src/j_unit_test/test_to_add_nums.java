package j_unit_test;

import static org.junit.Assert.*;

import org.junit.Test;

public class test_to_add_nums {

	@Test
	public void test() {
		j_unit_function junit= new j_unit_function();
        int result= junit.addnumbers(100, 200);
        assertEquals (300,result);
	}

}
