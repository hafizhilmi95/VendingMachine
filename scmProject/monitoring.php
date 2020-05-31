<!DOCTYPE html>
<html class="" lang="en"> <!--<![endif]-->

<?php

include("mysql_connect.php");


?>

<head>
    <script type="text/javascript">
    function confirmation()
    {
        answer = confirm("Do you want to delete this product?");
        return answer;
    }
    </script>

	<title>Vending Machine</title>

	<meta charset="utf-8"/>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

	<meta name="description" content="Vending Machine Improvement for Software Configuration Management" />
	<meta name="keywords" content="Vending Machine Future Improvement" />
	<meta name="robots" content="index, follow" />



	<link rel="apple-touch-icon-precomposed" sizes="144x144" href="http://seanhalpin.io/assets/img/ui/app/144.png">
	<link rel="apple-touch-icon-precomposed" sizes="120x120" href="http://seanhalpin.io/assets/img/ui/app/120.png">
	<link rel="apple-touch-icon-precomposed" sizes="72x72" href="http://seanhalpin.io/assets/img/ui/app/72.png">
	<link rel="apple-touch-icon-precomposed" href="http://seanhalpin.io/assets/img/ui/app/57.png">
	<link rel="icon" href="images/bug.ico" type="image/x-icon">

	<link rel="stylesheet" href="http://seanhalpin.io/assets/css/bootstrap.css" />

	<script type="text/javascript" src="//use.typekit.net/wdj6cpr.js"></script>
	<script type="text/javascript">try{Typekit.load();}catch(e){}</script>

	<script src="http://seanhalpin.io/assets/js/respond.min.js"></script>
	<script src="http://seanhalpin.io/assets/js/modernizr.js"></script>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
   <!-- JS Script -->
  <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
  <!------ Include the above in your HEAD tag ---------->
  <link rel="stylesheet" href="css/tbstyles.css">




</head>


<body class="">





<section id="top">

		<header id="home-top" class="nav-top nav-fixed nav-root">

			<div class="container">

				<div class="row">

					<div class="col-md-4 col-xs-4">


					</div>

					<div class="col-md-8 col-xs-8">

						<nav id="top-nav">

							<ul class="nav-list transistion">

														<li><a class="active" href="index.html">Home</a></li>
														<li><a href="#i-can-help">Contact</a></li>
														<li><a href="login.php">Login</a></li>

							</ul>

						</nav>

					</div> <!-- 12 -->

				</div> <!-- / row -->

			</div> <!--/ container -->


		</header><div class="masthead-wrap">

			<div id="title">



				<div class="container">

					<div class="transistion cloud left-cloud"></div>
					<div class="transistion cloud right-cloud"></div>

					<div class="row">

						<div class="col-md-12">


							<div id="head-slider" class="transistion">

								<div class="slide-contents">

									<div class="slide">

										<h2>

                    <p class="header-desc">Vending Machine</p>

										</h2>

										<p class="header-desc">Vending Machine System</p>

									</div>


								</div>


							</div>


						</div> <!-- /col 24 -->

					</div> <!-- /row -->

				</div>

			</div>

		</div>

		<div class="masthead-wrap">

			<div id="masthead">

				<div id="earth-holder">





				</div>

			</div>

		</div>

	</section>






	<div class="breaker">

		<div class="container">

			<div class="row">

				<div class="col-md-12">

					<div class="line"></div>

				</div>

			</div>

		</div>

	</div>



	<section id="what-i-do">

		<div class="container">

			<div class="row">

				<div class="col-md-12">

					<article>

						<header>

							<h2>Vending Machine Monitoring</h2>

						</header>

            <main>
              <div class="container my-5">
                <div class="card-body text-center">
                  <h4 class="card-title">Monitor Stock</h4>
                  <p class="card-text">All stock list</p>
                </div>

                <div class="card">

						<div id="design" class="row">

                        <table class="table table-hover">
                            <tr>

                                <th width="100">Name</th>
                                <th width="100">Price</th>
                                <th width="100">Location</th>
                                <th width="100">Category</th>
                                <th width="100">Stock</th>
                            </tr>

                            <?php


                                $result = mysqli_query($dbc,"select * from product");
                                while($row=mysqli_fetch_assoc($result))
                                {
                                    ?>

                                    <tr>
                                        <td><?php echo $row["pname"]; ?></td>
                                        <td><?php echo $row["price"]; ?></td>
                                        <td><?php echo $row["location"]; ?></td>
                                        <td><?php echo $row["category"]; ?></td>
                                        <td><?php echo $row["stock"]; ?></td>

                                        <td>&nbsp;</td>
                                        <td>&nbsp;</td>
                                        <td>&nbsp;</td>
                                        <td>&nbsp;</td>
                                        <td>&nbsp;</td>
                                        <td>&nbsp;</td>
                                        <td>&nbsp;</td>
                                        <td>&nbsp;</td>
                                        <td>&nbsp;</td>
                                        <td>&nbsp;</td>
                                        <td>&nbsp;</td>
                                        <td>&nbsp;</td>
                                        <td>&nbsp;</td>
                                        <td>&nbsp;</td>
                                        <td>&nbsp;</td>
                                        <td><a class="btn btn-sm btn-danger" href="<?php echo $_SERVER['PHP_SELF'];
                                            ?>?PID=<?php echo $row['PID'];?>"onclick="return confirmation();"><i class="fas fa-trash-alt"></i> delete</a></td>


                                        <td>

                                            <form action="edit_p.php" method="post"><a class="btn btn-sm btn-primary" href="edit_p.php?PID=<?php echo $row['PID'];?>"><i class="far fa-edit"></i> edit</a></form>
                                        </td>
                                    </tr>
                                    <?php
                                }
                                    ?>

                        </table>
                        <?php

                            if (isset($_REQUEST["PID"]))
                            {
                                $prodid= $_REQUEST["PID"];

                                mysqli_query($dbc,"DELETE FROM product WHERE product_id = $prodid");

                                //header("Location: monitoring.php");
                            }

                        ?>
						</div> <!-- /row -->
          </div>
          </main>


<section id="i-can-help">

		<div class="container">

			<div class="row">

				<div class="col-md-12">

					<article>


						<header>

							<h2>Need assistant?</h2>

							<h3>Just go to the contact us button for further details</h3>

						</header>

						<p>Need the same system as us? we can provided and share our knowledge of expertise with all of ours respective client</p>

						<p class="btn-hldr">

							<a href="mailto:scm@gmail.com" class="main-btn email-lnk">message me <i class="email"></i></a>

						</p>


					</article>

				</div>

			</div>

		</div>


	</section>



<footer>

		<div class="container">

			<div class="row">

				<div class="col-md-12">

					<ul class="footer-list">

						<li><a href="#">dribbble</a></li>
						<li><a href="#">twitter</a></li>
						<li><a href="https://docs.google.com/forms/d/e/1FAIpQLSfN5JS8ejetrs9we12pyMLRdugMyNDK4G7GsT9tsSLptZH7FQ/viewform?usp=sf_link" class="email-lnk">Contact Us</a></li>

					</ul>

				</div>

			</div>

			<div class="row">

				<div class="col-md-12">



					<p>© 2020 <a href="http://www.unikl.edu.my">Vending Machine SCM Unikl MIIT</a>. All rights reserved.</p>

				</div>

			</div>

		</div>

	</footer>




</body>
</html>
