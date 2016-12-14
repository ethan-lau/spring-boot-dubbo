package com.liuhanlong.tripo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.liuhanlong.tripo.api.blog.Blog;
import com.liuhanlong.tripo.api.blog.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * User: liuhanlong
 * Email: liuhanlong3304@126.com
 * Time: 16/12/8 下午11:02
 */
@RestController
@EnableAutoConfiguration
public class BlogController {

    @Reference
    private BlogService blogService;

    @RequestMapping("/index")
    @ResponseBody
    public String index(Long id) {
        Blog blog = blogService.get(id);
        return "index";
    }


}
