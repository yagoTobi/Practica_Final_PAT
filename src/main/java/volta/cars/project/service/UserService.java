package volta.cars.project.service;

import java.util.Optional;

import volta.cars.project.model.UserModel;

public interface UserService {
    Iterable<UserModel> retrieveAll();
    void createUserMember(UserModel newMember);
    Optional<UserModel> getUserByEmail(String mail);
}
