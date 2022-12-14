package cn.auroralab.devtrack.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 项目成员映射
 * </p>
 *
 * @author Guanyu Hu
 * @since 2022-10-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ProjectMembers implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 映射记录uuid
     */
    private byte[] recordUuid;

    /**
     * 项目uuid
     */
    private byte[] projectUuid;

    /**
     * 用户uuid
     */
    private byte[] userUuid;

    /**
     * 用户在项目中的昵称
     */
    private String nickname;

    /**
     * 用户在项目中扮演的角色
     */
    private byte[] roleUuid;


}
