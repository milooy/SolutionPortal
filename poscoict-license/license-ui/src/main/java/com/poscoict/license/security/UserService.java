package com.poscoict.license.security;

import java.util.ArrayList;
import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

import com.poscoict.license.consts.Consts;
import com.poscoict.license.dao.UserDaoJdbc;
import com.poscoict.license.vo.UserInfo;

public class UserService implements UserDetailsService {

	private Logger logger = LoggerFactory.getLogger(getClass());
//	@Qualifier
	
	@Autowired UserDaoJdbc getUserDao;
	
//    private UserDao getUserDao {
//        ApplicationContext context = new GenericXmlApplicationContext( "applicationContext.xml" );
//        return context.getBean( "userDao", UserDaoJdbc.class );
//    }

	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
		logger.info("LoginCheck - ID: " + userId);
		boolean changePassword = false;

		StandardPasswordEncoder encoder = new StandardPasswordEncoder();

		UserInfo userInfo = getUserDao.get(userId.trim());
		logger.info("LoginCheck - ID: " + userInfo);
		String userPassword = userInfo.getUSER_PASSWORD();
		String userRole = userInfo.getUSER_TYPE();
		String userName = userInfo.getUSER_NAME();

		logger.info("LoginCheck - getUSER_PASSWORD: ");

		logger.info("LoginCheck - getUSER_PASSWORD: " + userInfo.getUSER_PASSWORD());
		logger.info("LoginCheck - getUSER_NAME: " + userInfo.getUSER_NAME());

		Collection<SimpleGrantedAuthority> roles = new ArrayList<SimpleGrantedAuthority>();
		roles.add(new SimpleGrantedAuthority(Consts.rolePrefix+userRole));

		if(encoder.matches(userId, userPassword)) changePassword=true;

		UserDetails user = new CustomUserDetails(userId, userPassword, userName, changePassword, roles);
		return user;
	}
}
