
CREATE TABLE cms_user_primary(
    create _time timestamp not null default CURRENT_TIMESTAMP,
    update_time timestamp not null default '0000-00-00 00:00:00',
    id int(11) NOT NULL AUTO_INCREMENT primary key,
    username varchar(50) not null comment '用户名',
    password varchar(64) not null comment '用户密码，MD5加密或sha256散列加密',
    salt varchar(64) not null comment '密码盐',
    email varchar(50) not null default '' comment '邮箱',
    login_count int(10) not null default 0 comment '登陆次数',
    status tinyint(1) default '1' not null comment '状态',
    deleted tinyint(1) default '1' not null comment '是否已删除',
    UNIQUE KEY user_name_unique(username) USING BTREE,
    UNIQUE KEY user_email_unique(email) USING BTREE


)ENGINE=InnoDB DEFAULT CHARSET=utf8;