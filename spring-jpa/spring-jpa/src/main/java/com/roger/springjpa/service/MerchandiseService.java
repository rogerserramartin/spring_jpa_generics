package com.roger.springjpa.service;

import com.roger.springjpa.entity.Merchandise;
import com.roger.springjpa.repository.MerchandiseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class MerchandiseService {

    @Autowired
    MerchandiseRepository merchandiseRepository;

    public List<Merchandise> getAllMerchandising(){
        return merchandiseRepository.findAll();

    }

    public Merchandise findMerchadiseById(long id){
        return merchandiseRepository.findById(id).get();
    }

    @Transactional
    public void saveMerchandise(Merchandise merchandise){
        merchandiseRepository.save(merchandise);
    }

    @Transactional
    public void updateMerchandise(Merchandise merchandise) {
        merchandiseRepository.updateMerchandise(merchandise.getBrand(), merchandise.getPrice(), merchandise.getId());
    }

    @Transactional
    public void deleteMerchandise(Merchandise merchandise) {
        merchandiseRepository.deleteMerchandise(merchandise.getId());
    }



}
