package hello.core.autowired;

import hello.core.AutoAppConfig;
import hello.core.discount.DiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.Grade;
import hello.core.member.Member;
import lombok.RequiredArgsConstructor;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class AllBeanTest {

    @Test
    void findAllBean() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class, DiscountService.class);

        DiscountService discountService = ac.getBean(DiscountService.class);
        Member member = new Member(1L, "mem", Grade.VIP);

        int discountPirce = discountService.discount(member, 10000, "fixDiscountPolicy");
        Assertions.assertThat(discountPirce).isEqualTo(1000);

        discountPirce = discountService.discount(member, 10000, "rateDiscountPolicy");
        Assertions.assertThat(discountPirce).isEqualTo(1000);
    }

    @RequiredArgsConstructor
    static class DiscountService {
        private final Map<String, DiscountPolicy> discountPolicyMap;

        int discount(Member member, int price, String discountCode) {
            return discountPolicyMap.get(discountCode).discount(member, price);
        }
    }
}
