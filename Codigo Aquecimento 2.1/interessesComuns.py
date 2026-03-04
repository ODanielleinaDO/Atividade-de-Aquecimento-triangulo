Usuario_A = {"Python", "Jogos", "Música", "IA"}
Usuario_B = {"Java", "IA", "Música", "Caminhada"}

#Usamos .intersection para verificar o que há em comum 

em_comum = Usuario_A.intersection(Usuario_B)

#Usamos .difference para definir quais as diferenças

sugestao_para_A = Usuario_B.difference(Usuario_A)

#printamos os interesses em comum entre os dois usuarios
print("Interesses em comum:")
print(em_comum)

#Sugerimos para o usuario A, coisas que ele não possui em comum com o usuario B 
print("\nSugestões para o Usuário A:")
print(sugestao_para_A)


