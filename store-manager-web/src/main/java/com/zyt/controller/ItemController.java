package com.zyt.controller;

import com.zyt.pojo.TbItem;
import com.zyt.service.ItemService;
import com.zyt.service.impl.ItemServiceImpl;
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
}
