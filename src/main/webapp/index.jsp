<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工列表</title>
<%
	pageContext.setAttribute("APP_PATH",request.getContextPath());
%>
<script type="text/javascript" 
		src="${APP_PATH}/static/js/jquery-1.12.4.min.js"></script>
		
<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" 
	  rel="stylesheet">
	  
<script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
		

</head>
<body>
	<!-- 员工修改Modal -->
	<div class="modal fade" id="empUpdateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="myModalLabel">员工修改</h4>
	      </div>
	      <div class="modal-body">
	        <form class="form-horizontal">
				  <div class="form-group">
				    <label for="inputEmail3" class="col-sm-2 control-label">empName</label>
				    <div class="col-sm-10">
				     <p class="form-control-static" id="empName_update_static"></p>
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputEmail3" class="col-sm-2 control-label">email</label>
				    <div class="col-sm-10">
				      <input type="text" name="email" class="form-control" id="email_update_input" placeholder="email@163.com">
				   	  <span id="helpBlock2" class="help-block"></span>
				    </div>
				  </div>
				 <div class="form-group">
				    <label for="inputEmail3" class="col-sm-2 control-label">gender</label>
				    <div class="col-sm-10">
				      <label class="radio-inline">
						 <input type="radio" name="gender" id="gender1_update_input" value="M" checked="checked"> 男
						</label>
						<label class="radio-inline">
						  <input type="radio" name="gender" id="gender2_update_input" value="F"> 女
						</label>
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputEmail3" class="col-sm-2 control-label">deptName</label>
				    <div class="col-sm-4">
					      <select class="form-control" name="dId">
							 
						 </select>
				    </div>
				  </div>
			</form>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
	        <button type="button" class="btn btn-primary" id="emp_update_btn">更新</button>
	      </div>
	    </div>
	  </div>
	</div>
	<!-- 员工添加Modal -->
	<div class="modal fade" id="empAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="myModalLabel">员工添加</h4>
	      </div>
	      <div class="modal-body">
	        <form class="form-horizontal">
				  <div class="form-group">
				    <label for="inputEmail3" class="col-sm-2 control-label">empName</label>
				    <div class="col-sm-10">
				      <input type="text" name="empName" class="form-control" id="empName_add_input" placeholder="empName">
				      <span id="helpBlock2" class="help-block"></span>
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputEmail3" class="col-sm-2 control-label">email</label>
				    <div class="col-sm-10">
				      <input type="text" name="email" class="form-control" id="email_add_input" placeholder="email@163.com">
				   	  <span id="helpBlock2" class="help-block"></span>
				    </div>
				  </div>
				 <div class="form-group">
				    <label for="inputEmail3" class="col-sm-2 control-label">gender</label>
				    <div class="col-sm-10">
				      <label class="radio-inline">
						 <input type="radio" name="gender" id="gender1_add_input" value="M" checked="checked"> 男
						</label>
						<label class="radio-inline">
						  <input type="radio" name="gender" id="gender2_add_input" value="F"> 女
						</label>
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputEmail3" class="col-sm-2 control-label">deptName</label>
				    <div class="col-sm-4">
					      <select class="form-control" name="dId">
							 
						 </select>
				    </div>
				  </div>
			</form>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
	        <button type="button" class="btn btn-primary" id="emp_save_btn">保存</button>
	      </div>
	    </div>
	  </div>
	</div>

	<div class="container">
	<!-- 标题 -->
		<div class="row">
			<div class="col-md-12">
				<h1>半成品-CRUD</h1>
			</div>
		</div>
<!-- 		按钮 -->
		<div class="row">
			<div class="col-md-4 col-md-offset-8">
				<button class="btn btn-primary" id="emp_add_modal_btn">新增</button>
				<button class="btn btn-danger" id="emp_delete_all_btn">删除</button>
			</div>
		</div>
<!-- 		表格数据 -->
		<div class="row">
			<div class="col-md-12">
				<table class="table table-hover" id="emps_table">
					<thead>
						<tr>
							<th>
								<input type="checkbox" id="check_all"/>
							</th>
							<th>#</th>
							<th>empName</th>
							<th>gender</th>
							<th>email</th>
							<th>deptName</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
					
					</tbody>
					
				</table>
			</div>
		</div>
<!-- 		分页 -->
		<div class="row">
			<div class="col-md-6" id="page_info_area">
				
			</div>
			<div class="col-md-6" id="page_nav_area">
				
			</div>	
			<div class="col-md-6" id="page_nav_area">
				<a rel="nofollow" href="http://www.beian.miit.gov.cn" target="_blank">黑ICP备19007259</a>
			</div>	
		</div>
	</div>
	<script type="text/javascript">
	
		var totalRecord,currentPage;
		$(function(){
			to_page(1);
			
		});
		
		function to_page(pn){
			$.ajax({
				url:"${APP_PATH}/emps",
				data:"pn="+pn,
				type:"GET",
				success:function(result){
// 					console.log(result);
					build_emps_table(result);
					build_page_info(result);
					build_page_nav(result);
				}
			});
		}
		
		function build_emps_table(result){
			$("#emps_table tbody").empty();
			var emps = result.extend.pageInfo.list;
			$.each(emps,function(index,item){
// 				alert(item.empName);
				var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>")
				var empIdTd = $("<td></td>").append(item.empId);
				var empNameTd = $("<td></td>").append(item.empName);
				var genderTd = $("<td></td>").append(item.gender=='M'?"男":"女");
				var emailTd = $("<td></td>").append(item.email);
				var deptNameTd = $("<td></td>").append(item.department.deptName);
				/**
					
				*/
				var editBtn = $("<button></button>").addClass("btn btn-primary btn-sm edit_btn")
													.append($("<span></span>").addClass("glyphicon glyphicon-pencil")
													.append("编辑")		
													);
				editBtn.attr("edit-id",item.empId);
				var delBtn  = $("<button></button>").addClass("btn btn-danger btn-sm delete_btn")
													.append($("<span></span>").addClass("glyphicon glyphicon-trash")
													.append("删除")		
													);
				delBtn.attr("del-id",item.empId);
				var btnTd = $("<td></td>").append(editBtn).append(" ").append(delBtn);
				$("<tr></tr>").append(checkBoxTd)
							  .append(empIdTd)
							  .append(empNameTd)
							  .append(genderTd)
							  .append(emailTd)
							  .append(deptNameTd)
							  .append(btnTd)
							  .appendTo("#emps_table tbody");
			});
		}
		//显示分页信息
		function build_page_info(result){
			$("#page_info_area").empty();
			$("#page_info_area").append("当前"+result.extend.pageInfo.pageNum+"页,总"+
								result.extend.pageInfo.pages+"页，总"+
								result.extend.pageInfo.total+"页。")
			totalRecord = result.extend.pageInfo.total;
			currentPage = result.extend.pageInfo.pageNum;
		}
		//分页条信息
		function build_page_nav(result){
			$("#page_nav_area").empty();
			
			var ul = $("<ul></ul>").addClass("pagination");
			
			
			var firstPageLi = $("<li></li>")
								.append($("<a></a>")
										.append("首页")
										.attr("href","#"));
			
			var prePageLi =  $("<li></li>")
								.append($("<a></a>")
										.append("&laquo;"));
			
			if(result.extend.pageInfo.hasPreviousPage ==false){
				firstPageLi.addClass("disabled");
				prePageLi.addClass("disabled");
			}else{
				//添加事件
				firstPageLi.click(function(){
					to_page(1);
				});
				
				prePageLi.click(function(){
					to_page(result.extend.pageInfo.pageNum-1);
				});
			}
			
			
			var nextPageLi =  $("<li></li>")
								.append($("<a></a>")
										.append("&raquo;"));

			
			var lastPageLi =  $("<li></li>")
								.append($("<a></a>")
										.append("末页")
										.attr("href","#"));
			
			if(result.extend.pageInfo.hasNextPage ==false){
				nextPageLi.addClass("disabled");
				lastPageLi.addClass("disabled");
			}else{
				nextPageLi.click(function(){
					to_page(result.extend.pageInfo.pageNum+1);
				});
				lastPageLi.click(function(){
					to_page(result.extend.pageInfo.pages);
				});
			}
			
			
			//首页和前一页
			ul.append(firstPageLi).append(prePageLi);
			
			$.each(result.extend.pageInfo.navigatepageNums,function(index,item){
				var numLi = $("<li></li>").append($("<a></a>").append(item));
				if(result.extend.pageInfo.pageNum == item){
					numLi.addClass("active");
				}
				numLi.click(function(){
					to_page(item);
				});
				ul.append(numLi);
			});
			//添加下一页和末页
			
			ul.append(nextPageLi).append(lastPageLi);
			
			var navEle = $("<nav></nav>").append(ul);
			
			navEle.appendTo("#page_nav_area");
		}
		
		function rest_form(ele){
			$(ele)[0].reset();
			$(ele).find("*").removeClass("has-error has-success");
			$(ele).find(".help-block").text("");
		}
		
		$("#emp_add_modal_btn").click(function(){
			rest_form("#empAddModal form");
			getDepts("#empAddModal select");
			$("#empAddModal").modal({
				backdrop:"static"
			});
		});
		
		function getDepts(ele){
			$(ele).empty();
			$.ajax({
				url:"${APP_PATH}/depts",
				type:"GET",
				success:function(result){
					//console.log(result);//{"code":100,"msg":"处理成功","extend":{"depts":[{"deptId":1,"deptName":"测试部"},{"deptId":2,"deptName":"开发部"}]}}
					//	$("#empAddModal select")
					$.each(result.extend.depts,function(){
						var optionEle = $("<option></option>").append(this.deptName).attr("value",this.deptId);
						optionEle.appendTo(ele);
					});
				}
			});
		}
		//校验表单数据
		function validate_add_form(){
			//拿到要校验的数据使用正则表达式
			var empName = $("#empName_add_input").val();
			var regName = /(^[a-zA-Z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]+$)/;
			if(!regName.test(empName)){
				//alert("用户名格式错误");
				show_validate_msg("#empName_add_input","error","用户名格式错误");
				return false;
			}else{
				show_validate_msg("#empName_add_input","success","");
				
			}
			
			var email = $("#email_add_input").val();
			var regEmail = /^[a-z\d]+(\.[a-z\d]+)*@([\da-z](-[\da-z])?)+(\.{1,2}[a-z]+)+$/;
			
			if(!regEmail.test(email)){
				//alert("邮箱格式错误");
				show_validate_msg("#email_add_input","error","邮箱格式错误");
				return false;
			}else{
				show_validate_msg("#email_add_input","success","");
			}
			
			return true;
		}
		
		function show_validate_msg(ele,status,msg){
			$(ele).parent().removeClass("has-success has-error");
			$(ele).next("span").text("");
			if("success"==status){
				$(ele).parent().addClass("has-success");
				$(ele).next("span").text("");
				
			}else if("error"==status){
				$(ele).parent().addClass("has-error");
				$(ele).next("span").text(msg);
				
			}
			
			
		}
		
		$("#empName_add_input").change(function(){
			var empName = this.value;
			$.ajax({
				url:"${APP_PATH}/checkuser",
				data:"empName="+empName,
				type:"POST",
				success:function(result){
					if(result.code==100){
						show_validate_msg("#empName_add_input","success","");
						$("#emp_save_btn").attr("ajax-va","success");
					}else{
						show_validate_msg("#empName_add_input","error",result.extend.va_msg);
						$("#emp_save_btn").attr("ajax-va","error");
					}
				}
			});
			
		});
		
		$("#emp_save_btn").click(function(){
			
			if(!validate_add_form()){
				return false;
			}
			if($(this).attr("ajax-va")=="erroe"){
				return false;
			}
			$.ajax({
				url:"${APP_PATH}/emp",
				type:"POST",
				data: $("#empAddModal form").serialize(),
				success:function(result){
					//alert(result.msg);
					
					if(result.code == 100){
						$("#empAddModal").modal('hide');
						
						to_page(totalRecord);
					}else{
						//console.log(result);
						if(undefined != result.extend.errorFields.email){
							show_validate_msg("#email_add_input","error",result.extend.errorFields.email);
						}
						if(undefined != result.extend.errorFields.empName){
							show_validate_msg("#empName_add_input","error",result.extend.errorFields.empName);
						}
					}
					
					
				}
			});
		});
		
		
		
		$(document).on("click",".edit_btn",function(){
			getDepts("#empUpdateModal select");
			getEmp($(this).attr("edit-id"));
			$("#emp_update_btn").attr("edit-id",$(this).attr("edit-id"));
			$("#empUpdateModal").modal({
				backdrop:"static"
			});
		});
		
		function getEmp(id){
			$.ajax({
				url:"${APP_PATH}/emp/"+id,
				type:"GET",
				success:function(result){
					var empData = result.extend.emp;
					$("#empName_update_static").text(empData.empName);
					$("#email_update_input").val(empData.email);
					$("#empUpdateModal input[name=gender]").val([empData.gender]);
					$("#empUpdateModal select").val([empData.dId]);
				}
			});
		}
		//更新员工信息
		$("#emp_update_btn").click(function(){
			var email = $("#email_update_input").val();
			var regEmail = /^[a-z\d]+(\.[a-z\d]+)*@([\da-z](-[\da-z])?)+(\.{1,2}[a-z]+)+$/;
			
			if(!regEmail.test(email)){
				//alert("邮箱格式错误");
				show_validate_msg("#email_update_input","error","邮箱格式错误");
				return false;
			}else{
				show_validate_msg("#email_update_input","success","");
			}
			//发送ajax请求
			$.ajax({
				url:"${APP_PATH}/emp/"+$(this).attr("edit-id"),
				type:"PUT",
				data:$("#empUpdateModal form").serialize(),
				success:function(result){
					//alert(result.msg);
					$("#empUpdateModal").modal("hide");
					to_page(currentPage);
				}
			});
		});
		$(document).on("click",".delete_btn",function(){
			
			var empName = $(this).parents("tr").find("td:eq(2)").text();
			var empId = $(this).attr("del-id");
			if(confirm("确认删除【"+empName+"】吗？")){
				$.ajax({
					url:"${APP_PATH}/emp/"+empId,
					type:"DELETE",
					success:function(result){
						
						to_page(currentPage);
					}
				});
				
			}
			
		});
		
		$("#check_all").click(function(){
			$(".check_item").prop("checked",$(this).prop("checked"));
		});
		
		$(document).on("click",".check_item",function(){
			
			var flag = $(".check_item:checked").length == $(".check_item").length;
			$("#check_all").prop("checked",flag);
		});
		
		//点击全部删除emp_delete_all_btn
		$("#emp_delete_all_btn").click(function(){
			
			var empNames = "";
			var del_idstr = "";
			
			$.each($(".check_item:checked"),function(){
				empNames += $(this).parents("tr").find("td:eq(2)").text()+",";
				del_idstr += $(this).parents("tr").find("td:eq(1)").text()+"-";
			});
			empNames = empNames.substring(0, empNames.length-1);
// 			alert("empNames:"+empNames);
			del_idstr = del_idstr.substring(0, del_idstr.length-1);
			if(confirm("确认删除【"+empNames+"】吗？")){
				$.ajax({
					url:"${APP_PATH}/emp/"+del_idstr,
					type:"DELETE",
					success:function(result){
						alert(result.msg);
						to_page(currentPage);
					}
				});
			}
		});
	</script>
</body>
</html>