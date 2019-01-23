<%-- 
    Document   : Show Food Order
    Created on : Jan 22, 2019, 11:21:56 AM
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
<body style="background: url(Images/img3.jpg)">
    <center>
	<h1>Show Food Order</h1>
        <div class="ex">
            <center>
		<form>
			<table style="width: 50%">
				<tr>
					<td>Room No</td>
					<td><input type="text" name="no" /></td>
				</tr>
				<tr>
					<td>Customer Name</td>
					<td><input type="text" name="cname" /></td>
				</tr>
				<tr>
					<td>Select Date</td>
                                            <td><select>
                                            <option value=""></option>
                                            <option value=""></option>
                                            </select>
                                            </td>
                                            
                                            <td><input type="submit" value="save" />
                                            </td>
                                </tr>
                                <tr>
                                    
                                    <td align="left">Food to Order</td>
                                    <td><ul>
                                               <li></li>
                                                  <li></li>
                                                  <li></li>
                                                </ul>
                                    </td>
                                      <td align="center">Quantity</td>
                                    <td><ul>
                                                  <li></li>
                                                  <li></li>
                                                  <li></li>
                                                </ul>
                                    </td>
                                    <td align="right">Price</td>
                                    <td><ul>
                                                  <li></li>
                                                  <li></li>
                                                  <li></li>
                                                </ul>
                                    </td>
                                </tr>
                                
                                
                                
            
		</form>
</center>		
	</div>
</center>
</body>
</html>
