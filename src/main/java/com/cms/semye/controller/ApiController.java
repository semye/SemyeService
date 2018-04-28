package com.cms.semye.controller;

import com.cms.semye.bean.Characters;
import com.cms.semye.bean.Response;
import com.cms.semye.service.CharactersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by yesheng on 16/2/2.
 * 接口调用
 */
@Controller
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private CharactersService userService;

    /**
     * 获取英雄列表
     * http://localhost:8080/api/getCharactersList
     *
     * @return 获取英雄列表
     */
    @RequestMapping(value = "/getCharactersList", method = {RequestMethod.GET})
    public
    @ResponseBody
    Response<List<Characters>> getCharactersList() {
        Response<List<Characters>> repResponse = new Response<List<Characters>>();
        try {
            List<Characters> characters = userService.getCharactersList();
            if (characters != null) {
                repResponse.setCode(0);
                repResponse.setMessage("获取数据成功");
                repResponse.setData(characters);
            } else {
                repResponse.setCode(0);
                repResponse.setMessage("获取数据失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            repResponse.setCode(-1);
            repResponse.setMessage("查询数据库失败");
        }
        return repResponse;
    }

}
