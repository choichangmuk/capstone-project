package com.project.capstoneproject.service;

import com.project.capstoneproject.entity.DeliveryBoard;
import com.project.capstoneproject.entity.ItemBoard;
import com.project.capstoneproject.repository.DeliveryBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryBoardService {

    @Autowired
    private DeliveryBoardRepository deliveryBoardRepository;

    public void write(DeliveryBoard deliveryboard) {

        deliveryBoardRepository.save(deliveryboard);
    }

    public List<DeliveryBoard> deliveryBoardList() {

        return deliveryBoardRepository.findAll();
    }

    public DeliveryBoard deliveryBoardView(Integer id) {

        return deliveryBoardRepository.findById(id).get();
    }
}
