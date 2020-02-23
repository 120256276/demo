package com.test.smm.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.test.crud.bean.Department;
import com.test.crud.bean.Employee;
import com.test.crud.dao.DepartmentMapper;
import com.test.crud.dao.EmployeeMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {
	
	@Autowired
	DepartmentMapper departmentMapper;
	@Autowired
	EmployeeMapper employeeMapper;
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	@Autowired
	ComboPooledDataSource comboPooledDataSource;
	@Test
	public void TestMapperCURD() throws SQLException{
//		ApplicationContext  ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		DepartmentMapper dm =ac.getBean(DepartmentMapper.class);
//		System.out.println(departmentMapper);
//		System.out.println(comboPooledDataSource);
//		Connection cp = comboPooledDataSource.getConnection("root", "root");
//		System.out.println(cp);
//		PreparedStatement ps=cp.prepareStatement("select * from tbl_dept");//获取sql语句
//		ResultSet rs=ps.executeQuery();//执行sql语句
//		System.out.println("===============");
//		while(rs.next()){
//			System.out.print(rs.getInt("dept_id")+"\t");
//			System.out.print(rs.getString("dept_name")+"\t");
//			
//		}
//		rs.close();
//		ps.close();
//		cp.close();

//		departmentMapper.insertSelective(new Department(null, "测试部"));
//		departmentMapper.insertSelective(new Department(null, "开发部"));
//		employeeMapper.insertSelective( new Employee(null,"Tom","M","Tom@163.com",1));
		 EmployeeMapper mapper = sqlSessionTemplate.getMapper(EmployeeMapper.class);
		String flag = "M";
		Integer num = 1;
		for(int i = 0;i<100;i++){
			
			String uuid = UUID.randomUUID().toString().substring(0, 5);
			 boolean status = uuid.contains("a");
		       if(status){
		    	   flag="F";
		    	   num = 2;
		       }
			mapper.insertSelective(new Employee(null,uuid,flag,uuid+"@163.com",num));
		}
		System.out.println("批量完成");
	}

}
