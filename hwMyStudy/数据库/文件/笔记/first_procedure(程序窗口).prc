CREATE OR REPLACE PROCEDURE first_procedure(
--参数
i_id IN varchar2,      --入参
o_name OUT varchar2 ,  --出参
o_salary OUT number

)
IS
--定义块
v_id varchar2(255);
v_name varchar2(255);
v_salary number;
BEGIN
--执行块
 v_id:=i_id;
select name,salary into v_name,v_salary from section where id = v_id;





o_name:=v_name;
o_salary:=v_salary;
  --dbms_output.put_line(o_name);--输出语句



    
       EXCEPTION
         WHEN no_data_found THEN
           o_name:='未找到';
           o_salary:='未找到';
       
       
         --异常处理块
END;
/
