package com.order.oreder.service.reposetory;

import com.order.oreder.service.model.Image;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageReposetory extends MongoRepository<Image, Long> {

}
