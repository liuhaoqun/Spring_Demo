package com.example.test.bean;

public class UserBean {
    private int id;
    private String name;
    private String password;
    private String role;

    //说明文档 https://blog.csdn.net/baidu_39298625/article/details/98102453?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522161535511716780266223025%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=161535511716780266223025&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~sobaiduend~default-2-98102453.first_rank_v2_pc_rank_v29&utm_term=spring+boot%E6%90%AD%E5%BB%BA


/**
 * SpringBoot大概分成4层
 *
 * （1）DAO层：包括XxxMapper.java(数据库访问接口类)，XxxMapper.xml(数据库链接实现)；
 * （这个命名，有人喜欢用Dao命名，有人喜欢用Mapper，看个人习惯了吧）
 *
 * （2）Bean层：也叫model层，模型层，entity层，实体层，就是数据库表的映射实体类，存放POJO对象；
 *
 * （3）Service层：也叫服务层，业务层，包括XxxService.java(业务接口类)，XxxServiceImpl.java（业务实现类）；
 * （可以在service文件夹下新建impl文件放业务实现类，也可以把业务实现类单独放一个文件夹下，更清晰）
 *
 * （4）Web层：就是Controller层，实现与web前端的交互。
 *
 */

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
