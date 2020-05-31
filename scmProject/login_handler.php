<html>
<head>
<title>Vending Machine</title>
</head>

<?php
	include_once 'mysql_connect.php';

?>

<?php
	//get value from login page
	$username = $_POST['name'];
	$password = $_POST['password'];


	//query the database
	$query = " SELECT * FROM user WHERE email='$username' and password ='$password'";
	$result = mysqli_query($dbc, $query);
	$row = mysqli_fetch_array($result);
	if($row['email'] == $username && $row['password'] == $password )
		{
			$_SESSION["id"] = $row["id"];
			if($row['role']=="admin"){
				echo "<script>location.href='monitoring.php'</script>";

			}
			else{echo "<script>location.href='login.php'</script>";}
		}


	else if (mysqli_num_rows($result) == 0) {/* not registered user.*/
			echo '<p><hl id="not found">Error : user not found.</h1></p>';
			header("Location: register.php?error=UserNotFound ");

		}


?>
