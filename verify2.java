<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head profile="http://selenium-ide.openqa.org/profiles/test-case">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="selenium.base" href="http://www.straitstimes.com/" />
<title>verify2</title>
</head>
<body>
<table cellpadding="1" cellspacing="1" border="1">
<thead>
<tr><td rowspan="1" colspan="3">verify2</td></tr>
</thead><tbody>
<tr>
	<td>open</td>
	<td>/global</td>
	<td></td>
</tr>
<tr>
	<td>click</td>
	<td>css=button.navbar-toggle-user</td>
	<td></td>
</tr>
<tr>
	<td>clickAndWait</td>
	<td>link=Login</td>
	<td></td>
</tr>
<tr>
	<td>type</td>
	<td>id=j_username</td>
	<td>ruthc.it@gmail.com</td>
</tr>
<tr>
	<td>type</td>
	<td>id=j_password</td>
	<td>Temp1234</td>
</tr>
<tr>
	<td>clickAndWait</td>
	<td>css=button.btn</td>
	<td></td>
</tr>
<tr>
	<td>pause</td>
	<td>10000</td>
	<td></td>
</tr>
<tr>
	<td>waitForPageToLoad</td>
	<td>10000</td>
	<td></td>
</tr>
<tr>
	<td>clickAndWait</td>
	<td>css=a.block-link</td>
	<td></td>
</tr>
<tr>
	<td>waitForPageToLoad</td>
	<td>50000</td>
	<td></td>
</tr>
<tr>
	<td>verifyElementPresent</td>
	<td>css=img.img-responsive</td>
	<td></td>
</tr>
<tr>
	<td>click</td>
	<td>css=button.navbar-toggle-user</td>
	<td></td>
</tr>
<tr>
	<td>clickAndWait</td>
	<td>link=Logout</td>
	<td></td>
</tr>

</tbody></table>
</body>
</html>
