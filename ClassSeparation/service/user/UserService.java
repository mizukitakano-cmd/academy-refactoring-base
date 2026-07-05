// 問3.以下のクラスを適切に分割してください。
package ClassSeparation.service.user;

import java.util.List;


public class UserService {
  

    private final UserRegistrationService registrationService;
    private final UserDeactivateService deactivateService;
    private final UserAuthenticationService authenticationService;
    private final UserSearchService searchService;

    public UserService(UserMapper userMapper, PasswordEncoder passwordEncoder) {
      this.registrationService = new UserRegistrationService(userMapper, passwordEncoder);
      this.deactivateService = new UserDeactivateService(userMapper);
      this.authenticationService = new UserAuthenticationService(userMapper, passwordEncoder);
      this.searchService = new UserSearchService(userMapper);
    }

    public User authenticate(LoginForm form) {
      return authenticationService.authenticate(form);
    }

    public List<User> getActiveUsers() {
      return searchService.getActiveUsers();
    }

    public boolean existsByEmail(String email) {
      return searchService.existsByEmail(email);
    }

    public void deactivate(Long userId) {
      deactivateService.deactivate(userId);
    }
}
