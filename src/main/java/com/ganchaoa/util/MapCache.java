package com.ganchaoa.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapCache {

	private static final int DEFAULT_CACHES = 1024;

	private static final MapCache INS = new MapCache();

	public static MapCache getInstance() {
		return INS;
	}

	/**
	 * 缓存容器
	 */
	private Map<String, CacheObject> cachePool;

	public MapCache() {
		this(DEFAULT_CACHES);
	}

	public MapCache(int cacheCount) {
		cachePool = new ConcurrentHashMap<>(cacheCount);
	}

	@SuppressWarnings("unchecked")
	public <T> T get(String key) {
		CacheObject cacheObject = cachePool.get(key);
		if (cacheObject != null) {
			long current = System.currentTimeMillis() / 1000;
			if (cacheObject.getExpired() < 0 || cacheObject.getExpired() > current) {
				Object value = cacheObject.getValue();
				return (T) value;
			}
		}
		return null;
	}

	public <T> T hget(String key, String field) {
		key = key + ":" + field;
		return get(key);
	}

	public void set(String key, Object value, long expired) {
		expired = expired < 0 ? expired : System.currentTimeMillis() + expired;
		CacheObject cacheObject = new CacheObject(key, value, expired);
		cachePool.put(key, cacheObject);
	}

	public void set(String key, Object value) {
		set(key, value , -1);
	}
	
	public void hset(String key, String field, Object value, long expired) {
		key = key + ":" + field;
		set(key, value, expired);
	}
	
	public void hset(String key, String field, Object value) {
		hset(key, field, value, -1);
	}
	
	public void del(String key) {
		cachePool.remove(key);
	}
	
	public void clear() {
		cachePool.clear();
	}
	
	static class CacheObject {

		private String key;

		private Object value;

		private long expired;

		public CacheObject(String key, Object value, long expired) {
			super();
			this.key = key;
			this.value = value;
			this.expired = expired;
		}

		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public Object getValue() {
			return value;
		}

		public void setValue(Object value) {
			this.value = value;
		}

		public long getExpired() {
			return expired;
		}

		public void setExpired(long expired) {
			this.expired = expired;
		}

	}
}
