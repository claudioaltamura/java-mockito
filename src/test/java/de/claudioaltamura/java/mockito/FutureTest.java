package de.claudioaltamura.java.mockito;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class FutureTest {

	private Service service = mock(Service.class);

	@Test
	void futureTest() throws ExecutionException, InterruptedException {
		when(service.compute(anyString()))
				.thenReturn(CompletableFuture.completedFuture("A"));

		assertEquals("A", service.compute("hello").get());
	}
}
