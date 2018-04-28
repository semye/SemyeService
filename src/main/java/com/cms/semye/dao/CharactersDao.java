package com.cms.semye.dao;

import com.cms.semye.bean.Characters;

import java.util.List;

/**
 * Created by semye on 2018/4/28.
 */
public interface CharactersDao {


    /**
     * 查询数据库中所有的英雄信息
     *
     * @return
     */
    List<Characters> queryCharactersList();

    /**
     * 从数据库中查询一个英雄信息
     *
     * @return
     */
    Characters queryCharacters();

    /**
     * 往数据库中插入一个英雄信息
     *
     * @param characters
     */
    void insertCharacters(Characters characters);

}
