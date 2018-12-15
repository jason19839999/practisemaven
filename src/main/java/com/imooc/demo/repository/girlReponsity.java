package com.imooc.demo.repository;


import com.imooc.demo.domain.viewModel.girl_info;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
@Service
public interface girlReponsity extends CrudRepository<girl_info, Long> {
    public List<girl_info> findAllBy();


}
