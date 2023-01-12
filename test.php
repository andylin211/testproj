<?php

function foo($x) {
  eval($x);
}

$a = $_GET["x"];
foo($a);
$a = "12";
foo($a);
