package com.roger.springjpa.repository;

import com.roger.springjpa.entity.Merchandise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface MerchandiseRepository extends JpaRepository<Merchandise, Long> {


    @Modifying
    @Transactional
    @Query("UPDATE Merchandise m SET m.price = ?1, m.brand = ?2"
            + " WHERE m.id = ?3")
    void updateMerchandise(String name, Double price, Long id);

    @Modifying
    @Transactional
    @Query("DELETE FROM Merchandise m WHERE m.id = :id")
    void deleteMerchandise(@Param("id") Long id);

}
