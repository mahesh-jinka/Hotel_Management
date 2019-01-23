<%-- 
    Document   : NewRoomCategory
    Created on : Jan 21, 2019, 12:35:59 PM
    Author     : welcome
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body  style="background: url(Images/img2.jpg)">>
        <h1><center>New Room Category </center></h1>
        <form>
             <table align="center">
                <tr>
                    <td> Enter Room Category </td>
                    <td>  <input type="text" name="Room Category"></td> 
                 </tr>
            
             <tr>
              <td>Select AC Type</td>
              <td><select>
                 <option value="AC">AC</option>
                 <option value="Non-AC">Non-AC</option>
                  </select></td> 
             </tr>

           </tr>
            <td>Rent       </td>
               <td> <input type="text" name="Rent"></td>
           </tr>
           
           <td> <input type="submit" value="save"></td>  

         
            </table> </form>
    </body>
</html>
       
