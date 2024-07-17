package inquirymanagement.example.inquirymanagement.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import inquirymanagement.example.inquirymanagement.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    // 全件取得
    public List<UserEntity> findByDeleteFlagIsFalse();
}
