package org.zenika.com.sample.repository;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;
import org.zenika.com.sample.model.User;

@Repository
public class UserRepository {
	private Map<String, User> userRecords;

	private UserRepository() {
		userRecords = new ConcurrentHashMap<>();
	}

	public User save(User user) {
		final String id = UUID.randomUUID().toString();
		user.setId(id);
		userRecords.put(id, user);
		return user;
	}

	public User findById(String id) {
		return userRecords.get(id);
	}

	public void deleteById(String id) {
		userRecords.remove(id);
	}
}
