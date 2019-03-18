package com.hong.model.system;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Gumh
 * @since 2019-03-18
 */
//@TableName("sys_role")
//@Data
//@Accessors(chain = true)
public class SysRole extends Model<SysRole> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.UUID)
    private String id;

    @TableField("roleNumber")
    private String roleNumber;

    @TableField("roleName")
    private String roleName;

    private String organization;

    private Boolean common;

    private Boolean enable;

    private String description;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleNumber() {
        return roleNumber;
    }

    public void setRoleNumber(String roleNumber) {
        this.roleNumber = roleNumber;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public Boolean getCommon() {
        return common;
    }

    public void setCommon(Boolean common) {
        this.common = common;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SysRole{" +
        "id=" + id +
        ", roleNumber=" + roleNumber +
        ", roleName=" + roleName +
        ", organization=" + organization +
        ", common=" + common +
        ", enable=" + enable +
        ", description=" + description +
        "}";
    }
}
