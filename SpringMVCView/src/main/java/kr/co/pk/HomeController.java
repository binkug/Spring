package kr.co.pk;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.pk.item.service.ItemService;


@Controller
public class HomeController {
	
	@Autowired
	private ItemService itemServive;
	
	@RequestMapping(value = "fileview" , method = RequestMethod.GET)
	public String filewview(HttpServletRequest request , HttpServletResponse response) {
		itemServive.fileview(request, response);
		return "fileview";
	}
	
	@RequestMapping(value = "download" , method = RequestMethod.GET)
	public String download(HttpServletRequest request , HttpServletResponse response, Model model) {
		//아래 문장이 출력되지 않으면 View에서 요청과 Controller 처리 메소드의 RequestMapping이 맞지 않는 것입니다.
		//System.out.println("Controller");
		//파라미터 읽기
		String  filename = request.getParameter("filename");
		
		//이 줄에서 null이 리턴되면 ? 뒤에 이름과 위의 이름이 안맞는 것입니다.
		//System.out.println("파라미터:"+filename);
		//데이터를 저장
		model.addAttribute("filename",filename);
		
		return "download";
	}
	
	//엑셀로 출력하는 요청을 처리하는 메소드
	@RequestMapping(value = "item.xls" , method = RequestMethod.GET)
	public String excel(HttpServletRequest request , HttpServletResponse response,Model model) {
		//아이템 테이블의 데이터를 전부 읽어오는 서비스를 호출
		itemServive.allitem(request, response);
		model.addAttribute("list",request.getAttribute("list"));
		return "excel";
	}
	
	//엑셀로 출력하는 요청을 처리하는 메소드
	@RequestMapping(value = "pdf.pdf" , method = RequestMethod.GET)
	public String pdf(HttpServletRequest request , HttpServletResponse response,Model model) {
		//아이템 테이블의 데이터를 전부 읽어오는 서비스를 호출
		itemServive.allitem(request, response);
		model.addAttribute("list",request.getAttribute("list"));
		return "pdf";
	}
	
	//엑셀로 출력하는 요청을 처리하는 메소드
	@RequestMapping(value = "item.json" , method = RequestMethod.GET)
	public String json(HttpServletRequest request , HttpServletResponse response,Model model) {
		//아이템 테이블의 데이터를 전부 읽어오는 서비스를 호출
		itemServive.allitem(request, response);
		model.addAttribute("list",request.getAttribute("list"));
		return "itemlist";
	}
	
	
}
