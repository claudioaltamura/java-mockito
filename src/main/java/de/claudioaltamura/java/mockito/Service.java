package de.claudioaltamura.java.mockito;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

class Service {

	Future<String> compute(String input) {
		throw new RuntimeException("Not Implemented");
	}

}
