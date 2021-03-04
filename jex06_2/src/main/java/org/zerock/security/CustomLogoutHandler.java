package org.zerock.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.LogoutHandler;

import lombok.extern.log4j.Log4j;

@Log4j
public class CustomLogoutHandler implements LogoutHandler {

	@Override
	public void logout(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {
		
		log.info("1 logout --------------------------------------");
		log.info("2 logout --------------------------------------");
		
		if(authentication != null) {
			SecurityContextHolder.getContext().setAuthentication(null);
			log.info("3 logout --------------------------------------"); 
		}
		
	}

}
