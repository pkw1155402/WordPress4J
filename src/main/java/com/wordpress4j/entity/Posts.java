package com.wordpress4j.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wordpress4j.common.SwitchEnum;
import com.wordpress4j.common.PostStatusEnum;
import com.wordpress4j.common.PostTypeEnum;
import com.wordpress4j.util.TableUtils;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author souvc
 */
@Data
@Entity
@Table(name = TableUtils.TABLE_PREFIX + "posts"+ TableUtils.TABLE_SUFFIX)
@TableName(TableUtils.TABLE_PREFIX +"posts"+ TableUtils.TABLE_SUFFIX)
public class Posts implements Serializable {

    @Id
    @TableId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, length = 20)
    private Long id;

    @Column(name = "post_author", nullable = false, length = 20)
    private Long postAuthor;

    @CreatedDate
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "post_date")
    private Date postDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "post_date_gmt")
    private Date postDateGmt;

    @Enumerated(EnumType.STRING)
    @Column(name = "post_status")
    private PostStatusEnum postStatus;

    @Enumerated(EnumType.STRING)
    @Column(name = "comment_status")
    private SwitchEnum commentStatus;

    @Enumerated(EnumType.STRING)
    @Column(name = "ping_status")
    private SwitchEnum pingStatus;

    @Column(name = "post_password")
    private String postPassword;

    @Column(name = "post_name")
    private String postName;

    @LastModifiedDate
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "post_modified")
    private Date postModified;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "post_modified_gmt")
    private Date postModifiedGmt;

    @Column(name = "post_parent", length = 20)
    private Long postParent;

    @Column(name = "guid", length = 255)
    private String guid;

    @Column(name = "menu_order", length = 255)
    private Integer menuOrder;

    @Enumerated(EnumType.STRING)
    @Column(name = "post_type", length = 20)
    private PostTypeEnum postType;

    @Column(name = "post_mime_type", length = 100)
    private String postMimeType;

    @Column(name = "comment_count", length = 20)
    private Long commentCount;
}