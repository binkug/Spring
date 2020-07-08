package kr.co.pk.item.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.pk.item.dao.ItemDAO;
import kr.co.pk.item.dao.ItemMapper;
import kr.co.pk.item.domain.Item;

@Service
public class ItemServiceImpl implements ItemService {
	//ServiceImpl 클래스에서 ItemDAO를 가지고 작업을 하면 XML 파일을 사용 하는 것이고 MyBatis를 ㅅ
	@Autowired
	//private ItemDAO itemDao;
	
	private ItemMapper itemDao;


	
	
	@Override
	@Transactional
	public void allitem(HttpServletRequest request, HttpServletResponse response) {
		//1.파라미터 읽기
		
		//2.필요한 처리 수행
		
		//3.DAO 메소드의 매개변수 생성
		
		//4.DAO 메소드를 호출
		List<Item> list = itemDao.allitem();
		//5.결과를 가공
		
		//6.결과를 저장 - REST API Server의 경우는 request에 저장
		request.setAttribute("list", list);
		
		
	}

	@Override
	@Transactional
	public void detailitem(HttpServletRequest request, HttpServletResponse response) {
		//요청 주소의 마지막 부분을 가져오기
		//localhost/detail/itemid
		String requestURI = request.getRequestURI();
		String [] ar = requestURI.split("/");
		String itemid = ar[ar.length-1];
		
		//DAO의 메소드를 호출
		Item item = itemDao.detailitem(Integer.parseInt(itemid));
		//결과를 저장
		request.setAttribute("item", item);
	}
}











