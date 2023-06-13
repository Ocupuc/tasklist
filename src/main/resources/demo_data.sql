insert into users (name, username, password)
values ('John Doe1', 'johndoe1@gmail.com', '$2a$10$tWfZkz8N32LCB..Q4S.fwuLPyt3IrDp43DIKQxBGq4qeq3ZkPpC5G'),
       ('Mike Smith1', 'mikesmith1@yahoo.com', '$2a$10$Fiqap3GTYk7D2XaTvbE/cegf3rDX.SRw/L763x2TO27ncUIlRXUd6');

insert into tasks (title, description, status, expiration_date)
values ('Buy cheese', null, 'TODO', '2023-01-29 12:00:00'),
       ('Do homework', 'Math, Physics, Literature', 'IN_PROGRESS', '2023-01-31 00:00:00'),
       ('Clean rooms', null, 'DONE', null),
       ('Call Mike', 'Ask about meeting', 'TODO', '2023-02-01 00:00:00');

insert into users_tasks (task_id, user_id)
values (1, 2),
       (2, 2),
       (3, 2),
       (4, 1);

insert into users_roles (user_id, role)
values (1, 'ROLE_ADMIN'),
       (1, 'ROLE_USER'),
       (2, 'ROLE_USER');