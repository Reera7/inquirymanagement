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
@Table(name = "client")
@Data
public class ClientEntity {
    /** ID */
    @Id
    @Column(name = "client_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clientId;

    /** 顧客名 */
    @Column(name = "client_name")
    private String clientName;

    /** 顧客名カナ */
    @Column(name = "client_kana_name")
    private String clientKanaName;

    /** 顧客名略称 */
    @Column(name = "client_short_name")
    private String clientShortName;

    /** 連絡先 */
    @Column(name = "contact_address")
    private String contactAddress;

    /** 住所 */
    @Column(name = "street_address")
    private String streetAddress;

    /** 契約内容 */
    @Column(name = "contract_content")
    private String contractContent;

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

    /** UserEntityとJoin(多対1) */
    @ManyToOne
    @JoinColumn(name = "register_user_id", insertable = false, updatable = false)
    private UserEntity registerUserEntity;

    /** UserEntityとJoin(多対1) */
    @ManyToOne
    @JoinColumn(name = "update_user_id", insertable = false, updatable = false)
    private UserEntity updateUserEntity;
}
