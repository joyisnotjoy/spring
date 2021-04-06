package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

// �ڵ������ϰ� �ϴ� ������̼�
// @Controller, @Service, @Repository, @Component, @RestController, @Advice
//WEB-INF/spring/root-context.xml ������ �Ǿ� �־�� �Ѵ�. component-scan
@Component
@Data
//setter�� getter�� @�� ���� �ڵ� ������ �ȴ�.
public class Restaurant {
	
	//@Setter - lombok ���, @Autowired - Spring ���
	// ��� ��� ������ ������̼� : @Autowired -Spring, @Inject - java
	@Setter(onMethod_ = @Autowired)
	private Chef chef;

}
