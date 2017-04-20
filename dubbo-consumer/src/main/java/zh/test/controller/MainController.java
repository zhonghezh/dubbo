package zh.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import zh.test.common.model.Person;

/**
 * TITLE:
 * Created by ZhongHe.[Z] on 2017/4/20.
 */
@Controller
@ResponseBody
@RequestMapping(method = RequestMethod.GET)
public class MainController {

    @RequestMapping(value = "person")
    public Object getPerson(){
        Person person = new Person();
        person.setAge(26);
        person.setName("ZhangZhongHe");
        return person;
    }
}
