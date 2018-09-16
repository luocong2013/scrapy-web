package com.ccyw.scrapyweb.repository;

import com.ccyw.scrapyweb.model.Image;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author luocong
 * @version 1.0.0
 * @date 2018/6/7 12:36
 */
public interface ImageRepository extends MongoRepository<Image, String> {

}
