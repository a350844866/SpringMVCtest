<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
	<head>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<title>用户的注册页面</title>
	</head>
	<body>
		
		<form action="${pageContext.request.contextPath}/registerAction" method="POST" >
			
			<table align="center" border="1" width="45%">
				<tr>
					<td colspan="2" align="center"><h3>用户的新增</h3></td>
				</tr>
				<tr>
					<td>用户名:</td>
					<td><input name="username" type="text"/></td>
				</tr>
				<tr>
					<td>密码:</td>
					<td><input name="password" type="password"/></td>
				</tr>
				<tr>
					<td>年龄:</td>
					<td><input name="age" type="text"/></td>
				</tr>
				<tr>
					<td>生日:</td>
					<td><input name="birthday" type="date"/></td>
				</tr>
				<tr>
					<td>靓照:</td>
					<td><input name="pic" type="file"/></td>
				</tr>
				<tr>
					<td>狗名:</td>
					<td><input name="dog.name" type="text"/></td>
				</tr>
				<tr>
					<td>friends:</td>
					<td>
                    <input name="friend" type="checkbox" value="刘德华"/>刘德华
					<input name="friend" type="checkbox" value="张学友"/>张学友
					<input name="friend" type="checkbox" value="周星驰"/>周星驰
					<input name="friend" type="checkbox" value="马云"/>马云
					<input name="friend" type="checkbox" value="赵四"/>赵四
                    </td>
				</tr>
				<tr>
					<td>email:</td>
					<td><input name="email" type="text"/></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="提交"/>
					</td>
				</tr>
			</table>
		</form>
		<h1>${msg}</h1>
		
	</body>
</html>
