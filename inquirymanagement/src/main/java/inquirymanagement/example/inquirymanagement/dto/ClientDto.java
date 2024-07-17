package inquirymanagement.example.inquirymanagement.dto;

import java.time.LocalDate;
import lombok.Data;

@Data
public class ClientDto {
    /** ID */
    private Integer clientId;

    /** 顧客名 */
    private String clientName;

    /** 顧客名カナ */
    private String clientKanaName;

    /** 顧客名略称 */
    private String clientShortName;

    /** 連絡先 */
    private String contactAddress;

    /** 住所 */
    private String streetAddress;

    /** 契約内容 */
    private String contractContent;

    /** 登録日時 */
    private LocalDate acceptAt;

    /** 更新日時 */
    private LocalDate updateAt;

    /** 登録者ユーザID */
    private Integer registerUserId;

    /** 更新者ユーザID */
    private Integer updateUserId;
}
