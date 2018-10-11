package com.mockito.spring.demomockthespring;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class SomeBusinessMockTest2 {

	@Test
	public void testFindTheGreatestFromAllData() {
		DataService dataServiceMock =mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {30,11,6});
		SomeBusinessImpl busImpl = new SomeBusinessImpl(dataServiceMock);
		int result =busImpl.findTheGreatestFromAllData();
		assertEquals(30,result);
	}
}

