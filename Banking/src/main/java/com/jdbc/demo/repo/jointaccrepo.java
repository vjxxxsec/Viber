package com.jdbc.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.jdbc.demo.model.jointreg;
@Repository
public interface jointaccrepo extends JpaRepository<jointreg, String>{


}
