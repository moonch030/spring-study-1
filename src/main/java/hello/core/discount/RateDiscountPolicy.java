package hello.core.discount;

import hello.core.annotation.MainDiscountPolicy;
import hello.core.member.Grade;
import hello.core.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary //얘 우선 FixDiscountPolicy 보다
@MainDiscountPolicy //애노테이션 등록한것
public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPercent = 10;
    @Override
    public int discount(Member member, int prince) {
        if (member.getGrade() == Grade.VIP){
            return prince * discountPercent / 100;
        } else {
            return 0;
        }
    }
}
