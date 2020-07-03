package hibernate.dao;


import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hibernate.domain.Item;

@Repository
public class ItemDAO {
	@Autowired
	//하이버네이트 사용 객체
	private SessionFactory sessionFactory;
	
	//데이터 삽입
	@Transactional
	public void insert() {
		Item item = new Item();
		item.setCode(3);
		item.setName("쭈꾸미");
		item.setManufacture("서해");
		item.setPrice(5000);
		item.setBuiltdate(new Date());
		
		//데이터 삽입
		sessionFactory.getCurrentSession().save(item);
	}
	//데이터 수정
	@Transactional
	public void update() {
		Item item = new Item();
		item.setCode(1);
		item.setName("오징어");
		item.setManufacture("동해");
		item.setPrice(4000);
		item.setBuiltdate(new Date());
		
		//데이터 수정
		sessionFactory.getCurrentSession().update(item);
	}
	
	//데이터 삭제
	@Transactional
	public void delete() {
		Item item = new Item();
		item.setCode(1);
		
		//데이터 삭제
		sessionFactory.getCurrentSession().delete(item);
	}
	
	//전체 데이터 가져오기
	@Transactional
	public void allList() {
		//전체데이터 가져오기
		
		//criteria 사용
		//List<Item> list = sessionFactory.getCurrentSession().createCriteria(Item.class).list();
		//sql 사용
		List<Item> list = sessionFactory.getCurrentSession().createSQLQuery("select * from item").addEntity(Item.class).list();
		
		//데이터 출력
		for(Item item : list) {
			System.out.println(item);
		}
	}
	//기본키를 사용하여 데이터 한개 가져오기
	@Transactional
	public void ListOne() {
		//전체데이터 가져오기
		
		//criteria 사용
		//List<Item> list = sessionFactory.getCurrentSession().
		//sql 사용
		Item item = sessionFactory.getCurrentSession().get(Item.class, 1); //뒤에 숫자는 기본키
		System.out.println(item);
		
	}
}
