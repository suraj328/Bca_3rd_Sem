<?php
    
    
    include 'DatabaseConfiguration.php';
    
    
    if(!empty($_POST['username']) || !empty($_POST['password']) || !empty($_POST['cpassword'])){
        $username=$_POST['username'];
        $password=$_POST['password'];
        $cpassword=$_POST['cpassword'];
        
        $sql="SELECT * FROM `users` WHERE `username`='$username'";
        $search=mysqli_query($conn,$sql);
        $num=mysqli_num_rows($search);
            if($num==0){
                
                if($password==$cpassword){
                    $sql="INSERT INTO `users` (`SN`, `username`, `password`) VALUES (NULL, '$username', '$password')";
                    if(mysqli_query($conn,$sql)){
                        echo'<script type="text/JavaScript">alert("Register sucessfully")</script>';
                    }
                    
                }else{
                    echo'<script type="text/JavaScript">alert("password do not match")</script>';
                }
            }else{
                echo'<script type="text/JavaScript">alert("username is already taken")</script>';
            }       
    }else{
        echo'<script type="text/JavaScript">alert("Note:Field cannpt be empty")</script>';
        }
    mysqli_close($conn); 
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Register</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div>
        <h1>Hello! You Can Sign Up Here</h1>
    <form action="http://localhost/practise/signup.php" method="POST">
        <table>
            <tr>
                <a href="login.php">Already have an account</a>
            </tr>
        <tr>
            <td> <label for="username">Username:</label></td>
            <td> <input id="username" type="text" name="username" placeholder="Your username here"></td>
        </tr>
        <tr>
            <td> <label for="password">Password:</label></td>
            <td> <input id="password" type="password" name="password" placeholder="Your password here"></td>
        </tr>
        <tr>
            <td> <label for="cpassword">Comfirm Password:</label></td>
            <td> <input id="cpassword" type="password" name="cpassword" placeholder="Your password here"></td>
        </tr>
        <tr>
            <td><button type="submit">signup</button></td>
        </tr>
        
        
    </table>
    </form>
</div>
</body>
</html>