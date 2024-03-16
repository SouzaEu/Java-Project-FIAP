segundos = int(input('Digite o valor em segundos: '))

horas = segundos // 3600
minutos = (segundos % 3600) // 60

print(f'O valor em segundos: {segundos} e igual a {horas} horas, {minutos} minutos e {segundos % 60} segundos')