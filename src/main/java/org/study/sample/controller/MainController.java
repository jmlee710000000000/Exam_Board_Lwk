package org.study.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
 @GetMapping("/")
 public String index() {
	 return "index";
 }
//@GetMapping("/test")
// public String test() {
//	return "test";
//}
//@PostMapping("/formPostEx")
//public String formPostEx(@RequestParam("user_id")String user_id,@RequestParam("user_pw")String user_pw) {
//	System.out.println("formPostEx() 메서드 작동");
//	System.out.println("user_id값 확인 : "+user_id);
//	System.out.println("user_pw값 확인 : "+user_pw);
//	return "redirect:/";
//}
}
