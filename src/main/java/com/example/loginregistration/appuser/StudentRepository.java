package com.example.loginregistration.appuser;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface StudentRepository {

    Optional<User> findByEmail(String email);
}
