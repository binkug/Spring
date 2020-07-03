package mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mybatis.domain.GoodVO;

//bean�� �ڵ� ������ �� �ֵ��� ���ִ� ������̼�
//Component, Controller, Service, Repository
@Repository
public class GoodDAO {
	//�����ͺ��̽� ���� �����ӿ�ũ�� ����
	//������ �ڷ����� bean�� ������ �ڵ����� �������ִ� ������̼�
	@Autowired
	private SqlSession sqlSession;
	
	//���̺��� ��ü �����͸� �������� �޼ҵ�
	public List<GoodVO> allgood(){
		return sqlSession.selectList("good.allgood");
	}
}






