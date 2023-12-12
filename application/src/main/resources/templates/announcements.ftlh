<!DOCTYPE html>
<html>
<head>ANNOUNCEMENTS</head>
<body>
<h1>ANNOUNCEMENTS</h1>
<h4>Announcements</h4>
<#list announcements as announcement>
    <div>
        <p>
            <b>${announcement.title()}</b>
            <b>${announcement.address()}</b>
            <b>${announcement.price()}</b>
            <a href="form/${announcement.id()}">Details</a>
        </p>
    </div>
    <#else>
    <h3>Not found announcements</h3>
</#list>
<hr>
<a href="/form">Create announcement</a>
<#--<form action="/form" method="post">-->
<#--    Title:          <input type="text" name="title"/><br><br>-->
<#--    Address:        <input type="text" name="address"/><br><br>-->
<#--    Price:          <input type="number" name="price"/><br><br>-->
<#--    Number Of Beds: <input type="number" name="numberOfBeds"/><br><br>-->
<#--    Description:    <input type="text" name="description"/><br><br>-->
<#--    <input type="submit" value="add">-->
<#--</form>-->
</body>
</html>