package com.spring.crud.controller;

import com.spring.crud.config.StudentCustomDetails;
import com.spring.crud.payload.JwtAuthRequest;
import com.spring.crud.payload.JwtAuthResponse;
import com.spring.crud.security.jwt.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtils jwtUtils;

    @PostMapping("/login")
    public ResponseEntity<JwtAuthResponse> authenticateUser(@RequestBody JwtAuthRequest jwtAuthRequest)
    {
        Authentication authentication=authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(jwtAuthRequest.getEmail(),jwtAuthRequest.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt=jwtUtils.generateJwtToken(authentication);

//        StudentCustomDetails studentCustomDetails =(StudentCustomDetails) authentication.getPrincipal();
//
//        List<String> roles=studentCustomDetails.getAuthorities().stream().map(item->item.getAuthority()).collect(Collectors.toList());
//
//        return ResponseEntity.ok(new JwtResponse(jwt,
//                userDetails.getId(),
//                userDetails.getUsername(),
//                userDetails.getEmail(),
//                roles));

        return ResponseEntity.ok(new JwtAuthResponse(jwt));
    }
}
