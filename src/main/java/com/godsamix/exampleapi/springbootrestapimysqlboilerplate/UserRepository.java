package com.godsamix.exampleapi.springbootrestapimysqlboilerplate;

import org.springframework.data.repository.CrudRepository;

//import  com.godsamix.exampleapi.springbootrestapimysqlboilerplate.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

}