package ClassSeparation.service.user;

import java.util.List;
import java.util.ArrayList;


public class UserRegistrationService {


    // ユーザー登録
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    
    public UserRegistrationService(UserMapper userMapper, PasswordEncoder passwordEncoder) {
        this.userMapper = userMapper;
        this.passwordEncoder = passwordEncoder;
    }

    public User register(UserRegistrationForm form) {
        User existing = userMapper.findByEmail(form.getEmail());
        if (existing != null) {throw new IllegalArgumentException("既に登録されています");
    }

    User user = new User();
    user.setName(form.getName());
    user.setEmail(form.getEmail());
    user.setPassword(passwordEncoder.encode(form.getPassword()));
    userMapper.insert(user);

    return userMapper.findById(user.getId());
    }


}