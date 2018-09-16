package com.ccyw.scrapyweb.service.impl;

import com.ccyw.scrapyweb.model.Image;
import com.ccyw.scrapyweb.repository.ImageRepository;
import com.ccyw.scrapyweb.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author luocong
 * @version 1.0.0
 * @date 2018/6/12 16:30
 */
@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    private ImageRepository imageRepository;

    @Override
    public void save(Image image) {
        imageRepository.save(image);
    }

    @Override
    public void batchSave(List<Image> images) {
        imageRepository.saveAll(images);
    }

    @Override
    public void delete(Image image) {
        imageRepository.delete(image);
    }

    @Override
    public void deleteById(String id) {
        imageRepository.deleteById(id);
    }

    @Override
    public List<Image> getAllImage() {
        return imageRepository.findAll();
    }

    @Override
    public Image getImageById(String id) {
        Optional<Image> optional = imageRepository.findById(id);
        return optional.isPresent() ? optional.get() : null;
    }
}
