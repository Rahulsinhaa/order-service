package com.order.oreder.service.service;
import com.order.oreder.service.dto.ImageDto;
import com.order.oreder.service.model.Image;
import com.order.oreder.service.reposetory.ImageReposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ImageService {
    @Autowired
    private ImageReposetory imageReposetory;

    public Image addImage(Image image) {
        return imageReposetory.save(image);
    }

    public String deleteImage(Long id) {
        imageReposetory.deleteById(id);
        return "order dleted";
    }

    public String updateImage(Image image, Long id) {
        Optional<Image> image1 = imageReposetory.findById(id);
        if (image1.isPresent()) {
            imageReposetory.save(image);
            return "image updated";
        } else {
            return "no ddata with this id found";
        }
    }


    public List<ImageDto> getAllImages() {
        List<Image> image = imageReposetory.findAll();

        List<ImageDto> imageDtos = image.stream()
                                           .map(images -> {
                                               ImageDto imageDto = new ImageDto();
                                               imageDto.setImageId(images.getImageId());
                                               imageDto.setImageUrl(images.getImageUrl());
                                               imageDto.setImageName(images.getImageName());
                                               return imageDto;
                                           })
                                           .collect(Collectors.toList());
        return imageDtos;
    }


}
