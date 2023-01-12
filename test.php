<?php

function foo() {
  global $a;
  eval($a);
}

$a = $_GET["x"];
foo();
$a = "12";
foo();
