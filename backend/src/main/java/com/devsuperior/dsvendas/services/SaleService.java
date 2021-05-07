package com.devsuperior.dsvendas.services;

import com.devsuperior.dsvendas.dto.SaleDto;
import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    public Page<SaleDto> findAll(Pageable pageable) {
        Page<Sale> result = repository.findAll(pageable);
        return result.map(SaleDto::new);
    }

}
