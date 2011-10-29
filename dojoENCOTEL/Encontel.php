<?php
class Encontel
{

    private function retornaNumeroDaTecla($letra)
    {
        if ($letra == '1' || $letra == '0' || $letra == '-'){
             return $letra;
        } else if ($letra == 'A' || $letra == 'B' || $letra == 'C'){
            return 2;
        } else if ($letra == 'D' || $letra == 'E' || $letra == 'F'){
            return 3;
        } else if ($letra == 'G' || $letra == 'H' || $letra == 'I'){
            return 4;
        } else if ($letra == 'J' || $letra == 'K' || $letra == 'L'){
            return 5;
        } else if ($letra == 'M' || $letra == 'N' || $letra == 'O'){
            return 6;
        } else if ($letra == 'P' || $letra == 'Q' || $letra == 'R' || $letra == 'S'){
            return 7;
        } else if ($letra == 'T' || $letra == 'U' || $letra == 'V'){
            return 8;
        } else if ($letra == 'W' || $letra == 'X' || $letra == 'Y' || $letra == 'Z'){
            return 9;
        }
        return null;
    }

    public function retornaNumeroDoTelefone($frase)
    {
        $numeroDoTelefone = '';
        $tamanhoDaFrase = strlen($frase);
        for ($i = 0; $i < $tamanhoDaFrase ; $i++) {
            $numeroDoTelefone .= $this->retornaNumeroDaTecla($frase[$i]);
        }
        return $numeroDoTelefone;
    }
}
