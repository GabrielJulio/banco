-- Clientes
INSERT INTO cliente (id, nome)
VALUES (1, 'Roberto de Abreu');
INSERT INTO cliente (id, nome)
VALUES (2, 'Clóvis Furtado');
INSERT INTO cliente (id, nome)
VALUES (3, 'Cláudio Inácio Show');

-- Enderecos
INSERT INTO endereco (id, cep, nome, cliente_id)
VALUES (1, '24410-310', 'Rua Francisco Bragança 1540', 2);
INSERT INTO endereco (id, cep, nome, cliente_id)
VALUES (2, '20270-300', 'Rua Felisberto de Menezes 1327', 1);
INSERT INTO endereco (id, cep, nome, cliente_id)
VALUES (3, '97105-170', 'Rua Professor Heitor da Graça Fernandes 1662', 3);

-- Categorias
INSERT INTO categoria (id, nome)
VALUES (1, 'Bronze');
INSERT INTO categoria (id, nome)
VALUES (2, 'Silver');
INSERT INTO categoria (id, nome)
VALUES (3, 'Gold');

-- Contas
INSERT INTO conta (id, categoria_id, cliente_id)
VALUES (1, 3, 2);
INSERT INTO conta (id, categoria_id, cliente_id)
VALUES (2, 1, 3);
INSERT INTO conta (id, categoria_id, cliente_id)
VALUES (3, 2, 1);

-- Cartoes
INSERT INTO cartao (id, cvv, conta_id)
VALUES (1, '236', 3);
INSERT INTO cartao (id, cvv, conta_id)
VALUES (2, '517', 2);
INSERT INTO cartao (id, cvv, conta_id)
VALUES (3, '089', 1);

-- Faturas
INSERT INTO fatura (id, data, valor, cartao_id)
VALUES (1, '2020-08-01', 270.46, 1);
INSERT INTO fatura (id, data, valor, cartao_id)
VALUES (2, '2020-09-01', 285.73, 1);
INSERT INTO fatura (id, data, valor, cartao_id)
VALUES (3, '2020-10-01', 300.37, 1);

INSERT INTO fatura (id, data, valor, cartao_id)
VALUES (4, '2020-08-01', 170.82, 2);
INSERT INTO fatura (id, data, valor, cartao_id)
VALUES (5, '2020-09-01', 185.64, 2);
INSERT INTO fatura (id, data, valor, cartao_id)
VALUES (6, '2020-10-01', 200.19, 2);

INSERT INTO fatura (id, data, valor, cartao_id)
VALUES (7, '2020-08-01', 570.28, 3);
INSERT INTO fatura (id, data, valor, cartao_id)
VALUES (8, '2020-09-01', 1285.91, 3);
INSERT INTO fatura (id, data, valor, cartao_id)
VALUES (9, '2020-10-01', 10000.55, 3);
