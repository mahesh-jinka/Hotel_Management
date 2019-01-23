<%-- 
    Document   : Customer Check In
    Created on : Jan 22, 2019, 1:13:00 PM
    Author     : welcome
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background: url(Images/ckin1.jpg)">
        <h1><center>Customer Check in </center></h1>
        <form>
            <table align="center">
                
                  
                <tr>
                          <td>Customer Name </td>
                         <td>  <input type="text" name="cname"></td> 
                 </tr>
                  <tr>
                          <td>Father Name </td>
                         <td>  <input type="text" name="fname"></td> 
                 </tr>
                 <tr>
                          <td>Customer Age </td>
                         <td>  <input type="text" name="age"></td> 
                 </tr>
                  <tr>
			<td>Gender</td>
                        <td><input type="radio" name="gender" value="male"> Male
                            <input type="radio" name="gender" value="female"> Female
                        </td>
			
		</tr>
                 <tr>
                              <td> Martial Status  </td>
                            <td><select>
                            <option value="">Married</option>
                            <option value="">unMarried</option>
                            </select></td> 
                 </tr>
                 <tr>
					<td>Address</td>
                                        <td><textarea rows="4" cols="50">
                                            </textarea>
                                        </td>
		</tr>
                 <tr>
                          <td>Mobile Number </td>
                         <td>  <input type="text" name="no"></td> 
                 </tr>
                 <tr>
			<td>Select  Room Category</td>
			<td><select>
                           </select>
                        </td>
		</tr>
               
                 <tr>
			<td>Select Ac Type</td>
			<td><select>
                           </select>
                            <input type="submit" value="ok" />
                        </td>
		</tr>
                <tr>
                          <td> Rent</td>
                         <td>  <input type="text" name="amount"></td> 
                 </tr>
                  <tr>
			<td>Rooms Available</td>
			<td><select>
                           </select>
                        </td>
		</tr>
                <tr>
                          <td>Checkin Date(DD-MM-YYYY) </td>
                         <td>  <input type="text" name="no"></td>
                          <td>Checkin Time(HH:MM) </td>
                         <td>  <input type="text" name="no"></td>
                         
                 </tr>
                 <tr>
                          <td> Purpose</td>
                         <td>  <input type="text" name="name"></td> 
                 </tr>
                  
       
            </table>
        <center>
			<input type="submit" value="save" />
                        <center/>
        </form>
    </body>
</html>
       
