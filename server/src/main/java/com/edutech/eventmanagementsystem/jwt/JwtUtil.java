package com.edutech.eventmanagementsystem.jwt;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.edutech.eventmanagementsystem.entity.User;
import com.edutech.eventmanagementsystem.repository.UserRepository;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class JwtUtil {

}