<?php
$queryt=$_POST["querytype"];
$boatid=$_POST["boatid"];
$fname=$_POST["firstname"];
$lname=$_POST["lastname"];
$sailtype=$_POST["stype"];
$len=$_POST["length"];
$yearb=$_POST["year"];
$spaid=$_POST["paid"];
$motort=$_POST["motortype"];
$assigneds=$_POST["assignedslip"];

$input = array($boatid,$fname,$lname,$sailtype,$len,$yearb,$spaid,$motort,$assigneds);
$myfile = fopen("sailorinfo.txt", "r") or die("Unable to open file!");
$info = explode("|", fgets($myfile));	
$data = array();
foreach ($info as $item)
{
    $data[] = explode(" ", $item);
}
if ($queryt == 2)
{ 
$a1=array();
	for ($row = 0; $row < 2; $row++) 
	{
	
	if (($data[$row][0] == NVL($boatid,$data[$row][0])) && ($data[$row][1] == NVL($fname,$data[$row][1])) && ($data[$row][2] == NVL($lname,$data[$row][2])) && ($data[$row][3] == NVL($sailtype,$data[$row][3])) && ($data[$row][4] == NVL($len,$data[$row][4])) && ($data[$row][5] == NVL($yearb,$data[$row][5])) && ($data[$row][6] == NVL($spaid,$data[$row][6])) && ($data[$row][7] == NVL($motort,$data[$row][7])) && ($data[$row][8] == NVL($assigneds,$data[$row][8])))
		  {
			  array_push($a1,"  | ".$data[$row][0]." &nbsp&nbsp&nbsp&nbsp&nbsp	||&nbsp&nbsp 	".$data[$row][1]." &nbsp&nbsp&nbsp||&nbsp&nbsp&nbsp&nbsp 		".$data[$row][2]."&nbsp&nbsp&nbsp||&nbsp&nbsp&nbsp&nbsp&nbsp	 	".$data[$row][3]."&nbsp&nbsp&nbsp&nbsp||	&nbsp&nbsp&nbsp&nbsp&nbsp	 ".$data[$row][4]." 	&nbsp&nbsp&nbsp&nbsp&nbsp	||&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp		 ".$data[$row][5]." &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp		|| &nbsp&nbsp&nbsp&nbsp&nbsp		".$data[$row][6]."		&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp || &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp		".$data[$row][7]." 	&nbsp&nbsp&nbsp&nbsp&nbsp	|| &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp		".$data[$row][8]);
		  }
		  echo "\n";
	}
	echo json_encode($a1);
}
else if ($queryt == 3)
{
	for ($row = 0; $row < 2; $row++) 
	{
	if ($data[$row][0] == $boatid)
		  {
				for ($col = 0; $col < 9; $col++)
				{
				  $data[$row][$col] = $input[$col];
				}
				
		  }
	}
	$a2=array();
	 array_push($a2,"Success");
	echo json_encode($a2);
	$myfile1 = fopen("sailorinfo.txt", "w") or die("Unable to open file!");
	for ($row = 0; $row < 2; $row++)
	{
		for ($col = 0; $col < 9; $col++)
		{
			if ($col!=8)
				fwrite($myfile1,  $data[$row][$col]." ");
			else
				fwrite($myfile1,  $data[$row][$col]);
		}
		if ($row!=1)
		fwrite($myfile1,'|');	
	}	
}
function NVL($a,$b) 
	{
		if ($a=="")
			return $b;
		else
			return $a;
	}
?>