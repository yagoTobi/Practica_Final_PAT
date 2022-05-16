package volta.cars.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import volta.cars.project.model.UserModel;
import volta.cars.project.repository.UserRepository;
import volta.cars.project.service.UserService;

@Service
public class UserServiceImpl implements UserService{
    @Autowired 
    private UserRepository repository; 

    @Override 
    public Iterable<UserModel> retrieveAll()
    {
        return repository.findAll();
    }

    @Override
    public void createUserMember(UserModel newMember) {

<<<<<<< HEAD
        int userId= newMember.getUserId();

        repository.createUserMember(userId);
=======
        String user_name = newMember.getUser_name();
        String surname = newMember.getSurname();
        String email = newMember.getEmail();
        String password = newMember.getPassword();
        String dob = newMember.getDob();

        repository.addMember(user_name, surname, email, password, dob);
>>>>>>> 1d345e92668c861998922e36ff6d4397081bfd37

    }
    
}