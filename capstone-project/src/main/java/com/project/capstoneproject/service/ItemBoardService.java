package com.project.capstoneproject.service;

import com.project.capstoneproject.entity.ItemBoard;
import com.project.capstoneproject.repository.ItemBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemBoardService {

    @Autowired
    private ItemBoardRepository itemBoardRepository;

    // 게시글 작성
    public void write(ItemBoard itemboard) {

        itemBoardRepository.save(itemboard);
    }

    // 게시글 리스트 보여주기
    public List<ItemBoard> itemBoardList() {

        return itemBoardRepository.findAll();
    }

    // 게시글 상세보기
    public ItemBoard itemBoardView(Integer item_post_seq) {

        return itemBoardRepository.findById(item_post_seq).get();
    }

    // 게시글 삭제

    public void itemBoardDelete(Integer item_post_seq){
        itemBoardRepository.deleteById(item_post_seq);
    }
    
}
