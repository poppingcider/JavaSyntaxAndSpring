package com.training.training;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

// @Controller...画面遷移を制御するクラスに付与する。
@Controller
public class TrainingController {

    // @GetMapping("~")...HTTPリクエストのGETメソッドを受け付けるためのメソッドに付与する。
    @GetMapping("/")
    String Get() {
        // returnでview名を指定する。
        return "index";
    }

    // @PostMapping("~")...HTTPリクエストのPOSTメソッドを受け付けるためのメソッドに付与する。
    @PostMapping("/")
    String Post() {
        return "index";
    }

}
