<%-- 
    Document   : Food Order Form
    Created on : Jan 22, 2019, 12:27:30 PM
    Author     : welcome
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background: url(Images/foodor2.jpg)">
         <h1><center>Food Order Form </center></h1>
        <form>
             <table align="center">
                <tr>
                     <td align="left">Order No</td>
                     <td> <input type="text" name="no"></td> 
                     <td align="right">Date</td>
                     <td><input type="text" name="day"></td> 
                 </tr>
                  
                 <tr>
			<td>Select Room No</td>
			<td><select>
                           </select>
                            <input type="submit" value="ok" />
                        </td>
		</tr>
                  <tr>
                          <td>Customer Name </td>
                         <td>  <input type="text" name="cname"></td> 
                 </tr>
                  <tr>
			<td>Select Category</td>
			<td><select>
                           </select>
                        </td>
		</tr>
                <tr>
			<td>Select food Type</td>
			<td><select>
                           </select>
                            <input type="submit" value="ok" />
                        </td>
                </tr>
                 <tr>
			<td>Select Dish Name</td>
			<td><select>
                           </select>
                        <input type="submit" value="ok" />
                        </td>
                </tr>
                 <tr>
                          <td>Price </td>
                         <td>  <input type="text" name="amount"></td> 
                 </tr>
                  <tr>
                          <td>Quantity </td>
                         <td>  <input type="text" name="no"></td> 
                         <td><input type="submit" value="ADD FOOD" /></td>
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
                                    <td><input type="submit" value="Order" /></td>
               </tr>
               <tr>
                          <td>Total Amount </td>
                         <td>  <input type="text" name="amount"></td> 
                 </tr>
            </table> </form>
    </body>
</html>
       
