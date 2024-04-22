package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; // 追加

@Controller
public class ContactController {
    @RequestMapping("/contact")
    public String contact(Model model){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); // フォーマットを指定
        String formattedNow = now.format(formatter); // フォーマットして文字列に変換
        model.addAttribute("now", formattedNow); // フォーマットされた文字列をモデルに追加
        return "contact";
    }
}
