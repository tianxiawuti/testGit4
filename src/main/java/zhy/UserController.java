package zhy;

import domain.User;
import exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zhy
 * @create 2021-10-04 16:37
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testString")
    public String testString(Model model){
        System.out.println("方法执行");
        User user = new User();
        user.setUsername("美美");
        user.setPassword("123");
        user.setAge(30);
        model.addAttribute("user",user);
        return "success";
    }

    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("...");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("你好");
    }

    @RequestMapping("/testAjax")
    public @ResponseBody User testAjax(@RequestBody User user){
        System.out.println(user);
        user.setUsername("haha");
        user.setAge(40);
        return user;
    }

    @RequestMapping("/mytest")
    public void testSmt(@RequestBody String body){
        System.out.println(body);
    }

    @RequestMapping("/testException")
    public String testException() throws SysException {
        try {
            int i = 1/0;
        }catch (Exception e){
            e.printStackTrace();
            throw new SysException(e.getMessage());
        }
        return "success";
    }

    @RequestMapping("/testInterceptor")
    public String testInterceptor(){
        System.out.println("执行..");
        return "success";
    }
}
