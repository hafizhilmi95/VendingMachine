<?php 

DEFINE ('DB_USER','root');
DEFINE ('DB_PASSWORD','');
DEFINE ('DB_HOST','localhost');
DEFINE ('DB_NAME','vendmach_db');//database name

$dbc = @mysqli_connect (DB_HOST, DB_USER, DB_PASSWORD, DB_NAME) OR die ('Could not connect to MySQL: '. mysqli_connect_error());

mysqli_set_charset($dbc, 'utf8');

session_start();
?>