package com.example.week05.jwt.repository;

import com.example.week05.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long>
    {
        Optional<Member> findByUsername (String username);
    }
