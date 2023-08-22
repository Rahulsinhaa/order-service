package com.order.oreder.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ImageDto {
    @Id
    private Long imageId;

    private String imageUrl;

    private  String imageName;
}
