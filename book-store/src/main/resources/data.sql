insert into roles(role_name)
values ('ADMIN'),
       ('MODERATOR'),
       ('USER');

insert into accounts(username,password)
values ('gshahrza','123456'),
       ('maqsud13','612831'),
       ('yusif99','874213'),
       ('afarid','7989456'),
       ('asgarov12','124891'),
       ('zaman01','414124123'),
       ('aliyevali','19421091'),
       ('mmustafayev','414154');

insert into users(contact_number, email, first_name, last_name, account_id)
values ('994775911256','gshahrza@gmail.com','Shahrza','Gahramanov',1),
       ('994512643572','maqsud1993@gmail.com','Maqsud','Bashirov',2),
       ('994771263378','yusfili00@gmail.com','Yusif','Yusifli',3),
       ('994551274119','faridagayevh@gmail.com','Farid','Agayev',4),
       ('994505267182','asgarzada@gmail.com','Nurlan','Asgarov',5),
       ('994706729813','xalilzaman@gmail.com','Zaman','Xailov',6),
       ('994517824967','ali111@gmail.com','Ali','Aliyev',7),
       ('994701247635','mustafayev98@gmail.com','Mammad','Mustafayev',8);

insert into  accounts_roles(account_id, role_id)
values (1,1),
       (2,3),
       (3,3),
       (4,2),
       (5,3),
       (6,3),
       (7,3),
       (8,3);

insert into genres(genre_name)
values ('FANTASY'),
       ('ADVENTURE'),
       ('ROMANCE'),
       ('HORROR'),
       ('PARANORMAL');

insert into books(title, synopsis)
values ('The Savior''s Champion', 'Tobias Kaya does not care about The Savior. He doesn''t care that She''s the Ruler of the realm or that She purified the land, and he certainly doesn''t care that She''s of age to be married. But when competing for Her hand proves to be his last chance to save his family, he’s forced to make The Savior his priority. Now Tobias is thrown into the Sovereign’s Tournament with nineteen other men, and each of them is fighting—and killing—for the chance to rule at The Savior''s side. Instantly his world is plagued with violence, treachery, and manipulation, revealing the hidden ugliness of his proud realm. And when his circumstances seem especially dire, he stumbles into an unexpected romance, one that opens him up to unimaginable dangers and darkness. Trigger this novel contains graphic violence, adult language, and sexual situations.'),
    ('Fury of the Dragon Goddess','Best-selling author Rick Riordan presents a second earth-shattering adventure based on Mesopotamian mythology by Sarwat Chadda, author of City of the Plague God . *"Chadda excels in this action-packed adventure, peppered with scenes examining Western theft of cultural artifacts, xenophobia, and Islamophobia and grounded in emotional depth and tenderness for humanity. An epic tale that contains multitudes."-- Kirkus Reviews (starred review) While on vacation in London, Sikander Aziz gets his hands on the mythic tablet of destinies. Naturally Sik uses it to get his brother Mo back among the living. His wish is granted, but at a terrible cost. Sik’s troubles multiply a billionfold when the tablet is stolen by the elder god of insanity, Lugal, who brings back Tiamat, the great chaos dragon and mother of all monsters.Nothing less than the fate of the world is at stake when a Muslim boy takes on the ancient gods of Mesopotamia in this action thriller by a master storyteller');

insert into authors(biography, date_of_birth, full_name)
values ('Jenna Moreci is a bestselling dark fantasy romance and writing craft author, as well as a YouTube sensation with hundreds of thousands of subscribers. Her first installment in The Savior’s Series, The Savior’s Champion, was voted one of the Best Books of All Time by Book Depository. Born and raised in Silicon Valley, Jenna spends her free time snuggling up with her charming partner and their tiny dog, Buttercup.','1990-01-31','Jenna Moreci'),
       ('Sarwat Chadda has lived and traveled throughout the world, from China to Guatemala. He’s been lost in Mongolia, abandoned at a volcano in Nicaragua and hidden up a tree from a rhino in Nepal. Not to mention being detained by Homeland Security in the US and chased around Tibet by the Chinese police. Maybe he just has that sort of face. Anyway, now he’s trying to settle in one place and stay out of trouble. Hence his new career as a writer. It’s safe, indoors and avoids any form of physical danger.','1989-08-02', 'Sarwat Chadda'),
       ('Russian novelist, journalist and philosopher. Notable works include Notes from Underground, Crime and Punishment and The Idiot.','1821-05-29','Fyodor Dostoevsky'),
       ('French author and poet. Hugo’s novels include Les Misérables, (1862) and Notre-Dame de Paris (1831).','1802-01-13','Victor Hugo'),
       ('Russian novelist and moral philosopher. Famous works include the epic novels – War and Peace (1869) and Anna Karenina (1877). Tolstoy also became an influential philosopher with his brand of Christian pacificism.','1828-07-22','Leo Tolstoy');

insert into authors_books(book_id, author_id)
values (1,1),
       (2,2);

insert into books_genres(book_id, genre_id)
values (1,1),
       (1,3),
       (2,1),
       (2,2);


insert into reviews(review_text, book_id, user_id)
values ('review example 0',1,1),
       ('review example 1',1,2),
       ('review example 2',1,3),
       ('review example 3',1,4),
       ('review example 4',1,5),
       ('review example 5',2,1),
       ('review example 6',2,2),
       ('review example 7',2,3),
       ('review example 8',2,4),
       ('review example 9',2,5);