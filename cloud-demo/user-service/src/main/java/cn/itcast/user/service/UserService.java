package cn.itcast.user.service;

import cn.itcast.user.mapper.UserMapper;
import cn.itcast.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id) {
        return this.userMapper.selectByPrimaryKey(id);
    }
}
