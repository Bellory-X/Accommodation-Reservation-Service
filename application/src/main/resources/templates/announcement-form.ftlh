<!DOCTYPE html>
<html>
<head>ANNOUNCEMENT</head>
<body>
<h1>ANNOUNCEMENT</h1>

<h4>Announcement</h4>
<b>Title: </b>${announcement.title()}<br>
<b>Address: </b>${announcement.address()}<br>
<b>Price: </b>${announcement.price()}<br>
<b>Number Of Beds: </b>${announcement.numberOfBeds()}<br>
<b>Description: </b>${announcement.description()}<br>
<hr>

<form action="/form-delete/${announcement.id()}" method="post">
    <input type="submit" value="delete">
</form>

</body>
</html>