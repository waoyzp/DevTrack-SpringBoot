package cn.auroralab.devtrack.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 项目中的角色信息
 * </p>
 *
 * @author Guanyu Hu
 * @since 2022-10-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ProjectRoles implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色uuid
     */
    private byte[] roleUuid;

    /**
     * 角色所属项目的uuid
     */
    private byte[] projectUuid;

    /**
     * 角色的数字id
     */
    private Integer roleId;

    /**
     * 角色名
     */
    private String roleName;

    /**
     * 邀请权限
     */
    private Boolean invite;

    /**
     * 创建任务权限
     */
    private Boolean createTask;

    /**
     * 查看任务权限
     */
    private Boolean viewTask;

    /**
     * 修改任务权限
     */
    private Boolean updateTask;

    /**
     * 删除任务权限
     */
    private Boolean deleteTask;


}
