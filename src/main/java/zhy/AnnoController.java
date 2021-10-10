package zhy;

import domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

/**
 * @author zhy
 * @create 2021-10-04 10:02
 */
@Controller
@RequestMapping("/anno")
public class AnnoController {

    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "name",required = true) String username){
        System.out.println(username);
        System.out.println("执行");
        return "success";
    }

    @RequestMapping("/myTest")
    public String myTest(String username,String password){
        System.out.println("用户名:"+username);
        System.out.println("密码:"+password);
        return "success";
    }

    @RequestMapping("/myTest2")
    public String myTest(@RequestBody String body){
        System.out.println(body);
        return "success";
    }

    @RequestMapping("/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable(name = "sid") String id){
        System.out.println("执行了");
        System.out.println(id);
        return "success";
    }

    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept") String header){

        System.out.println("执行了.....");
        System.out.println(header);
        return "success";
    }
    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookieValue){

        System.out.println("执行了");
        System.out.println(cookieValue);
        return "success";
    }

    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("abc") User user){
        System.out.println("testAttr...");
        System.out.println(user);
        return "success";
    }
    @ModelAttribute
    public void showUser(String uname, Integer age,Map<String,User> map){
//        System.out.println("uname:"+uname);
//        User user = new User();
//        user.setUname(uname);
//        user.setAge(age);
//        user.setDate(new Date());
//        map.put("abc",user);
    }

    @RequestMapping("/testSessionAttribute")
    public String testSessionAttribute(Model model){
        System.out.println("test SessionAttr");
        model.addAttribute("msg","lwx");
        return "success";
    }
}
