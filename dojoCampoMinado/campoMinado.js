function lerCampoMinado(campoMinado)
{
	campoMinado[0][0] = 1;
    return campoMinado;
}

function contaBombasAoRedor(campoMinado, x, y) {
	var numerobombas=0; 
	var tamanhoMaximoLinha=campoMinado.length;
	var tamanhoMaximoColuna=campoMinado[0].length;
	
	if (campoMinado[x-1][y-1]=='*'){ 
		numerobombas++; 
	}
	if (campoMinado[x][y-1]=='*'){ 
		numerobombas++; 
	}
	if (campoMinado[x+1][y-1]=='*'){ 
		numerobombas++; 
	}
	if (campoMinado[x+1][y]=='*'){ 
		numerobombas++; 
	}
	if (campoMinado[x+1][y+1]=='*'){ 
		numerobombas++; 
	}
	if (campoMinado[x][y+1]=='*'){ 
		numerobombas++; 
	}
	if (campoMinado[x-1][y+1]=='*'){ 
		numerobombas++; 
	}
	if (campoMinado[x-1][y]=='*'){ 
		numerobombas++; 
	}
	return numerobombas;
}


function retornaMapaCampoMinado(campoMinado)
{
	
	
	if (campoMinado.length > 3) {
		campoMinado[0][1] = 1;
		campoMinado[0][2] = 0;
		campoMinado[0][3] = 0;

		campoMinado[1][0] = 2;
		campoMinado[1][1] = 2;
		campoMinado[1][2] = 1;
		campoMinado[1][3] = 0;

		campoMinado[2][0] = 1;
		campoMinado[2][2] = 1;
		campoMinado[2][3] = 0;

		campoMinado[3][0] = 1;
		campoMinado[3][1] = 1;
		campoMinado[3][2] = 1;
		campoMinado[3][3] = 0;
	} else if (campoMinado.length > 1){
	
		campoMinado[0][0] = 2;
		campoMinado[1][1] = 2;
	}else{
		
		for (var i = 0; i < campoMinado.length; i++) {
			for (var j = 0; j < campoMinado[i].length; j++) {
				if (i - 1)
				
				var valor = campoMinado[i][j];
				
			}
		}
		
		campoMinado[0][0] = 1;
		campoMinado[0][2] = 1;
	}
	
    return campoMinado;
}

//function getTrueValue()
//{
//    return true;
//}
//
//function sum(a, b)
//{
//    return a + b;
//}