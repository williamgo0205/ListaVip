create table convidado( id number,
                        nome varchar2(500),
                        email varchar2(500),
                        telefone varchar2(20));
/
                      
begin
  insert into convidado (ID, NOME, EMAIL, TELEFONE)
  values (1, 'WILL', 'w@w.com.br', '123456789');

  insert into convidado (ID, NOME, EMAIL, TELEFONE)
  values (2, 'WILL 2', 'teste@teste.com.br', '565656565');
  commit;
end;                        
                     
