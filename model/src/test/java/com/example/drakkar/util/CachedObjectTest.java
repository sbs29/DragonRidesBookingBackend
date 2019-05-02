package com.example.drakkar.util;

import java.util.function.Supplier;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class CachedObjectTest {

	private static final String A_STRING_VALUE = "a string value";

	private static final long ONE_SECOND_IN_MILLIS = 1000L;

	CachedObject<String> fixture;

	Supplier<String> mockSupplier;

	@SuppressWarnings("unchecked")
	@Before
	public void setup() {
		mockSupplier = Mockito.mock(Supplier.class);

		Mockito.when(mockSupplier.get()).thenReturn(A_STRING_VALUE);

		fixture = new CachedObject<String>(ONE_SECOND_IN_MILLIS, mockSupplier);
	}

	@Test
	public void test_fixture_exists() {
		Assert.assertNotNull(fixture);
	}

	@Test
	public void test_returns_retrieved_value() {
		Assert.assertEquals(A_STRING_VALUE, fixture.get());
	}

	@Test
	public void test_first_invocation_retrieves() {
		Mockito.verify(mockSupplier, Mockito.times(0)).get();
		fixture.get();
		Mockito.verify(mockSupplier, Mockito.times(1)).get();
	}

	@Test
	public void test_second_invocation_does_not_retrieve() {
		test_first_invocation_retrieves();
		fixture.get();
		Mockito.verify(mockSupplier, Mockito.times(1)).get();
	}

	@Test
	public void test_retrieves_after_timeout() throws InterruptedException {
		test_second_invocation_does_not_retrieve();
		Thread.sleep(1000L);
		fixture.get();
		Mockito.verify(mockSupplier, Mockito.times(2)).get();
	}

}
