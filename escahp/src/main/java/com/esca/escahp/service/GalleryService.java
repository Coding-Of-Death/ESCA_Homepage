package com.esca.escahp.service;

import com.esca.escahp.dao.GalleryRepository;
import com.esca.escahp.domain.Gallery;
import com.esca.escahp.dto.GalleryBoardDto;
import com.esca.escahp.dto.response.GalleryResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GalleryService  {

    private final GalleryRepository galleryRepository;

    public GalleryService(GalleryRepository galleryRepository) {
        this.galleryRepository = galleryRepository;
    }

    //@Override
    public List<GalleryResponse> selectGalleryBoardList() {
        List<Gallery> galleries = galleryRepository.findAll();

        return galleries.stream()
                .map(GalleryResponse::new)
                .collect(Collectors.toList());
    }

    //@Override
    public GalleryBoardDto selectGalleryBoard(long id) {
        return null;
    }

    //@Override
    public void insertGalleryBoard(GalleryBoardDto params) {

    }

    //@Override
    public void updateGalleryBoard(GalleryBoardDto params) {

    }

    //@Override
    public void deleteGalleryBoard(GalleryBoardDto params) {

    }

    //@Override
    public void updateViewCnt(long id) {

    }
}
