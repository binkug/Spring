package domain;

import org.springframework.context.annotation.*;

//Spring Bean Factory Ŭ������ ������ִ� ������̼�
//annotation: ���� ���Ǵ� ������ �ڵ带 �ϳ��� �ܾ�� ����� ���� ���ε�
//�ڹٿ����� �ϳ��� Ŭ�����Դϴ�.
//build �� �� ���� �ڹ� �ڵ�� ������ �˴ϴ�.
@Configuration
public class GoodFactory {
	//Spring���� Bean(�ν��Ͻ�)�� �������ִ� �޼ҵ带 ����� ���� ������̼�
	//Ŭ���� ���ο� ��������� �޼ҵ尡 �ν��Ͻ� ����(������Ƽ)�� �������
	//�ʴ´ٸ� static �޼ҵ�� ���� Ŭ������ ������ �ٷ� ȣ���� �� 
	//�ֵ��� ����� ���� ȿ�����Դϴ�.
	@Bean
	public static Good build() {
		Good good = new Good();
		return good;
	}
}




