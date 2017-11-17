package service;

import model.User;

public interface IUserService {
   void insertByObject(User user);
   User findByName(String name);
}
