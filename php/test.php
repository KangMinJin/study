<?php
// for($i=2; $i<=9; $i++){
//     echo($i."단"."\n");
//     for($j=1; $j<=9; $j++){
//         echo($i."x".$j."=".$i*$j."\n");
//     }
//     echo("\n");
// }
// echo("구구단을 외자!\n");
// for ($i=1; $i <= 9 ; $i++) { 
//     for ($j=2; $j <= 9 ; $j++) { 
//         echo($j." x ".$i." = ".$j*$i."\t");
//     }
//     echo("\n");
// }
echo("별을 찍어보자!\n");
$star = 5;
// for ($i=1; $i <= $star; $i++) { 
//     for ($j=0; $j < $i; $j++) { 
//         echo "*";
//     }
//     echo "\n";
// }
for ($i=1; $i <= $star; $i++) { 
    for ($j=$star; $i < $j; $j--) { 
        echo " ";
    }
    for ($j=0; $j < $i; $j++) { 
        echo "*";
    }
    echo "\n";
}
?>