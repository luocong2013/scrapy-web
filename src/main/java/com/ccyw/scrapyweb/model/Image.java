package com.ccyw.scrapyweb.model;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;

/**
 * @author luocong
 * @version 1.0.0
 * @date 2018/6/7 12:37
 */
public class Image {

    @Id
    private String id;
    /**
     * 图片标题
     */
    private String image_title;
    /**
     * 图片链接
     */
    private String image_link;
    /**
     * 图片名
     */
    private String image_name;
    /**
     * 图片数据（二进制）
     */
    private Binary image_bin;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage_title() {
        return image_title;
    }

    public void setImage_title(String image_title) {
        this.image_title = image_title;
    }

    public String getImage_link() {
        return image_link;
    }

    public void setImage_link(String image_link) {
        this.image_link = image_link;
    }

    public String getImage_name() {
        return image_name;
    }

    public void setImage_name(String image_name) {
        this.image_name = image_name;
    }

    public Binary getImage_bin() {
        return image_bin;
    }

    public void setImage_bin(Binary image_bin) {
        this.image_bin = image_bin;
    }
}
