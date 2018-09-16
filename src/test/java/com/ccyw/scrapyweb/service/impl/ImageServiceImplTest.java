package com.ccyw.scrapyweb.service.impl;

import com.ccyw.scrapyweb.model.Image;
import com.ccyw.scrapyweb.service.ImageService;
import org.bson.types.Binary;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @author luoc
 * @version V1.0.0
 * @date 2018/6/13 21:46
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ImageServiceImplTest {

    @Autowired
    private ImageService imageService;

    @Test
    public void getAllImage() {

    }

    @Test
    public void getImageById() {
        Image image = imageService.getImageById("5b210b0e9afe1307621163b0");
        System.out.println(image.getImage_title());
        Binary image_bin = image.getImage_bin();
        try {
            OutputStream out = new FileOutputStream("e:/" + image.getImage_name());
            out.write(image_bin.getData());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}