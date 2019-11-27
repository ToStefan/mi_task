INSERT INTO GOODS(id, name) VALUES(1, 'Goods I - 100');
INSERT INTO GOODS(id, name) VALUES(2, 'Goods II - 75');
INSERT INTO GOODS(id, name) VALUES(3, 'Goods III - 50');
INSERT INTO GOODS(id, name) VALUES(4, 'Goods IV - 25');


INSERT INTO DOCUMENTS(id, name) VALUES(1, 'Document I');
INSERT INTO DOCUMENTS(id, name) VALUES(2, 'Document II');


INSERT INTO DOCUMENT_ITEMS(id, price, quantity, document_id, goods_id) VALUES(1, 400, 4, 1, 1);
INSERT INTO DOCUMENT_ITEMS(id, price, quantity, document_id, goods_id) VALUES(2, 900, 12, 1, 2);

INSERT INTO DOCUMENT_ITEMS(id, price, quantity, document_id, goods_id) VALUES(3, 1750, 35, 2, 3);
INSERT INTO DOCUMENT_ITEMS(id, price, quantity, document_id, goods_id) VALUES(4, 500, 20, 2, 4);