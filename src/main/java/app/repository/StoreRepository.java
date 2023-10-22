package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import app.models.Store;

public interface StoreRepository extends JpaRepository<Store, Integer>{
	@Query("SELECT s FROM Store s WHERE s.id = :id")
	Store findStoreById(@Param("id") int id);
}
