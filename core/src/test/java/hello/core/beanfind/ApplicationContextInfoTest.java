package hello.core.beanfind;

import hello.core.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Objects;

public class ApplicationContextInfoTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("모든 빈을 출력한다")
    void displayAllBeanTest() {
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for(String name : beanDefinitionNames) {
            Object bean = ac.getBean(name);
            System.out.println("bean = " + bean);
        }
    }

    @Test
    @DisplayName("내가 설정한 빈만 출력한다")
    void displayApplicationBeanTest() {
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for(String name : beanDefinitionNames) {
            BeanDefinition beanDefinition = ac.getBeanDefinition(name);

            // ROLE_APPLICATION : 직접 등록한 애플리케이션 빈
            // ROLE_INFRASTRUCTURE : 스프링이 내부에서 사용하는 빈
            if(beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION) {
                Object bean = ac.getBean(name);
                System.out.println("bean = " + bean);
            }
        }
    }
}