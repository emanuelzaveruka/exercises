import pandas as pd

data = pd.read_excel(r'COMPACE-PlanilhadeFrete.xlsx')


#data = pd.melt(data.reset_index(), id_vars=['CEP_INICIO', 'CEP_FINAL','TEMPO_DE_ENTREGA'])


print(data)


#data.to_excel('teste.xlsx')