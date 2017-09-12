<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="js/jquery-3.2.1.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
$(function () {
	
	$("input[name='name']").blur(function() {
		$.get("getRegByName",
				{"name":$("input[name='name']").val()},
				function(res){
			    if(res=="n"){
			    	$("#warn").hide();
			    }else if(res=="y"){
			    	$("#warn").show();
			    }
		},"text")
	})
})

</script>

<title>Insert title here</title>
</head>
<body>
<form action="RegitUser" method="post">
 <input type="hidden" name="id">
 <div>
 姓名：<input type="text" name="name">
 <span id="warn" style="display:none" >用户名已经存在</span><br>
 密码：<input type="text" name="password"><br>
 出生日期：<input type="date" name="birthday"><br>
 年龄：<input type="text" name="age"><br>
 邮箱：<input type="text" name="email"><br>
 <input type="submit" value="注册"><br>
 <a href="check">用户列表</a>
 </div>
</form>
</body>
</html>