package org.zenika.com.sample.services;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zenika.com.sample.model.User;
import org.zenika.com.sample.repository.UserRepository;

@Service
public class UserServices {

	@Autowired
	private UserRepository userRepository;

	public User createUser(final User user) {
		return userRepository.save(user);
	}

	public User getUserById(final String id) {
		return userRepository.findById(id);
	}

	public User updateUserById(final String id, final User user) {
		final User foundUser = this.getUserById(id);
		if (Objects.nonNull(foundUser)) {
			foundUser.setAge(user.getAge());
			foundUser.setFirstName(user.getFirstName());
			foundUser.setAge(user.getAge());
			return userRepository.save(user);
		}
		return null;
	}

	public String deleteUserById(final String id) {
		userRepository.deleteById(id);
		return String.format("User with %s removed", id);
	}
}
