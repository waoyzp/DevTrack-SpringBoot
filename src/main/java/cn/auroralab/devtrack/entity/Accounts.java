package cn.auroralab.devtrack.entity;

import java.time.LocalDateTime;
import java.sql.Blob;
import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户账号信息
 * </p>
 *
 * @author Guanyu Hu
 * @since 2022-10-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Accounts implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户uuid
     */
    private byte[] userUuid;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码的MD5值
     */
    private byte[] passwordDigest;

    /**
     * 头像，使用二进制保存
     */
    private Blob avatar;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 注册时间
     */
    private LocalDateTime registrationTime;

    /**
     * 注销时间
     */
    private LocalDateTime cancellationTime;

    /**
     * 上次登录时间
     */
    private LocalDateTime lastLoginTime;


}
