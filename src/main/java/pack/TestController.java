package pack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/")
	public String main() {
		System.out.println("메인 페이지 접속");
		return "index";
	}
	
	@RequestMapping("/test")
	public String test() {
		System.out.println("테스트 페이지 접속");
		return "testView";
	}
}
