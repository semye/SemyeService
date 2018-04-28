package com.cms.semye.service;

import com.cms.semye.bean.Characters;

import java.util.List;

/**
 * Created by yesheng on 16/2/12.
 */
public interface CharactersService {


    /**
     * 查询英雄联盟列表
     *
     * @return 英雄联盟列表
     */
    List<Characters> getCharactersList();

}
