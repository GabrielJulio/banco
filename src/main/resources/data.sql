-- Clientes
INSERT INTO cliente (id, email, nome, telefone)
VALUES (1, 'robertoda@gmail.com', 'Roberto de Abreu', '4717-5837');
INSERT INTO cliente (id, email, nome, telefone)
VALUES (2, 'clovisfl@gmail.com', 'Clóvis Furtado de Lima', '9839-8964');
INSERT INTO cliente (id, email, nome, telefone)
VALUES (3, 'claudiois@gmail.com', 'Cláudio Inácio Show', '5971-7808');

-- Enderecos
INSERT INTO endereco (id, bairro, cidade, estado, logradouro, numero, cliente_id)
VALUES (1, 'Bananeira', 'Itabaiana', 'SE', 'Rua Francisco Bragança', '1540', 2);
INSERT INTO endereco (id, bairro, cidade, estado, logradouro, numero, cliente_id)
VALUES (2, 'Tijuca', 'Rio de Janeiro', 'RJ', 'Rua Felisberto de Menezes', '1327', 1);
INSERT INTO endereco (id, bairro, cidade, estado, logradouro, numero, cliente_id)
VALUES (3, 'Camobi', 'Santa Maria', 'RS', 'Rua Professor Heitor da Graça Fernandes', '1662', 3);

-- Categorias
INSERT INTO categoria (id, nome)
VALUES (1, 'Bronze');
INSERT INTO categoria (id, nome)
VALUES (2, 'Silver');
INSERT INTO categoria (id, nome)
VALUES (3, 'Gold');

-- Contas
INSERT INTO conta (id, estado, numero, saldo, categoria_id, cliente_id)
VALUES (1, 1, 1, 360, 3, 2);
INSERT INTO conta (id, estado, numero, saldo, categoria_id, cliente_id)
VALUES (2, 1, 2, 6825, 1, 3);
INSERT INTO conta (id, estado, numero, saldo, categoria_id, cliente_id)
VALUES (3, 1, 3, 23893.69 , 2, 1);

-- Cartoes
INSERT INTO cartao (id, cod, nome_cliente, numero, senha, vencimento, conta_id)
VALUES (1, '236', 'ROBERTO ABREU', 1, 1567, '2026-08-01', 3);
INSERT INTO cartao (id, cod, nome_cliente, numero, senha, vencimento, conta_id)
VALUES (2, '517', 'CLOVIS LIMA', 2, 1683, '2028-10-01', 2);
INSERT INTO cartao (id, cod, nome_cliente, numero, senha, vencimento, conta_id)
VALUES (3, '089', 'CLAUDIO SHOW', 3, 8943, '2040-02-01', 1);

-- Faturas
INSERT INTO fatura (id, data_pagamento, data_vencimento, estado, juros, total, cartao_id)
VALUES (1, '2020-07-14', '2020-08-01', 1, 14, 270.46, 1);
INSERT INTO fatura (id, data_pagamento, data_vencimento, estado, juros, total, cartao_id)
VALUES (2, '2020-07-15', '2020-09-01', 1, 14, 285.73, 1);
INSERT INTO fatura (id, data_pagamento, data_vencimento, estado, juros, total, cartao_id)
VALUES (3, '2020-07-19', '2020-10-01', 1, 14, 300.37, 1);

INSERT INTO fatura (id, data_pagamento, data_vencimento, estado, juros, total, cartao_id)
VALUES (4, '2020-07-09', '2020-08-01', 1, 14, 170.82, 2);
INSERT INTO fatura (id, data_pagamento, data_vencimento, estado, juros, total, cartao_id)
VALUES (5, '2020-07-17', '2020-09-01', 1, 14, 185.64, 2);
INSERT INTO fatura (id, data_pagamento, data_vencimento, estado, juros, total, cartao_id)
VALUES (6, '2020-07-10', '2020-10-01', 1, 14, 200.19, 2);

INSERT INTO fatura (id, data_pagamento, data_vencimento, estado, juros, total, cartao_id)
VALUES (7, '2020-07-29', '2020-08-01', 1, 14, 570.28, 3);
INSERT INTO fatura (id, data_pagamento, data_vencimento, estado, juros, total, cartao_id)
VALUES (8, '2020-07-30', '2020-09-01', 1, 14, 1285.91, 3);
INSERT INTO fatura (id, data_pagamento, data_vencimento, estado, juros, total, cartao_id)
VALUES (9, '2020-07-25', '2020-10-01', 1, 14, 10002.55, 3);
