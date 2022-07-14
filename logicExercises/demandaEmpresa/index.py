import pandas as pd

data = pd.read_excel('CompacePlanilha.xlsx')

data = pd.melt(data.reset_index(), id_vars=['CEP_INICIO', 'CEP_FINAL','TEMPO_DE_ENTREGA'],var_name='peso',value_name='valor')

#data = data[data.peso.str.contains("index") == False]

print(data)

#data.to_excel('index.xlsx')