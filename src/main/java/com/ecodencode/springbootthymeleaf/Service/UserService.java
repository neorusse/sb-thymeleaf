package com.ecodencode.springbootthymeleaf.Service;

import com.ecodencode.springbootthymeleaf.DaoRepository.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
  @Resource
  private UserDao userDao;

  public String getUser() {
    return userDao.getUser();
  }
}
