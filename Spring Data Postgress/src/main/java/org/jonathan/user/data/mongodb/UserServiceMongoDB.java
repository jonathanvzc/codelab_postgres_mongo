package org.jonathan.user.data.mongodb;

import org.jonathan.user.data.UserService;

import java.util.List;
import java.util.Optional;


public class UserServiceMongoDB implements UserService<User, String> {

    private final UserRepositoryMongo userRepositoryMongo;

    public UserServiceMongoDB(UserRepositoryMongo userRepositoryMongo) {
        this.userRepositoryMongo = userRepositoryMongo;
    }


    @Override
    public User save(User entity) {
        return userRepositoryMongo.save(entity);
    }

    @Override
    public Optional<User> findById(String id) {
        return userRepositoryMongo.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userRepositoryMongo.findAll();
    }

    @Override
    public void deleteById(String id) {
        userRepositoryMongo.deleteById(id);
    }

    @Override
    public void delete(User entity) {
        userRepositoryMongo.delete(entity);
    }
}
