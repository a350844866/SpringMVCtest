package controller;




import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;


import org.apache.commons.io.FileUtils;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import pojo.User;

@Controller
public class UserController {

    @RequestMapping("/addUser")
    public String addUserAction(){


        return "addUser";
    }



    
//    @RequestMapping("/registerAction")
//    public String registrUser(HttpServletRequest request,Model model){
//    	String name=request.getParameter("username");
//    	String password=request.getParameter("password");
//    	
//    	model.addAttribute("msg","shabi");
//    	return "message";
//    	
//    }
    //获取请求的参数,直接在方法参数的位置写接收的变量
//    @RequestMapping("/registerAction/{username}/{password}")
//    public String registrUser(@PathVariable String username,@PathVariable String password, Model model){
//    	model.addAttribute("msg",username+"==="+password);
//    	return "message";
//
//    }
    
    
    @RequestMapping("/registerAction")
    public String registrUser(User user,Model model,String[] friend) throws IOException{
    	model.addAttribute("msg",user.toString()+"frind="+ Arrays.toString(friend));
//    	FileUtils.writeByteArrayToFile(new File("C:\\a.jpg"),file.getBytes());
//    	model.addAttribute("msg","文件上传成功");
    	return "message";

    }


    @InitBinder
    public void InitBinder (ServletRequestDataBinder binder){
        //注册自定义编辑器
        System.out.print("22222");
        binder.registerCustomEditor(
                java.util.Date.class,
                new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }
    
    



}
