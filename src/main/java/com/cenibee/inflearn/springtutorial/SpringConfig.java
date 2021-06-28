package com.cenibee.inflearn.springtutorial;

import com.cenibee.inflearn.springtutorial.aop.TimeTraceAop;
import com.cenibee.inflearn.springtutorial.repository.JpaMemberRepository;
import com.cenibee.inflearn.springtutorial.repository.MemberRepository;
import com.cenibee.inflearn.springtutorial.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

//    @Bean
//    public TimeTraceAop timeTraceAop() {
//        return new TimeTraceAop();
//    }

//    @Bean
//    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//        return new JdbcMemberRepository(dataSource);
//        return new JdbcTemplateMemberRepository(dataSource);
//        return new JpaMemberRepository(entityManager);
//        return memberRepository;
//    }

}
