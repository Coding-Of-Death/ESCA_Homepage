package com.esca.escahp.service;

import com.esca.escahp.dto.GalleryBoardDto;

import java.util.List;

public interface I_GalleryBoardService {
    List<GalleryBoardDto> selectGalleryBoardList();

    GalleryBoardDto selectGalleryBoard(long id);

    void insertGalleryBoard(GalleryBoardDto params);

    void updateGalleryBoard(GalleryBoardDto params);

    void deleteGalleryBoard(GalleryBoardDto params);

    void updateViewCnt(long id);
}
