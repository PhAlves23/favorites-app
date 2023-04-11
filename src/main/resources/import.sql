INSERT INTO TB_USUARIO(nome, email, senha, telefone) VALUES ('Paulo Henrique', 'ph23.alves@gmail.com', '123', '11972266510');
INSERT INTO TB_USUARIO(nome, email, senha, telefone) VALUES ('Beatriz Torres', 'beatriztorres@gmail.com', '123456', '11934455434');
INSERT INTO TB_USUARIO(nome, email, senha, telefone) VALUES ('Vanessa Camargo', 'vanessa.camargo@gmail.com', '123456', '11823344562');
INSERT INTO TB_USUARIO(nome, email, senha, telefone) VALUES ('Alexandre Neto', 'ale.neto@gmail.com', '123', '11946677654');

INSERT INTO TB_CATEGORIA(nome) VALUES ('Restaurante');
INSERT INTO TB_CATEGORIA(nome) VALUES ('Hotel');
INSERT INTO TB_CATEGORIA(nome) VALUES ('Shopping');
INSERT INTO TB_CATEGORIA(nome) VALUES ('Pet Shop');
INSERT INTO TB_CATEGORIA(nome) VALUES ('Colégio');
INSERT INTO TB_CATEGORIA(nome) VALUES ('Salão de Beleza');	
INSERT INTO TB_CATEGORIA(nome) VALUES ('Farmácia');	
INSERT INTO TB_CATEGORIA(nome) VALUES ('Padaria');	

INSERT INTO TB_AVALIACAO(categoria_id, comentario, data, nota, usuario_id) VALUES (1, 'Muito bom', '2019-10-10', 5, 1);
INSERT INTO TB_AVALIACAO(categoria_id, comentario, data, nota, usuario_id) VALUES (1, 'Incrível!!', '2022-10-10', 4, 2);

--INSERT INTO TB_ESTABELECIMENTO (nome, site, nota, logradouro, imagem, contato, endereco, descricao, horarioFuncionamento)
--VALUES ('Estabelecimento 1', 'www.estabelecimento1.com.br', 4.5, 'São Paulo', null, 'contato@estabelecimento1.com.br', 'Av. Paulista, 1000', 'Um ótimo estabelecimento', '2023-04-10T15:30:00');
