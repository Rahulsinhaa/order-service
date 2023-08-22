package com.order.oreder.service.controller;

import com.order.oreder.service.dto.ImageDto;
import com.order.oreder.service.model.Image;
import com.order.oreder.service.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/order")
@CrossOrigin("*")
public class ImageConroller {


    @Autowired
    private ImageService imageService;


    @GetMapping
    public ResponseEntity<List<ImageDto>> getAllImages() {
        List<ImageDto> images = imageService.getAllImages();
        return ResponseEntity.ok(images);
    }

    @PostMapping
    public ResponseEntity<Image> addImage(@RequestBody Image image) {
        Image addedImage = imageService.addImage(image);
        return ResponseEntity.ok(addedImage);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteImage(@PathVariable Long id) {
        imageService.deleteImage(id);
        return ResponseEntity.ok("Image deleted");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateImage(@PathVariable Long id, @RequestBody Image image) {
        String result = imageService.updateImage(image, id);
        if (result.equals("image updated")) {
            return ResponseEntity.ok(result);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
