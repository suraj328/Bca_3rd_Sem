<?php
    include 'db_configuration.php';
    if(!empty($_POST['name']) ||!empty($_POST['email'])||!empty($_POST['address'])||!empty($_POST['contact'])){
        $name=$_POST['name'];
        $email=$_POST['email'];
        $address=$_POST['address'];
        $contact=$_POST['contact'];

        $sql="INSERT INTO `INFO_Details`(`Name`,`Email`,`Address`,`Conatact`)VALUES('$name','$email','$address',$contact)";
        if (mysqli_query($conn,$sql)) {
            echo'<script type="text/JavaScript">alert("inserted")</script>';
        }
    }else {
        echo'<script type="text/JavaScript">alert("field cannt be empty")</script>';
    }
    mysqli_close($conn);
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>StoreData</title> 
    <style>
        section{
            margin-top:10%;
            margin-left:25%;
            
            width:40vw;
            height:40%;
        }
        
    </style>
</head>
<body>
    <section>
    <fieldset>
        <legend>Hey Fill Up This Forms!!</legend>
        <form action="http://localhost/exam/StoreRecords.php" method="POST">
        <Table>
            <tr>
                <td><label for="name">Name</label></td>
                <td><input id="name"type="text" name="name"></td>
            </tr>
            <tr>
                <td><label for="email">Email</label></td>
                <td><input id="email"type="text" name="email"></td>
            </tr>
            <tr>
                <td><label for="address">Address</label></td>
                <td><input id="address"type="text" name="address"></td>
            </tr>
            <tr>
                <td><label for="contact">Contact_no</label></td>
                <td><input id="contact"type="text" name="contact"></td>
            </tr>
            <tr>
                <td><input type="submit"></td>
                
            </tr>
        </Table>
        </form>
    </fieldset>
    </section>
</body>
</html>
