<?php

    $servername="localhost";
    $username="root";
    $password="";
    $db="session";
    

    $conn=mysqli_connect($servername,$username,$password,$db);

    if(!$conn){
        die("error".mysqli_connect_error());
    }
    
    

?>