
<?php

include("mysql_connect.php");


?>
<!DOCTYPE html>
<html class="" lang="en"> <!--<![endif]-->

<head>

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
	<link rel="stylesheet" href="css/styles.css">

	<script type="text/javascript" src="//use.typekit.net/wdj6cpr.js"></script>
	<script type="text/javascript">try{Typekit.load();}catch(e){}</script>

	<script src="http://seanhalpin.io/assets/js/respond.min.js"></script>
	<script src="http://seanhalpin.io/assets/js/modernizr.js"></script>




</head>


<body class="">





<section id="top">

		<header id="home-top" class="nav-top nav-fixed nav-root">

			<div class="container">

				<div class="row">

					<div class="col-md-4 col-xs-4">

						<h1 id="header-logo" class="image-text">

						</h1>

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

			<div id="title" class="work-head">



				<div class="container">

					<div class="transistion cloud left-cloud-notes"></div>
					<div class="transistion cloud right-cloud-notes"></div>

					<div class="transistion flag flag-left"></div>
					<div class="transistion flag flag-right"></div>

					<div class="row">

						<div class="col-md-12">


							<div id="head-slider" class="transistion">

								<div class="slide-contents">

									<div class="slide">




									</div>


								</div>


							</div>


						</div> <!-- /col 24 -->

					</div> <!-- /row -->

				</div>

			</div>

		</div>



	</section>
<section id="notes">


		<div class="container">

			<div class="row">

				<div class="col-md-12">

					<div class="note">

						<h2>Login Here</h2>

						<h3 class="time">
							<span>Vending</span>, <span>Machine</span>, <span>System</span>
						</h3>

						<table class="L-Table">
						<form action="login_handler.php" method="post">


								<tr>
									<td>Email </td>
									<td><input type="text" name="name" value="" required=""></td>
								</tr>
								<tr>
									<td>Password </td>
									<td><input type="password" name="password" value="" required=""></td>
								</tr>
								<tr>
									<td></td>
									<td><button class="bb" type="submit" name="login">Login</button></td>
								</tr>


						</form>
						</table>

					</div>

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
<section id="comments">

	<div class="comments-wrap">

		<div class="container">

			<div class="row">

				<div class="col-md-12">



			</div>

		</div>

	</div>

</section>




<section id="i-can-help">

		<div class="container">

			<div class="row">

				<div class="col-md-12">

					<article>


						<header>

							<h2>We can help.</h2>

							<h3>The Future of Vending Machine is here</h3>

						</header>

						<p>Have any ideas or suggestion regarding vending machine?You are welcome to click contact button below.</p>

						<p class="btn-hldr">

							<a href="mailto:scm@gmail.com" class="main-btn email-lnk">message us <i class="email"></i></a>

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

            <li><a href="#">SocMed1</a></li>
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
