package com.pluralsight.psfundamentals.repositories;

import com.pluralsight.psfundamentals.models.Application;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends CrudRepository<Application, Long> {
}
