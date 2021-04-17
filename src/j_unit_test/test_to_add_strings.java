package j_unit_test;

import static org.junit.Assert.*;

import org.junit.Test;

public class test_to_add_strings {

	@Test
	public void test() {
		j_unit_function jstr= new j_unit_function();
        String result= jstr.addstring("abc", "cda");
        assertEquals("abccda", result);

	}

}
