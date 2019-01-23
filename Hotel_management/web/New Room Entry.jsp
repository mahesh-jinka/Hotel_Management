<%-- 
    Document   : New Room Entry
    Created on : Jan 21, 2019, 3:50:46 PM
    Author     : welcome
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background: url(Images/img3.jpg)">
        <h1><center>New Room Entry </center></h1>
        <form>
            <table align="center">
                <tr>
                    <td>New Room No </td>
                    <td>  <input type="text" name="Room Category"></td>  
                 </tr>
                 
                  <tr>
                    <td>Select Category </td>
                    <td><select>
                        
                        </select></td>
                  </tr>
            
             <tr>
              <td> Ac Type   </td>
              <td><select>
                 <option value="AC">AC</option>
                 <option value="Non-AC">Non-AC</option>
                  </select></td> 
             </tr>

           </tr>
            <td>Rent       </td>
               <td> <input type="text" name="Rent"></td>
           </tr>
           
            <tr>
              <td> Availability   </td>
              <td><select>
                 <option value="A">A</option>
                 <option value="O">O</option>
                  </select></td> 
             </tr>
           
           <td> 
                     <center><input type="submit" value="save"></td>
                     </center>

         
            </table> </form>
    </body>
</html>
