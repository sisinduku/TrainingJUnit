package com.sisinduku.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper helper = new StringHelper();
	
	@Test
	public void testTruncateAInFirst2Position_AinFirst2Position() {		
		assertEquals("CD", helper.truncateAInFirst2Position("AACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Position_AinFirstPosition() {
		assertEquals("CD", helper.truncateAInFirst2Position("ACD"));
	}
}
