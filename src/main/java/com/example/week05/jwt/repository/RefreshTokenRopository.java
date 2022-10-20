package com.example.week05.jwt.repository;

import com.example.week05.entity.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefreshTokenRopository extends JpaRepository<RefreshToken, Long> {

}