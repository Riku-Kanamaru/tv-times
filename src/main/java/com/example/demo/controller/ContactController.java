package com.example.demo.controller;

import com.example.demo.Prefecture;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class ContactController {

    @GetMapping("/contact")
    public String contact(@RequestParam(value = "prefecture", required = false) String selectedPrefectureName, Model model) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedNow = now.format(formatter);
        model.addAttribute("now", formattedNow);

        // 都道府県をモデルに追加
        model.addAttribute("prefectures", Prefecture.values());

        // 選択された都道府県の県庁所在地を取得してモデルに追加
        if (selectedPrefectureName != null && !selectedPrefectureName.isEmpty()) {
            try {
                Prefecture selectedPrefecture = Prefecture.valueOf(selectedPrefectureName);
                model.addAttribute("selectedPrefecture", selectedPrefecture); // 選択された都道府県をモデルに追加
                model.addAttribute("capital", selectedPrefecture.getCapital());
            } catch (IllegalArgumentException e) {
                // エラー処理（例外が発生した場合の処理を記述）
                // 例: 都道府県が見つからない場合の処理
            }
        }

        return "contact";
    }
}
