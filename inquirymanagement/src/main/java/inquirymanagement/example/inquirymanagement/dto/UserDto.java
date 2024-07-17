package inquirymanagement.example.inquirymanagement.dto;

import java.time.LocalDate;
import lombok.Data;

@Data
public class UserDto {
    /** ID */
    private Integer userId;

    /** ログイン名 */
    private String loginName;

    /** 氏名 */
    private String userName;

    /** 氏名カナ */
    private String userKanaName;

    /** パスワード */
    private String password;

    /** 権限ID */
    private Integer authorityId;

    /** 登録日時 */
    private LocalDate registerAt;

    /** 更新日時 */
    private LocalDate updateAt;

    /** 登録者ユーザID */
    private Integer registerUserId;

    /** 更新者ユーザID */
    private Integer updateUserId;
}
