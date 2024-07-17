package inquirymanagement.example.inquirymanagement.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import inquirymanagement.example.inquirymanagement.entity.AuthorityEntity;

public interface AuthorityRepository extends JpaRepository<AuthorityEntity, Integer> {
  // 全件取得
  public List<AuthorityEntity> findByDeleteFlagIsFalse();
}
