import pandas as pd

data = pd.read_excel('planilha.xlsx')


data = pd.melt(data.reset_index(), id_vars=['CEP_INICIO', 'CEP_FINAL','TEMPO_DE_ENTREGA'], var_name='peso',value_name='valor')




print(data)


data.to_excel('teste.xlsx')