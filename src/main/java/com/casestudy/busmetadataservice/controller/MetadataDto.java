package com.casestudy.busmetadataservice.controller;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class MetadataDto {
    private Long id;
    private String licensePlate;
}
