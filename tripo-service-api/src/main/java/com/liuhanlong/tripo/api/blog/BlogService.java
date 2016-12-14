package com.liuhanlong.tripo.api.blog;

import java.util.List;

/**
 * User: liuhanlong
 * Email: liuhanlong3304@126.com
 * Time: 16/12/8 下午10:41
 */
public interface BlogService {

    List<Blog> list();

    Blog get(long id);

    Blog save(Blog blog);

}
