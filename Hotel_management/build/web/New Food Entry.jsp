<%-- 
    Document   : New Food Entry
    Created on : Jan 21, 2019, 4:33:24 PM
    Author     : welcome
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body  style="background: url(Images/foodentry1.jpg)">
         <h1><center>New Food Entry </center></h1>
        <form>
            <table align="center">
                <tr>
                    <td>Dish Name </td>
                    <td>  <input type="text" name="Dish"></td>  
                 </tr>
                 
                  <tr>
                    <td>Food Type </td>
                    <td><select>
                        <option value="Breakfast">Breakfast</option>
                        <option value="Lunch">Lunch</option>
                         <option value="Dinner">Dinner</option>
                        </select></td>
                  </tr>
            
             <tr>
              <td> Select Category   </td>
              <td><select>
                 
                  </select></td> 
             </tr>

           </tr>
            <td>Enter Price </td>
               <td> <input type="text" name="Price"></td>
           </tr>
           
           <td> 
                     <center><input type="submit" value="save"></td>
                     </center>

         
            </table> </form>
    </body>
</html>
