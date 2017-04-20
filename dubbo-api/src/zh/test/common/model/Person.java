package zh.test.common.model;

import java.io.Serializable;

/**
 * TITLE:
 * Created by ZhongHe.[Z] on 2017/4/20.
 */
public class Person implements Serializable {

    private String name;

    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
