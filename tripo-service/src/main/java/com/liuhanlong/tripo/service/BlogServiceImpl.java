package com.liuhanlong.tripo.service;

import com.liuhanlong.tripo.api.blog.Blog;
import com.liuhanlong.tripo.api.blog.BlogService;

import java.util.List;

/**
 * User: liuhanlong
 * Email: liuhanlong3304@126.com
 * Time: 16/12/8 下午10:45
 */
public class BlogServiceImpl implements BlogService {
    public List<Blog> list() {
        return null;
    }

    public Blog get(long id) {
        Blog blog = new Blog();
        blog.setId(id);
        blog.setTitle("hello");
        blog.setContent("content hello");
        blog.setName("name");
        return blog;
    }

    public Blog save(Blog blog) {
        return null;
    }
}
