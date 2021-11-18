package org.zenika.com.sample.repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;
import org.zenika.com.sample.model.User;

@Repository
public class UserRepository {
	private Map<String, User> userRecords;

	private UserRepository() {
		userRecords = new ConcurrentHashMap<>();
	}

	public User save(final String id, final User user) {
		userRecords.put(id, user);
		return user;
	}

	public User findById(final String id) {
		return userRecords.get(id);
	}

	public void deleteById(final String id) {
		userRecords.remove(id);
	}
}
