package com.pluralsight.psfundamentals.services;

import com.pluralsight.psfundamentals.models.Release;
import com.pluralsight.psfundamentals.repositories.ReleaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ReleaseServiceImpl implements ReleaseService {
    @Autowired
    private ReleaseRepository releaseRepository;

    @Override
    public Iterable<Release> listReleases() {
        return releaseRepository.findAll();
    }

}
