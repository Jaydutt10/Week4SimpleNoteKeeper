<%-- 
    Document   : viewnote
    Created on : 5-Feb-2023, 5:13:20 PM
    Author     : jaydutt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Note keeper</title>
    </head>
    <form method="get" action="note">
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
          <p>
            <b>Title:</b>${title}
            <br>
            <b>Contents:</b>${contents}
        </p>
    </form>
      <a href="note.txt">Edit</a>
    </body>
</html>
