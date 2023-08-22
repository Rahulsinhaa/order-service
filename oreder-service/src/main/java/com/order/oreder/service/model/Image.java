package com.order.oreder.service.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Document(value = "product")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Image {

    @MongoId
    private Long imageId;

    private String imageUrl;

    private  String imageName;

}
