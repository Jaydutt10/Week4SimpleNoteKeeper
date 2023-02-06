<%-- 
    Document   : editnote
    Created on : 5-Feb-2023, 5:13:46 PM
    Author     : jaydutt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <form method="post" action="note">
            <p>
                <b>Title:</b>
                <input type="text" name="titles" value="${title}">
            <br>
                <b>Contents:</b>
                <textarea name="content">${contents}</textarea>
                </p>
            <input type="submit" value="Save">
        </form>
            
        
    </body>
</html>
