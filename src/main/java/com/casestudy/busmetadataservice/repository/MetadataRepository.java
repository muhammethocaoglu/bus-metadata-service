package com.casestudy.busmetadataservice.repository;

import com.casestudy.busmetadataservice.entity.Metadata;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MetadataRepository extends JpaRepository<Metadata, Integer> {
}
