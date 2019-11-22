create table convidado( id number,
                        nome varchar2(500),
                        email varchar2(500),
                        telefone varchar2(20));
/

-- Create sequence 
create sequence SEQ_CONVIDADO
minvalue 1
maxvalue 99999999999999999
start with 1
increment by 1
cache 20;

--
begin
  insert into convidado (ID, NOME, EMAIL, TELEFONE)
  values (SEQ_CONVIDADO.nextval, 'WILLIAM', 'william@gmail.com', '123456789');

  insert into convidado (ID, NOME, EMAIL, TELEFONE)
  values (SEQ_CONVIDADO.nextval, 'ALESSANDRA', 'alessandra@gmail.com', '565656565');
  commit;
end;

                     
