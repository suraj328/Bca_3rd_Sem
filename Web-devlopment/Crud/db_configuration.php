<?php
    $server="localhost";
    $username="root";
    $password="";
    $dbname="INFO";

    $conn=mysqli_connect($server,$username,$password,$dbname);
    
    if(!$conn){
        die("error".mysqli_connect_error());
    }
    
?>