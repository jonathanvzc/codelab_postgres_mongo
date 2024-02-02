package org.jonathan.user.data.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepositoryMongo extends MongoRepository<User, String> {
}
