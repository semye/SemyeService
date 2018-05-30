package com.cms.semye.serviceimpl;

import com.cms.semye.bean.Characters;
import com.cms.semye.bean.Response;
import com.cms.semye.dao.CharactersDao;
import com.cms.semye.http.ResponseStatus;
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
    public Response<List<Characters>> getCharactersList() {
        Response<List<Characters>> repResponse = new Response<List<Characters>>();
        try {
            List<Characters> characters = charactersDao.queryCharactersList();
            if (characters != null) {
                repResponse.setCode(ResponseStatus.SUCCESS);
                repResponse.setMessage("获取数据成功");
                repResponse.setData(characters);
            } else {
                repResponse.setCode(ResponseStatus.SUCCESS);
                repResponse.setMessage("获取数据失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            repResponse.setCode(ResponseStatus.FAILURE);
            repResponse.setMessage("查询数据库失败");
        }
        return repResponse;
    }

}
