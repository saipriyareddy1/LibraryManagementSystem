package com.spring.demo.library.service;

import com.spring.demo.library.entity.LibraryMember;
import com.spring.demo.library.model.Member;
import com.spring.demo.library.repository.LibraryMemberRepository;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MemberService{


    @Autowired
    private LibraryMemberRepository memberRepository;

    public LibraryMember createMember(LibraryMember member){

        // call the database
        Integer memberId = new Random().nextInt();
        member.setMemberId(memberId);

        return memberRepository.save(member);
    }
    public LibraryMember getMember(Integer memberId) {
        Optional<LibraryMember> memberOptional =
                memberRepository.findById(memberId);
        return  memberOptional.orElse(new LibraryMember());
    }
    public LibraryMember updateMember(Integer memberId,LibraryMember member){

        // call the database
        member.setMemberId(memberId);

        return memberRepository.save(member);
    }
    public void deleteMember(Integer memberId) {
        // Delete a member by ID using Spring Data JDBC repository
        memberRepository.deleteById(memberId);
        // Alternatively, you can perform additional logic after deletion if needed
    }
}