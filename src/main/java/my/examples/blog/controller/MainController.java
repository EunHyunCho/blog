package my.examples.blog.controller;

import my.examples.blog.dto.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    @GetMapping("/main")
    public String main(Model model, @RequestParam(name="page", required = false, defaultValue = "1")int page){
        model.addAttribute("name", "urstory");

        //list 추가해보기
        List<Book> list = new ArrayList<>();
        list.add(new Book("1234", "title1", "author1", 50));
        list.add(new Book("3333", "title2", "author2", 100));
        list.add(new Book("4444", "title3", "author3", 200));
        list.add(new Book("5555", "title4", "author4", 300));
        model.addAttribute("list", list);
        return "index";
    }
}