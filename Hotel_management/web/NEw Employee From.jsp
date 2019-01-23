<%-- 
    Document   : NEw Employee From
    Created on : Jan 21, 2019, 4:48:15 PM
    Author     : welcome
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
div.ex {
	text-align: right;
         width: 500px;
	padding: 10px;
	border: 5px solid grey;
	margin: 0px
}
</style>
<body style="background: url(Images/empf1.jpg);height:100%;background-position:center;
          background-repeat: no-repeat;
          background-size: cover;">
    <center>
	<h1>New Employee From</h1>
        <div class="ex">
            <center>
		<form>
			<table style="width: 50%">
				<tr>
					<td>Enter Employee Name</td>
					<td><input type="text" name="employeename" /></td>
				</tr>
				<tr>
					<td>Address</td>
                                        <td><textarea rows="4" cols="50">
                                            </textarea>
                                        </td>
				</tr>
				<tr>
					<td>Father Name</td>
					<td><input type="text" name="Fname" /></td>
				</tr>
				<tr>
					<td> D O B </td>
					<td><input type="text" name="Dob" /></td>
				</tr>
				<tr>
					<td>Mobile</td>
					<td><input type="text" name="no" /></td>
				</tr>
				<tr>
					<td>Mail id</td>
					<td><input type="text" name="mailid" /></td>
				</tr>
				<tr>
					<td>Experience</td>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td>Designation</td>
					<td><select>
                                            <option value=""></option>
                                            <option value=""></option>
                                            </select>
                                            </td>
				</tr>
			</table>
                    <center>
			<input type="submit" value="save" />
                        <center/>
		</form>
</center>		
	</div>
</center>
</body>
</html>
