package cn.itcast.user.pojo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * *************************************************************
 * *
 * .=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-.       *
 * |                     ______                     |      *
 * |                  .-"      "-.                  |      *
 * |                 /            \                 |      *
 * |     _          |              |          _     |      *
 * |    ( \         |,  .-.  .-.  ,|         / )    |      *
 * |     > "=._     | )(__/  \__)( |     _.=" <     |      *
 * |    (_/"=._"=._ |/     /\     \| _.="_.="\_)    |      *
 * |           "=._"(_     ^^     _)"_.="           |      *
 * |               "=\__|IIIIII|__/="               |      *
 * |              _.="| \IIIIII/ |"=._              |      *
 * |    _     _.="_.="\          /"=._"=._     _    |      *
 * |   ( \_.="_.="     `--------`     "=._"=._/ )   |      *
 * |    > _.="                            "=._ <    |      *
 * |   (_/                                    \_)   |      *
 * |                神兽保佑, 永无bug                |      *
 * '-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-='      *
 * *
 * LASCIATE OGNI SPERANZA, VOI CH'ENTRATE           *
 * *************************************************************
 */
@Table(name = "tb_user")
@Slf4j
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 用户名
    private String userName;

    // 密码
    private String password;

    // 姓名
    private String name;

    // 年龄
    private Integer age;

    // 性别，1男性，2女性
    private Integer sex;

    // 出生日期
    private Date birthday;

    // 创建时间
    private Date created;

    // 更新时间
    private Date updated;

    // 备注
    private String note;
}
