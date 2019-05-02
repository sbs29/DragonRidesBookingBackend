package com.example.drakkar.util;

import java.util.function.Supplier;

public class CachedObject<T> implements Supplier<T>, Wipeable {

	private final long ttl;
	private long lastTimeUpdated = Long.MIN_VALUE;
	private final Supplier<T> supplier;

	private T cached;

	public CachedObject(long timeToLiveInMillis, Supplier<T> getter) {
		this.ttl = timeToLiveInMillis;
		this.supplier = getter;
	}

	@Override
	public T get() {
		long now = System.currentTimeMillis();
		if (cached == null || now - lastTimeUpdated > ttl) {
			cached = supplier.get();
			lastTimeUpdated = System.currentTimeMillis();
		}
		return cached;
	}

	@Override
	public void wipeOut() {
		this.cached = null;
		lastTimeUpdated = Long.MIN_VALUE;
	}

}
