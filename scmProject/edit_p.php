<?php include("mysql_connect.php"); ?>

<!DOCTYPE html>
<html>

<head>
<title>Edit Stock</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
 <!-- JS Script -->
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
<!------ Include the above in your HEAD tag ---------->
<link rel="stylesheet" href="css/tbstyles.css">
<link rel="stylesheet" href="design.css" type="text/css" />

</head>

<body>
	<main>
		<div class="container my-5">
			<div class="card-body text-center">
				<h4 class="card-title">Update Vending Machine Stock</h4>
				<p class="card-text">Insert a new stock</p>
			</div>
			<div class="card">
<?php


	if (isset($_REQUEST["PID"]))
	{
		$prodid= $_REQUEST["PID"];
		$query = mysqli_query($dbc,"select * from product where PID = $prodid");
		$row = mysqli_fetch_assoc($query);
	}
	else{header("Location: edit_product.php");}

?>


<div>

	<form name="editfrm" method="post" action="">
		<table class="main" style="margin-left:40%; margin-top:25px;">

		<tr>
				<td><p>name </p>
				</td>
				<td>:	<input type="text" name="pname" value="<?php echo $row['pname']; ?>" />
				</td>
			</tr>
			<tr>
				<td><p>price </p>
				</td>
				<td>:	<input type="number" name="price" value="<?php echo $row['price']; ?>" />
				</td>
			</tr>
			<tr>
				<td><p>description </p>
				</td>
				<td>:	<input type="text" name="location" value="<?php echo $row['location']; ?>" />
				</td>
			</tr>
			<tr>
				<td><p>category </p>
				</td>
				<td>:	<input type="text" name="category" value="<?php echo $row['category']; ?>" />
				</td>
			</tr>
			<tr>
				<td><p>stock </p>
				</td>
				<td>:	<input type="number" name="stock" value="<?php echo $row['stock']; ?>" />
				</td>
			</tr>
			
			<tr>
				<td>
				</td>
				<td><p><input class="btn btn-sm btn-success" type="submit" name="updateVbtn" value="Update" /></p>
				</td>
			</tr>


		</table>
	</form>
</div>
</div>
</div>
</main>

<body>

<?php
	if (isset($_POST["updateVbtn"]))
	{
		$pname = $_POST["pname"];
		$pprice = $_POST["price"];
		$pcategory = $_POST["category"];
		$plocation = $_POST["location"];
		$pstock = $_POST["stock"];

		
		
		$sql = "UPDATE product SET 
		pname='$pname', 
		price='$pprice',
		location='$plocation',
		category='$pcategory',
		stock='$pstock'
		WHERE PID = $prodid";
	
	if ($dbc->query($sql) === TRUE) {
    	header("Location:monitoring.php");
	}
	else {
    	echo "Error updating record: " . $dbc->error;
	}

	
		//header("Location: edit_product.php");
	}
	
?>
</html>
