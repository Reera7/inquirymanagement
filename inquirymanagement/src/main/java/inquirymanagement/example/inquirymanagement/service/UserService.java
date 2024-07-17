package inquirymanagement.example.inquirymanagement.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import inquirymanagement.example.inquirymanagement.dto.UserDto;
import inquirymanagement.example.inquirymanagement.entity.UserEntity;
import inquirymanagement.example.inquirymanagement.repository.UserRepository;

@Service
public class UserService {
  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  // 氏名取得
  public List<UserDto> getUserList() {
    List<UserEntity> userEntityList = userRepository.findByDeleteFlagIsFalse();
    List<UserDto> userList = new ArrayList<>();

    for (UserEntity userEntity : userEntityList) {
      UserDto user = new UserDto();
      user.setUserId(userEntity.getUserId());
      user.setUserName(userEntity.getUserName());
      userList.add(user);
    }
    return userList;
  }
}
