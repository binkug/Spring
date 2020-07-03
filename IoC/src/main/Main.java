package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import domain.Good;
import domain.GoodFactory;

public class Main {

	public static void main(String[] args) {
		/*
		//������̼��� �̿��ؼ� Bean�� ����
		AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(
				GoodFactory.class);
		Good good = context.getBean("build", Good.class);
		*/
		
		//XML�� �̿��ؼ� Bean�� ����
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext(
					"applicationContext.xml");
		Good good = context.getBean("good", Good.class);
		good.setNum(1);
		good.setName("���");
		System.out.println(good);
		
		Good good1 = context.getBean("good", Good.class);
		good1.setNum(2);
		good1.setName("�а�");
		System.out.println(good);
		
		//�ؽ��ڵ� ���
		System.out.println(System.identityHashCode(good));
		System.out.println(System.identityHashCode(good1));
		
		//����� ��� Ǯ�� �����ϰ� Ǯ�� ������ ����� ������ ������ �����մϴ�.
		int a = 10;
		int b = 10;
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
		context.close();
	}

}