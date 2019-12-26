package com.hp.contorller;

import com.hp.pojo.User;
import com.hp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description 
 *  * @param null
 * @Return      
 * @Exception
 * @Author      Ankhci
 * @Date        2019/12/26 12:00
 */
@Controller
@RequestMapping("hello")
public class UserContorller {
    @Autowired
    private UserService userService;

    @RequestMapping("word")
    @ResponseBody
    public String say(){
        System.out.println("haha");
        return "success";
    }

    /**
     * @Description 查询
     *  * @param i
     * @Return
     * @Exception
     * @Author      Ankhci
     * @Date        2019/12/26 20:01
     */
    @GetMapping("/{id}")
    @ResponseBody
    public User queryUserById(@PathVariable("id") Long i){
        User user = userService.queryUserById(i);
        System.out.println(user+"查到的User");
        return user;
    }
    /**
     * @Description
     *  * @param i
     * @Return
     * @Exception   
     * @Author      Ankhci
     * @Date        2019/12/26 20:01
     */
    @GetMapping("/del/{ids}")
    @ResponseBody
    public String deleteUserById(@PathVariable("ids") Long i){
        userService.deleteUserById(i);
        System.out.println("根据Id删除数据");
        return "success";
    }
    /**
     * @Description 
     *  * @param null
     * @Return
     * @Exception   查所有
     * @Author      Ankhci
     * @Date        2019/12/26 20:02
     */
    @GetMapping("list")
    public String queryAllUser(Model model){
        List<User> userList = userService.queryAllUser();
        System.out.println("返回查所有页面");
        model.addAttribute("users",userList);
        return "item";
    }

}
