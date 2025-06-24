package com.pluralsight.psfundamentals.repositories;

import com.pluralsight.psfundamentals.models.Release;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepository extends CrudRepository<Release, Long> {
}
