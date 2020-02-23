package com.test.crud.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.test.crud.bean.ClentInfo;
import com.test.crud.bean.Employee;
import com.test.crud.bean.Msg;
import com.test.crud.service.ClientService;
import com.test.crud.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	@Autowired
	ClientService clientService;
	@ResponseBody
	@RequestMapping(value="/emp/{ids}",method=RequestMethod.DELETE)
	public Msg deleteEmp(@PathVariable("ids") String ids){
		if(ids.contains("-")){
			List<Integer> del_ids = new ArrayList<>();
			String[] str_ids = ids.split("-");
			for(String string:str_ids){
				del_ids.add(Integer.parseInt(string));
			}
			employeeService.deleteBath(del_ids);
		}else{
			Integer id = Integer.parseInt(ids);
			employeeService.deleteEmp(id);
//			System.out.println("id:"+id);
			
		}
		return Msg.success();
	}
	
	
	@ResponseBody
	@RequestMapping(value="/emp/{empId}",method=RequestMethod.PUT)
	public Msg saveEmp(Employee employee){
		
		employeeService.updateEmp(employee);
		
		return Msg.success();
	}
	
	//查询员工
	@ResponseBody
	@RequestMapping(value="/emp/{id}",method=RequestMethod.GET)
	public Msg getEmp(@PathVariable("id")Integer id){
		
		Employee employee = employeeService.getEmp(id);
		return Msg.success().add("emp", employee);
	}
	
	@ResponseBody
	@RequestMapping("/checkuser")
	public Msg checkUser(@RequestParam("empName")String empName){
		
		String regx = "(^[a-zA-Z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]+$)";
		if(!empName.matches(regx)){
			return Msg.fail().add("va_msg", "用户名格式不正确。。。");
		}
		boolean b = employeeService.checkUser(empName);
		if(b){
			return Msg.success();
		}else{
			return Msg.fail().add("va-msg","用户名不可用");
		}
	}
	
	@ResponseBody
	@RequestMapping(value="/emp",method=RequestMethod.POST)
	public Msg saveEmp(@Valid Employee employee,BindingResult result){
		if(result.hasErrors()){
			Map<String,Object> map = new HashMap<String,Object>();
			
			List<FieldError> errors = result.getFieldErrors();
			for(FieldError fieldError :errors){
				System.out.println("错误字段名：" +fieldError.getField());
				System.out.println("错误信息：" +fieldError.getDefaultMessage());
				map.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			return Msg.fail().add("errorFields", map);
		}else{
			employeeService.saveEmp(employee);
			return Msg.success();
		}
		
	}
	
	@RequestMapping("/emps")
	@ResponseBody
	public Msg getEmpsWithJson(@RequestParam(value="pn",defaultValue="1") Integer pn,
			Model model,HttpServletRequest request, HttpServletResponse response){
		
		PageHelper.startPage(pn, 5);
		List<Employee> emps = employeeService.getAll();
		PageInfo page = new PageInfo(emps,5);
		
		/**
         * 1.获得客户机信息
         */
		String remoteAddr = request.getRemoteAddr();//得到来访者的IP地址
		String remoteHost = request.getRemoteHost();//返回发出请求的客户机的完整主机名
		int remotePort = request.getRemotePort();//客户机所使用的网络端口号
        String requestUrl = request.getRequestURL().toString();//得到请求的URL地址
        String requestUri = request.getRequestURI();//得到请求的资源
        String method = request.getMethod();//得到请求URL地址时使用的方法
        String queryString = request.getQueryString();//得到请求的URL地址中附带的参数
        String remoteUser = request.getRemoteUser();
        String pathInfo = request.getPathInfo();
        String localAddr = request.getLocalAddr();//获取WEB服务器的IP地址
        String localName = request.getLocalName();//获取WEB服务器的主机名
        
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = format.format(new Date());
        
        ClentInfo clentInfo = new ClentInfo();
        
        clentInfo.setIp(remoteAddr);
        clentInfo.setMethod(method);
        clentInfo.setPort(String.valueOf(remotePort));
        clentInfo.setTime(new Date());
        clentInfo.setUri(requestUri);
        clentInfo.setUrl(requestUrl);
        clentInfo.setNote1(queryString);
        clentInfo.setNote2(remoteUser);
        clentInfo.setNote3(pathInfo);
        clentInfo.setNote4(localAddr);
        clentInfo.setNote5(localName);
        clentInfo.setHost(remoteHost);
        
        clientService.InsertInfo(clentInfo);
		System.out.println(clentInfo);
		
		return Msg.success().add("pageInfo",page);
	}
	
	//@RequestMapping("/emps")
	public String getEmps(@RequestParam(value="pn",defaultValue="1") Integer pn,
			Model model){
		
		PageHelper.startPage(pn, 5);
		List<Employee> emps = employeeService.getAll();
		PageInfo page = new PageInfo(emps,5);
		model.addAttribute("pageInfo",page);
		return "list";
	}
}
