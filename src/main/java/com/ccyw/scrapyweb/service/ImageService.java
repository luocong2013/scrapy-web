package com.ccyw.scrapyweb.service;

import com.ccyw.scrapyweb.model.Image;

import java.util.List;

/**
 * @author luocong
 * @version 1.0.0
 * @date 2018/6/7 12:42
 */
public interface ImageService {

    /**
     * 保存图片
     * @param image
     * @return
     */
    void save(Image image);

    /**
     * 批量保存图片
     * @param images
     * @return
     */
    void batchSave(List<Image> images);

    /**
     * 删除图片
     * @param image
     */
    void delete(Image image);

    /**
     * 通过图片ID删除图片
     * @param id
     * @return
     */
    void deleteById(String id);

    /**
     * 获取所图片
     * @return
     */
    List<Image> getAllImage();

    /**
     * 通过图片ID获取图片
     * @param id
     * @return
     */
    Image getImageById(String id);



}
