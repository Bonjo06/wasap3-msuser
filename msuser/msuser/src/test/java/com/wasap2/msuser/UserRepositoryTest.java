package com.wasap2.msuser;

import com.wasap2.msuser.model.User;
import com.wasap2.msuser.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository repository;

    @Test
    void saveUser() {

        User user = new User("Pedro", "Online");

        User saved = repository.save(user);

        assertThat(saved.getId()).isNotNull();
    }

    @Test
    void findUserById() {

        User saved = repository.save(
                new User("Carlos", "Online")
        );

        User found = repository.findById(saved.getId()).orElse(null);

        assertThat(found).isNotNull();
        assertThat(found.getUsername()).isEqualTo("Carlos");
    }
}