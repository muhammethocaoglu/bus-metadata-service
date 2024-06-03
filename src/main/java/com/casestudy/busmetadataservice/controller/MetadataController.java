package com.casestudy.busmetadataservice.controller;

import com.casestudy.busmetadataservice.service.MetadataService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/metadata")
@RequiredArgsConstructor
public class MetadataController {
    private final MetadataService metadataService;

    @GetMapping("")
    public ResponseEntity<List<MetadataDto>> getAll() {
        return new ResponseEntity<>(metadataService.getAll(), HttpStatus.OK);
    }
}

