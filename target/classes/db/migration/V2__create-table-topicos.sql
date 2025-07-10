create table topicos(

    id bigint not null auto_increment,
    autor  varchar(100) not null,
    curso  varchar(100) not null,
    titulo varchar(100),
    mensagem varchar(255) not null,
    data datetime not null,
    estado tinyint,

    primary key(id)
);