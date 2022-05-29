package com.esca.escahp.controller;

import com.esca.escahp.dto.GalleryBoardDto;
import com.esca.escahp.dto.response.GalleryResponse;
import com.esca.escahp.service.GalleryService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gallery")
public class GalleryController{
    private final GalleryService galleryService;

    public GalleryController(GalleryService galleryService){
        this.galleryService = galleryService;
    }

    @ApiOperation(value = "갤러리 게시판의 전체 목록 보여주기")
    @GetMapping
    public ResponseEntity<List<GalleryResponse>> getAllGalleryBoard(){
        List<GalleryResponse> galleryBoard = galleryService.selectGalleryBoardList();
        return ResponseEntity.ok().body(galleryBoard);
    }

}
