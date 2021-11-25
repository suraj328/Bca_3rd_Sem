<?php
    session_start();
    if(!isset($_SESSION['loggedin']) || $_SESSION['loggedin']!=true){
        header("location: login.php" );
        exit;
    }
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Welcome <?php echo$_SESSION['username'] ;?></title>
</head>
<body>
    <div>Welcome to this <?php echo$_SESSION['username'] ?>
        <br>you are logged in
    </div>
    <div>
        <a href="logout.php">Logout</a>
    </div>
    <script type="text/JavaScript">alert("You are logged in")</script>;
</body>
</html>