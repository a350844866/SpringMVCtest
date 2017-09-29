package controller;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.xml.ws.RespectBinding;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import pojo.User;

//@Controller
public class JsonController {
	
	@RequestMapping("/addUserJson")
	public String addUserAction(){
		
		
		return "addUser";
	}

//    @RequestMapping("/registerAction")
//    @ResponseBody
//    public User registrUser(User user,Model model) throws IOException{
////    	model.addAttribute("msg",user.toString()+"frind="+ Arrays.toString(friend));
////    	FileUtils.writeByteArrayToFile(new File("C:\\a.jpg"),file.getBytes());
////    	model.addAttribute("msg","文件上传成功");
////    	model.addAttribute("msg",user);
//    	return user;
//    }
    
    
    
    
    
//    @InitBinder
//    public void InitBinder (ServletRequestDataBinder binder){
//        //注册自定义编辑器
//        binder.registerCustomEditor(
//                java.util.Date.class,
//                new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
//    }
	
}
