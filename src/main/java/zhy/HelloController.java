package zhy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author zhy
 * @create 2021-10-03 22:47
 */
@Controller
@RequestMapping("/user")
public class HelloController {

    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("Hello mvc");
        return "success";
    }

    @RequestMapping(path = "/testRequestMapping",params = {"username=heihei"},headers = {"Accept"})
    public String testRequestMapping(){
        System.out.println("Hello test");
        return "success";
    }
}
