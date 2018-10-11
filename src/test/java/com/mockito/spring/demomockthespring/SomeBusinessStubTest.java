package com.mockito.spring.demomockthespring;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class SomeBusinessStubTest {

	@Test
	public void testFindTheGreatestFromAllData() {
		SomeBusinessImpl busImpl = new SomeBusinessImpl(new DataServiceStub());
		int result =busImpl.findTheGreatestFromAllData();
		assertEquals(30,result);
	}
}
class DataServiceStub implements DataService {
	
	@Override
	public int[] retrieveAllData() {
		return new int []{30,11,6};
	}
}
