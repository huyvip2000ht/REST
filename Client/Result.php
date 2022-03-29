<!DOCTYPE html>
<html>
<head>
    <title>Page Title</title>
</head>
<body>
</body>
<?php
$str = file_get_contents('http://localhost:8082/calculator?number1='.$_GET['num1'].
'&operator='.$_GET['operator'].'&number2='.$_GET['num2']);
$json = json_decode($str, true);
echo  "Result: ".$json['result'];
?>

</html>