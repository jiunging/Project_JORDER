commit;

select * from food;
select * from order_list ORDER BY ORDER_NUM;

delete from order_list where food_name ='���±���';
desc food;

SELECT SEQ1.NEXTVAL FROM DUAL;

ALTER SEQUENCE SEQ1 INCREMENT BY -7;

update food set food_category = 'drink' where food_category='�ַ�';

DELETE FROM ORDER_LIST;

commit;

ALTER SEQUENCE SEQ1 INCREMENT BY 1;

rollback;