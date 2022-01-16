package com.roger.springjpa.repository;

import com.roger.springjpa.entity.Merchandise;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchandiseRepository extends CrudRepository<Merchandise, Long> {
}
