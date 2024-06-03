package com.casestudy.busmetadataservice.service;

import com.casestudy.busmetadataservice.controller.MetadataDto;
import com.casestudy.busmetadataservice.repository.MetadataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MetadataService {
    private final MetadataRepository metadataRepository;

    public List<MetadataDto> getAll() {
        return metadataRepository.findAll().stream().map(metadata -> MetadataDto.builder()
                .id(metadata.getId())
                .licensePlate(metadata.getLicensePlate())
                .build()).toList();
    }

}
