package com.imooc.demo.domain.viewModel;

import javax.persistence.*;

/**
 * @描述
 * @创建人 shicong.zhang
 * @创建时间 $date$
 * @修改人和其它信息
 */
@Entity
@Table(name = "girl_info")
public class girl_info {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    int age;
    String cup_size;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCup_size() {
        return cup_size;
    }

    public void setCup_size(String cup_size) {
        this.cup_size = cup_size;
    }
}


