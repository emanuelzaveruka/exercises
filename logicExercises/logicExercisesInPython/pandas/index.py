import pandas as pd


carros = {
    'nome': ['Fusca', 'Gol', 'Palio', 'Uno'],
    'marca': ['Volkswagen', 'Volkswagen', 'Fiat', 'Fiat'],
    'preco': [10000, 20000, 30000, 40000]
}

dataframe = pd.DataFrame(carros)

dataframe.to_excel('carros.xlsx')
dataframe.to_csv('carros.csv', index=False)