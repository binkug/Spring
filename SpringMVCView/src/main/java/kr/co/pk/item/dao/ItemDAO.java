package kr.co.pk.item.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.pk.item.domain.Item;

@Repository
public class ItemDAO {
	@Autowired
	//MyBatis를 xml로 이용할 때 사용하는 클래스
	private SqlSession sqlSession;
	
	//Hibernate는 세션 팩토리
	@Autowired
	private SessionFactory sessionFactory;
	
	//Item 테이블의 전체 데이터를 가져오는 메소드
	public List<Item> allitem(){
		//하이버네이트를 사용하려면 그대로 두고 MyBatis를 사용하려면 메소드 안의 주석을 해제하고 하이버네이트 호출 구문을 주석 처리
		//return sqlSession.selectList("item.allitem");
		return sessionFactory.getCurrentSession()
			.createCriteria(Item.class).list();
	}
	//Item 테이블에서 1개의 데이터를 가져오는 메소드
	public Item detailitem(Integer itemid) {
		//return sqlSession.selectOne("item.detailitem", itemid);
		return sessionFactory.getCurrentSession()
				.get(Item.class, itemid);
	}
}
