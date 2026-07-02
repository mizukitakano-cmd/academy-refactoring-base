package ClassSeparation.service.user;

import java.util.List;
import java.util.ArrayList;



public class UserDeactivateService {
    
    // ユーザー退会
    public void withdraw(Long userId) {
    User user = userMapper.findById(userId);
    if (user == null) {
        throw new IllegalArgumentException("存在しません");
    }

    user.setDeleted(true);
    userMapper.update(user);
    }
}
