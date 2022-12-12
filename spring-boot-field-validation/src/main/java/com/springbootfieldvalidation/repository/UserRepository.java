package com.springbootfieldvalidation.repository;

import com.springbootfieldvalidation.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    @Query(value="SELECT * FROM users WHERE username=?1 AND password=?2",
            nativeQuery = true)
    User getUser(String username, String password);

}