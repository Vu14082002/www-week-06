INSERT INTO `user` (mobile, last_login, last_name, intro, profile, registered_at, password_hash, middle_name, first_name, email)
VALUES
    ('1234567890', '2023-10-22 12:00:00', 'Doe', 'Intro 1', 'Profile 1', '2023-10-22 12:00:00', 'hash1', 'Middle1', 'First1', 'email1@example.com'),
    ('0987654321', '2023-10-22 12:15:00', 'Smith', 'Intro 2', 'Profile 2', '2023-10-22 12:15:00', 'hash2', 'Middle2', 'First2', 'email2@example.com'),
    ('5556667777', '2023-10-22 12:30:00', 'Johnson', 'Intro 3', 'Profile 3', '2023-10-22 12:30:00', 'hash3', 'Middle3', 'First3', 'email3@example.com'),
    ('1112223333', '2023-10-22 12:45:00', 'Williams', 'Intro 4', 'Profile 4', '2023-10-22 12:45:00', 'hash4', 'Middle4', 'First4', 'email4@example.com'),
    ('9990001111', '2023-10-22 13:00:00', 'Brown', 'Intro 5', 'Profile 5', '2023-10-22 13:00:00', 'hash5', 'Middle5', 'First5', 'email5@example.com'),
    ('7778889999', '2023-10-22 13:15:00', 'Jones', 'Intro 6', 'Profile 6', '2023-10-22 13:15:00', 'hash6', 'Middle6', 'First6', 'email6@example.com'),
    ('4445556666', '2023-10-22 13:30:00', 'Davis', 'Intro 7', 'Profile 7', '2023-10-22 13:30:00', 'hash7', 'Middle7', 'First7', 'email7@example.com'),
    ('2223334444', '2023-10-22 13:45:00', 'Miller', 'Intro 8', 'Profile 8', '2023-10-22 13:45:00', 'hash8', 'Middle8', 'First8', 'email8@example.com'),
    ('8889990000', '2023-10-22 14:00:00', 'Wilson', 'Intro 9', 'Profile 9', '2023-10-22 14:00:00', 'hash9', 'Middle9', 'First9', 'email9@example.com'),
    ('6667778888', '2023-10-22 14:15:00', 'Anderson', 'Intro 10', 'Profile 10', '2023-10-22 14:15:00', 'hash10', 'Middle10', 'First10', 'email10@example.com');
    
    
    
    
INSERT INTO Post (published, content, parent_id, meta_title, summary, create_at, title, author_id, update_at, published_at)
VALUES
    (true, 'Content 1', NULL, 'Title 1', 'Summary 1', '2023-10-22 12:00:00', 'Post 1', 1, '2023-10-22 12:00:00', '2023-10-22 12:00:00'),
    (true, 'Content 2', NULL, 'Title 2', 'Summary 2', '2023-10-22 12:15:00', 'Post 2', 2, '2023-10-22 12:15:00', '2023-10-22 12:15:00'),
    (true, 'Content 3', NULL, 'Title 3', 'Summary 3', '2023-10-22 12:30:00', 'Post 3', 3, '2023-10-22 12:30:00', '2023-10-22 12:30:00'),
    (true, 'Content 4', NULL, 'Title 4', 'Summary 4', '2023-10-22 12:45:00', 'Post 4', 4, '2023-10-22 12:45:00', '2023-10-22 12:45:00'),
    (true, 'Content 5', NULL, 'Title 5', 'Summary 5', '2023-10-22 13:00:00', 'Post 5', 5, '2023-10-22 13:00:00', '2023-10-22 13:00:00'),
    (true, 'Content 6', NULL, 'Title 6', 'Summary 6', '2023-10-22 13:15:00', 'Post 6', 6, '2023-10-22 13:15:00', '2023-10-22 13:15:00'),
    (true, 'Content 7', NULL, 'Title 7', 'Summary 7', '2023-10-22 13:30:00', 'Post 7', 7, '2023-10-22 13:30:00', '2023-10-22 13:30:00'),
    (true, 'Content 8', NULL, 'Title 8', 'Summary 8', '2023-10-22 13:45:00', 'Post 8', 8, '2023-10-22 13:45:00', '2023-10-22 13:45:00'),
    (true, 'Content 9', NULL, 'Title 9', 'Summary 9', '2023-10-22 14:00:00', 'Post 9', 9, '2023-10-22 14:00:00', '2023-10-22 14:00:00'),
    (true, 'Content 10', NULL, 'Title 10', 'Summary 10', '2023-10-22 14:15:00', 'Post 10', 10, '2023-10-22 14:15:00', '2023-10-22 14:15:00');
    
    
    
INSERT INTO post_comment (post_id, title, published, content, published_at, create_at, parent_id, user_id)
VALUES
    (1, 'Comment 1', true, 'Content 1', '2023-10-22 12:00:00', '2023-10-22 12:00:00', NULL, 1),
    (2, 'Comment 2', true, 'Content 2', '2023-10-22 12:15:00', '2023-10-22 12:15:00', NULL, 2),
    (3, 'Comment 3', true, 'Content 3', '2023-10-22 12:30:00', '2023-10-22 12:30:00', NULL, 3),
    (4, 'Comment 4', true, 'Content 4', '2023-10-22 12:45:00', '2023-10-22 12:45:00', NULL, 4),
    (5, 'Comment 5', true, 'Content 5', '2023-10-22 13:00:00', '2023-10-22 13:00:00', NULL, 5),
    (6, 'Comment 6', true, 'Content 6', '2023-10-22 13:15:00', '2023-10-22 13:15:00', NULL, 6),
    (7, 'Comment 7', true, 'Content 7', '2023-10-22 13:30:00', '2023-10-22 13:30:00', NULL, 7),
    (8, 'Comment 8', true, 'Content 8', '2023-10-22 13:45:00', '2023-10-22 13:45:00', NULL, 8),
    (9, 'Comment 9', true, 'Content 9', '2023-10-22 14:00:00', '2023-10-22 14:00:00', NULL, 9),
    (10, 'Comment 10', true, 'Content 10', '2023-10-22 14:15:00', '2023-10-22 14:15:00', NULL, 10);