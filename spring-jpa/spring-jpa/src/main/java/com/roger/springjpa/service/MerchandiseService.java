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

    public Merchandise findMerchandiseById(long id){
        return merchandiseRepository.findById(id).get(); //get es porque no podemos retornar optional directamente
    }

    @Transactional
    public void saveMerchandise(Merchandise merchandise){
        merchandiseRepository.save(merchandise);
    }

    @Transactional
    public void updateMerchandise(Merchandise merchandise){
        // hacer una query yo, customizable en el repositorio
    }

    @Transactional
    public void deleteMerchandise(Merchandise merchandise){
        merchandiseRepository.delete(merchandise);
    }



}
