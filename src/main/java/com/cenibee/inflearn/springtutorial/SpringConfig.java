package com.cenibee.inflearn.springtutorial;

import com.cenibee.inflearn.springtutorial.repository.MemberRepository;
import com.cenibee.inflearn.springtutorial.repository.MemoryMemberRepository;
import com.cenibee.inflearn.springtutorial.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

}
