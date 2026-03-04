alfabeto = set(input("Digite os símbolos do alfabeto permitidos: "))


frase = input("Digite a frase para validar: ")


valido = True

for caractere in frase:
    if caractere not in alfabeto:
        valido = False
        break

if valido:
    print("A frase pertence ao alfabeto informado.")
else:
    print("A frase NÃO pertence ao alfabeto informado.")