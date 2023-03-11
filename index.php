<?php

// $x = somar(1,3);
// $y = somar(5, 3, 2);
// $w = somar($x, $y);

// function somar ($n1, $n2, $n3=0){
//     $total = $n1 + $n2 + $n3;
//     return $total;
// }

// echo $x;



// $listaIng = [];

// $ingredientes = [
//     'Sal',
//     'Farinha de Trigo',
//     'Ovo',
//     'Leite',
//     'Amido',
// ];

// echo '<table>';
// echo '<thead><tr><th>Ingredientes</th></tr></thead>';
// echo '<tbody>';
// foreach($ingredientes as $ingrediente){
//     if($ingrediente === 'Leite' ){
//     echo '<tr><td>' . $ingrediente . '</td></tr>';
//     }
// }

// echo '</tbody>';
// echo '</table>';














$personagem = 'escolha';

$ladino =[
        'nome' => 'Lorel',
        'idade' => 90,
        'atributos' => [
            'forca' => 60,
            'agilidade' => 80,
            'destreza' => 50
        ],
        'vida' => 1000,
        'mana' => 928
    ];
    
$mago = [
    'nome' => 'Lorel',
    'idade' => 90,
    'atributos' => [
        'forca' => 60,
        'agilidade' => 80,
        'destreza' => 50
    ],
    'vida' => 1000,
    'mana' => 928
];
$guerreiro = [
    'nome' => 'Lorel',
    'idade' => 90,
    'atributos' => [
        'forca' => 60,
        'agilidade' => 80,
        'destreza' => 50
    ],
    'vida' => 1000,
    'mana' => 928
];
$clerigo = [
    'nome' => 'Varlinda',
    'sexo' => 'Feminino',
    'classe' => 'Sacerdote',
    'idade' => 90,
    'atributos' => [
        'forca' => 60,
        'agilidade' => 80,
        'destreza' => 50
    ],
    'vida' => 1000,
    'mana' => 928
];

echo '<pre>';
var_dump($clerigo['atributos']['forca']);
exit();

$lista = [
    'nome' => 'Lorel',
    'idade' => 90,
    'atributos' => [
        'forca' => 60,
        'agilidade' => 80,
        'destreza' => 50
    ],
    'vida' => 1000,
    'mana' => 928
];
echo "</br>";
echo "NOME: " .$lista['nome']."<br/>";
echo "</br>";
echo "ATRIBUTOS: ";
echo "</br>";
echo "Vida: " .$lista['vida']."<br/>";
echo "Mana: " .$lista['mana']."<br/>";
echo "</br>";
echo "Forca: " .$lista['atributos']['forca']."<br/>";
echo "Agilidade: " .$lista['atributos']['agilidade']."<br/>";
echo "Destreza: " .$lista['atributos']['destreza']."<br/>";


