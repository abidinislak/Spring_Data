
INSERT INTO  asd1.product   (name) values ("elm")    ;
INSERT INTO  asd1.product   (name) values ("kola")    ;
INSERT INTO  asd1.product   (name) values ("elmek")    ;
INSERT INTO  asd1.product   (name) values ("bread")    ;
INSERT INTO  asd1.product   (name) values ("assdfsdfsdd")    ;
INSERT INTO  asd1.product   (name) values ("asdasasdasd")    ;
INSERT INTO asd1.order_header (name) VALUES ("aaa");
INSERT INTO asd1.order_header (name) VALUES ("777");
INSERT INTO asd1.order_header (name) VALUES ("6666");
INSERT INTO asd1.order_header (name) VALUES ("5555");
INSERT INTO asd1.order_header (name) VALUES ("4444");
INSERT INTO asd1.order_header (name) VALUES ("3333");
INSERT INTO asd1.order_header (name) VALUES ("2222");

INSERT INTO asd1.order_line (name,order_header_id,product_id) values ("aaa",1,1);
INSERT INTO asd1.order_line (name,order_header_id,product_id) values ("aaa",1,2);
INSERT INTO asd1.order_line (name,order_header_id,product_id) values ("aaa",1,3);
INSERT INTO asd1.order_line (name,order_header_id,product_id) values ("aaa",1,4);
INSERT INTO asd1.order_line (name,order_header_id,product_id) values ("aaa",1,5);


INSERT INTO  asd1.category   (name) values ("cat1")    ;
INSERT INTO  asd1.category   (name) values ("cat2")    ;
INSERT INTO  asd1.category   (name) values ("cat3")    ;
INSERT INTO  asd1.category   (name) values ("cat4")    ;
INSERT INTO  asd1.category   (name) values ("cat5")    ;
INSERT INTO  asd1.category   (name) values ("cat5")    ;
INSERT INTO  asd1.category   (name) values ("cat5")    ;
INSERT INTO  asd1.category   (name) values ("cat5")    ;
INSERT INTO  asd1.category   (name) values ("cat5")    ;




--
INSERT INTO asd1.product_category (product_id,category_id) values (1,1);
INSERT INTO asd1.product_category (product_id,category_id) values (1,2);
INSERT INTO asd1.product_category (product_id,category_id) values (1,3);
INSERT INTO asd1.product_category (product_id,category_id) values (1,4);
INSERT INTO asd1.product_category (product_id,category_id) values (1,5);