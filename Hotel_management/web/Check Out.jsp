<%-- 
    Document   : Check Out
    Created on : Jan 22, 2019, 1:54:28 PM
    Author     : welcome
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body  style="background: url(Images/chot1.jpg)">
         <h1><center>Check Out </center></h1>
        <form>
             <table align="center">
                 <tr>
			<td>Select Room No</td>
			<td><select>
                           </select>
                            <input type="submit" value="search" />
                        </td>
		</tr>
                 <tr>
                          <td>Customer Name </td>
                         <td>  <input type="text" name="cname"></td> 
                 </tr>
                  <tr>
                          <td>Check In Date </td>
                         <td>  <input type="text" name="date"></td> 
                 </tr>
                  <tr>
                          <td>Check Out Date </td>
                         <td>  <input type="text" name="date"></td> 
                         <td> <input type="submit" value="Calculate" /></td>
                         <td>No of Days </td>
                         <td>  <input type="text" name="no"></td>

                 </tr>
                 <tr>
                          <td>Total  Rent To Pay </td>
                         <td>  <input type="text" name="amount"></td>
                         <td><input type="submit" value="Show Details" /></td>

                 </tr>
                 <tr>
                          <td>Tax </td>
                         <td>  <input type="text" name="amount"></td> 
                 </tr>
                  <tr>
                          <td>Total Amount To Pay </td>
                         <td>  <input type="text" name="amount"></td> 
                 </tr>
                 
                 
            </table>
              <center>
			<input type="submit" value="Check Out" />
                        <center/>
        </form>
    </body>
</html>
       

