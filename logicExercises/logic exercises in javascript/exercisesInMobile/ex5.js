var montante = 0,
    capital = 0,
    taxaDeJuros = 0,
    tempo = 0;

function jurosCompostos(capital, taxaDeJuros, tempo){
  for(var i = 0; i < tempo; i++){
    montante = montante*taxaDeJuros
  }
  return console.log(montante);
}

jurosCompostos(10000, 0.1, 6)