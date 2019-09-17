package com.yan.controller;

import com.yan.entity.*;
import com.yan.entity.Class;
import com.yan.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/ac")
public class AcController {
    @Autowired
    private Acservice acservice;
    @Autowired
    private StudentService studentService;
    @Autowired
    private AlecturerService alecturerService;
    @Autowired
    private ScService scService;
    @Autowired
    private ClassroomSevice classroomSevice;

    //查询数据
    @RequestMapping("/acSelect")
    public String acSelect(ModelMap map, HttpServletRequest request){
        List<Class> acs = acservice.selectAc();
        map.addAttribute("acs",acs);
        return "classSelect";
    }

    //删除数据
    @RequestMapping("/deleteAc")
    @ResponseBody
    public int deleteAc(Integer id){
       int aid = acservice.deleteByPrimaryKey(id);
       if(aid == 1){
           return 1;
       }else {
           return 0;
       }
    }

    //查询所有学生及添加
    @RequestMapping("/selectStu")
    public String selectStu(ModelMap map, int cid){
        List<Students> students = studentService.selectStu();
        map.addAttribute("stu",students);
        map.addAttribute("cid",cid);
        return "inserAc";
    }

    //添加
    @RequestMapping("/inserAc")
    public String inserAc(int sid,int cid){
        Sc sc = new Sc();
        sc.setCid(cid);
        sc.setSid(sid);
        scService.insertSelective(sc);
        return "redirect:acSelect";
    }

    //分配讲师
    @RequestMapping("/selectAle")
    public String selectAle(ModelMap map,int cid){
        List<Alecturer> alecturers = alecturerService.selectAle();
        map.addAttribute("al",alecturers);
        map.addAttribute("cid",cid);
        return "alSelect";
    }
    //查询所有的从教室
    @RequestMapping("/selectClas")
    public String selectClas(ModelMap map){
        List<Classroom> classrooms = classroomSevice.selectCla();
        map.addAttribute("cla",classrooms);
        return "claInser";
    }
}
