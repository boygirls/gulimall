package com.fxc.gulimallproduct.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import com.fxc.common.valid.AddGroup;
import com.fxc.common.valid.ListValue;
import com.fxc.common.valid.UpdateGroup;
import com.fxc.common.valid.UpdateStatus;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;

/**
 * 品牌
 * 
 * @author fxc
 * @email sunlightcs@gmail.com
 * @date 2022-08-12 12:54:10
 */
@Data
@TableName("pms_brand")
public class PmsBrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 品牌id
	 */
	@NotNull(message = "修改必须指定品牌id",groups = {UpdateGroup.class})
	@Null(message = "新增不能指定id",groups = {AddGroup.class})
	@TableId
	private Long brandId;
	/**
	 * 品牌名
	 */
	@NotBlank(message = "名牌名必须提交",groups = {UpdateGroup.class,AddGroup.class})
	private String name;
	/**
	 * 品牌logo地址
	 */
	@URL(message = "必须是一个合法的地址")
	@NotEmpty(groups = {AddGroup.class})
	private String logo;
	/**
	 * 介绍
	 */
	private String descript;
	/**
	 * 显示状态[0-不显示；1-显示]
	 */
//	@Pattern(regexp = "/^[a-zA-Z]$/", message = "检索首字母必须是一个字母",groups = {UpdateGroup.class,AddGroup.class})
	@NotNull(groups = {AddGroup.class, UpdateStatus.class})
	@ListValue(value={0,1},groups = {AddGroup.class, UpdateStatus.class})
	private Integer showStatus;
	/**
	 * 检索首字母
	 */

	@NotEmpty(groups = {AddGroup.class})
	@Pattern(regexp = "^[a-zA-Z]$",message = "检索首字母必须是一个字母", groups = {UpdateGroup.class, AddGroup.class})
	private String firstLetter;
	/**
	 * 排序
	 */
	@Min(value = 0, message = "排序数必须大于0",groups = {UpdateGroup.class,AddGroup.class} )
	private Integer sort;

}
