package ClassSeparation.service.user;

import java.util.List;
import java.util.ArrayList;


public class UserAuthenticationService<UserMapper> {
    
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    public UserAuthenticationService(UserMapper userMapper, PasswordEncoder passwordEncoder) {
        this.userMapper = userMapper;
        this.passwordEncoder = passwordEncoder;
    }


 // ログイン認証
    public User authenticate(LoginForm form) {
        User user = userMapper.findByEmail(form.getEmail());
        if (user == null) {throw new IllegalArgumentException("認証失敗");}

        if (!passwordEncoder.matches(form.getPassword(), user.getPassword())) {
            throw new IllegalArgumentException("認証失敗");
        }

        return user;
    }
}
