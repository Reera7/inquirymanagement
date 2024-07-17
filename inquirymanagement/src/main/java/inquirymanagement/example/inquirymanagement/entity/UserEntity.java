package inquirymanagement.example.inquirymanagement.entity;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class UserEntity {
    /** ID */
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    /** ログイン名 */
    @Column(name = "login_name")
    private String loginName;

    /** 氏名 */
    @Column(name = "user_name")
    private String userName;

    /** 氏名カナ */
    @Column(name = "user_kana_name")
    private String userKanaName;

    /** パスワード */
    @Column(name = "password")
    private String password;

    /** 権限ID */
    @Column(name = "authority_id")
    private Integer authorityId;

    /** 登録日時 */
    @Column(name = "register_at")
    private LocalDate registerAt;

    /** 更新日時 */
    @Column(name = "update_at")
    private LocalDate updateAt;

    /** 登録者ユーザID */
    @Column(name = "register_user_id")
    private Integer registerUserId;

    /** 更新者ユーザID */
    @Column(name = "update_user_id")
    private Integer updateUserId;

    /** 削除フラグ */
    @Column(name = "delete_flag")
    private Integer deleteFlag;

    /** StatusEntityとJoin(多対1) */
    @ManyToOne
    @JoinColumn(name = "authority_id", insertable = false, updatable = false)
    private StatusEntity receptionStatusEntity;
}
