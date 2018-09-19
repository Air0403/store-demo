package com.zyt.service;

import com.zyt.common.pojo.EUDataGridResult;
import com.zyt.pojo.TbItem;

public interface ItemService {
    TbItem getItemById(long itemId);
    EUDataGridResult getItemList(int page, int rows);
}
