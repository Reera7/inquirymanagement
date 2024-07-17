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
@Table(name = "inquiry")
@Data
public class InquiryEntity {
    /** ID */
    @Id
    @Column(name = "inquiry_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer inquiryId;

    /** 顧客ID */
    @Column(name = "client_id")
    private Integer clientId;

    /** 担当者ID */
    @Column(name = "manager_id")
    private Integer managerId;

    /** 問い合わせ者 */
    @Column(name = "inquiry_person")
    private String inquiryPerson;

    /** 問い合わせ内容 */
    @Column(name = "inquiry_content")
    private String inquiryContent;

    /** 対応内容 */
    @Column(name = "support_content")
    private String supportContent;

    /** ステータスID */
    @Column(name = "status_id")
    private Integer statusId;

    /** 受付日時 */
    @Column(name = "accept_at")
    private LocalDate acceptAt;

    /** 更新日時 */
    @Column(name = "update_at")
    private LocalDate updateAt;

    /** 完了日時 */
    @Column(name = "complete_at")
    private LocalDate completeAt;

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
    @JoinColumn(name = "status_id", insertable = false, updatable = false)
    private StatusEntity statusEntity;

    // /** ClientEntityとJoin(多対1) */
    @ManyToOne
    @JoinColumn(name = "client_id", insertable = false, updatable = false)
    private ClientEntity clientEntity;

    /** UserEntityとJoin(多対1) */
    @ManyToOne
    @JoinColumn(name = "manager_id", insertable = false, updatable = false)
    private UserEntity managerUserEntity;

    /** UserEntityとJoin(多対1) */
    @ManyToOne
    @JoinColumn(name = "register_user_id", insertable = false, updatable = false)
    private UserEntity registerUserEntity;

    /** UserEntityとJoin(多対1) */
    @ManyToOne
    @JoinColumn(name = "update_user_id", insertable = false, updatable = false)
    private UserEntity updateUserEntity;
}