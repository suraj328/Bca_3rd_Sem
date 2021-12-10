<?php
    include 'db_configuration.php';
    $sql="SELECT * FROM `INFO_Details`";
    $result=mysqli_query($conn,$sql);

    $num=mysqli_num_rows($result);
    echo$num;
    
    // if($num>0){
    //     $row=mysqli_fetch_assoc($result);//it hels to fetch data
    //     echo var_dump($row);
    //     echo"</br>";
        
    // }

    // if($num>0){
    //     while ($row=mysqli_fetch_assoc($result)) {
    //         echo var_dump($row);
    //         echo"</br>";
    //     }
    // }

    if($num>0){
        while ($row=mysqli_fetch_assoc($result)) {
            echo "Your Name:".$row['Name']."\tYour Email:".$row['Email'].",\tYour Address:".$row['Address'].",\tYour conatct Number:".$row['Conatact'];
            echo"</br>";
        }
    }
    mysqli_close();
?>