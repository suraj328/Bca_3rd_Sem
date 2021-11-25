<?php
    include 'DatabaseConfiguration.php';
    $alertTrue=false;
    echo"heloo huys";
    if(!empty($_POST['username']) && !empty($_POST['password']) ){
        $username=$_POST['username'];
        $password=$_POST['password'];
        
        $sql="SELECT * from `users` WHERE `username`='$username' and `password`='$password'";
        $find=mysqli_query($conn,$sql);
        $log=mysqli_num_rows($find);
        echo$log;

        if($log==1){
            $alertTrue=true;
            session_start();
            $_SESSION['loggedin']=true;
            $_SESSION['username']=$username;
            header("location: welcome.php");
        }else{
            echo'<script type="text/JavaScript">alert("Username or Password May Incorrect")</script>';
        }
        
    }
?>
<!DOCTYPE html>
<html lang="en">

<head>
    <title>Session</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>
    
    <div>
    <form action="http://localhost/practise/login.php" method="POST">
        <table>
            <tr>
            <td> <label for="username">Username:</label></td>
            <td> <input id="username" type="text" name="username" placeholder="Your username here"></td>
            </tr>
            <tr>
            <td> <label for="password">Password:</label></td>
            <td> <input id="password" type="password" name="password" placeholder="Your password here"></td>
            </tr>
            <tr>
                <td><button type="submit">Log in</button></td>
            </tr>
            <a href="http://localhost/practise/signup.php">create an account</a>

        </table>
    </form>
    </div>
</body>

</html>