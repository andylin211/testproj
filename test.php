<?php

class A
{
  public $x;
  public $y;
}

$a = new A();
$a->x = $_GET["x"];
eval($a->y);
eval($a->x);
