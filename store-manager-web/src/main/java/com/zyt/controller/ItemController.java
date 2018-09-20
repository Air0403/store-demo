package com.zyt.controller;

import com.zyt.common.pojo.EUDataGridResult;
import com.zyt.pojo.TbItem;
import com.zyt.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/item/{id}")
    @ResponseBody
    public TbItem getItemById(@PathVariable Long id) {
        TbItem tbItem = itemService.getItemById(id);
        return tbItem;
    }

    @RequestMapping("/item/list")
    @ResponseBody
    public EUDataGridResult getItemList(Integer page, Integer rows) {
        EUDataGridResult euDataGridResult = itemService.getItemList(page, rows);
        return euDataGridResult;
    }
}
