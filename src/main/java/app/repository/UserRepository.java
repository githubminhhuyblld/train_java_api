package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import app.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	@Query(value = "SELECT * FROM [User] WHERE id = :id", nativeQuery = true)
	User findUserById(@Param("id") int id);

}
