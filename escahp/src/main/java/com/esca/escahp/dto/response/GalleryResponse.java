package com.esca.escahp.dto.response;

import com.esca.escahp.domain.Gallery;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class GalleryResponse {
    @ApiModelProperty(value = "게시물 번호(PK)")
    private Long id;

    @ApiModelProperty(value = "카테고리")
    private String category;

    @ApiModelProperty(value = "게시물 제목")
    private String title;

    @ApiModelProperty(value = "게시물 내용")
    private String content;

    @ApiModelProperty(value = "작성자 아이디")
    private String writer;

    @ApiModelProperty(value = "첨부파일")
    private String file;

    @ApiModelProperty(value = "작성일자")
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "수정일자")
    private LocalDateTime updatedAt;

    @ApiModelProperty(value = "삭제일자")
    private LocalDateTime deletedAt;

    @ApiModelProperty(value = "삭제여부")
    private String deleteYn;

    @ApiModelProperty(value = "조회수")
    private long viewCnt;

    @ApiModelProperty(value = "좋아요 수")
    private int likes;

    public GalleryResponse(Gallery gallery){
        this.id = gallery.getId();
        this.category = gallery.getCategory();
        this.title = gallery.getTitle();
        this.content = gallery.getContent();
        this.writer = gallery.getWriter();
        this.file = gallery.getFile();
        this.createdAt = gallery.getCreatedAt();
        this.deletedAt = gallery.getDeletedAt();
        this.updatedAt = gallery.getUpdatedAt();
        this.deleteYn = gallery.getDeleteYn();
        this.viewCnt = gallery.getViewCnt();
        this.likes = gallery.getLikes();

    }
}
