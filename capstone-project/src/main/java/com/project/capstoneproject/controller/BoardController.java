package com.project.capstoneproject.controller;

import com.project.capstoneproject.entity.DeliveryBoard;
import com.project.capstoneproject.entity.ItemBoard;
import com.project.capstoneproject.service.DeliveryBoardService;
import com.project.capstoneproject.service.ItemBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    @Autowired
    private ItemBoardService itemBoardService;

    @Autowired
    private DeliveryBoardService deliveryBoardService;

    //물건

    @GetMapping("/itemboard/write")
    public String itemBoardWriteForm() {

        return "itemboardwrite";
    }


    @PostMapping("/itemboard/writepro")
    public String itemBoardWritePro(ItemBoard itemboard) {

        itemBoardService.write(itemboard);
        return "";
    }

    @GetMapping("/itemboard/list")
    public String itemBoardList(Model model) {

        model.addAttribute("list", itemBoardService.itemBoardList());

        return "itemboardlist";
    }

    @GetMapping("/itemboard/view")
    public String itemboardView(Model model, Integer item_post_seq) {

        model.addAttribute("itemboard", itemBoardService.itemBoardView(item_post_seq));
        return "itemboardview";
    }

    @GetMapping("/itemboard/delete")
    public String boardDelete(Integer item_post_seq) {

        itemBoardService.itemBoardDelete(item_post_seq);
        return "redirect:/itemboard/list";
    }

    @GetMapping("/itemboard/modify/{item_post_seq}")
    public String itemboardModify(@PathVariable("item_post_seq" Integer item_post_seq) {

        return "boardmodify";
    }




    //배달


    @PostMapping("/deliveryboard/writepro")
    public String deliveryBoardWritePro(DeliveryBoard deliveryboard) {

        deliveryBoardService.write(deliveryboard);
        return "";
    }

    @GetMapping("/deliveryboard/list")
    public String deliveryBoardList(Model model) {

        model.addAttribute("list", deliveryBoardService.deliveryBoardList());

        return "deliveryboardlist";
    }

    @GetMapping("/deliveryboard/view")
    public String deliveryboardView(Model model, Integer id) {

        model.addAttribute("itemboard", deliveryBoardService.deliveryBoardView(id));
        return "deliveryboardview";
    }


}
