package com.cms.semye.serviceimpl;

import com.cms.semye.bean.Characters;
import com.cms.semye.dao.CharactersDao;
import com.cms.semye.service.CharactersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by semye on 2018/4/28.
 */
@Service("charactersService")
public class CharactersServceImpl implements CharactersService {


    @Autowired
    private CharactersDao charactersDao;

    @Override
    public List<Characters> getCharactersList() {
        return charactersDao.queryCharactersList();
    }

}
