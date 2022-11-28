procedure insert_cp_emp1(
	empno in number, ename in varchar2, param_deptno number,
	mgr number, cnt out number, msg out varchar2)
is
	deptno number;

begin

	deptno :=param_deptno;

	if not(param_deptno > 0 and param_deptno<100) then
	     deptno :=10;
	end if;

	insert into cp_emp1(EMPNO,ENAME, DEPTNO, MGR, HIREDATE)
	values (EMPNO, ENAME, DEPTNO, MGR, sysdate);

	cnt :=sql%rowcount;
	if cnt =1 then
		msg :='��������� �߰��Ǿ����ϴ�.';
		commit;
		end if;

		exception
		when dup_val_on_index then
			 msg := '��������� �ߺ��Ǿ���';
		when others then
			msg := '���ܰ� �߻��Ͽ���';

end;
