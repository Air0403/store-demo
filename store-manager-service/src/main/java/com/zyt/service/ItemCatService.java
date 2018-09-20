package com.zyt.service;

import com.zyt.common.pojo.EUTreeNode;

import java.util.List;

public interface ItemCatService {
    List<EUTreeNode> getCatList(long id);
}
