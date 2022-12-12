create TABLE if not exists users (
    user_id uuid NOT NULL PRIMARY KEY,
    username varchar(50),
    name varchar(50),
    user_role varchar(50),
    password varchar(50)
) WITH (oids = false);
