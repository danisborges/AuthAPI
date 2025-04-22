package application.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import application.Service.AppUserDataService;
import application.Service.TokenService;
import ch.qos.logback.core.subst.Token;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

@Component
public class SecurityFilter extends OncePerRequestFilter {
    @Autowired
    private TokenService TokenService;
    @Autowired
    private AppUserDataService userDataService;
    
    private String getToken(HttpServletRequest request) {
        
    }
}
