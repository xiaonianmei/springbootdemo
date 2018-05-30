package com.gradles.demo.controller;

import com.gradles.demo.pojo.Book;
import com.gradles.demo.service.BookServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController
{

    private BookServie bookServie;

    @Autowired
    public TestController(BookServie bookServie){
        this.bookServie=bookServie;
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
          return "hello world";
    }
    @RequestMapping("/test1")
    public String test1(){
        return "index";
    }

    @RequestMapping("/japtest")
    @ResponseBody
    public String save(String name){
         Book b= new Book();
         b.setName(name);
         Boolean result=bookServie.save(b);
         if(result){
             return "success";
         }
         return "fail";
    }

}
