UNIFIO
CENTRO UNIVERSITÁRIO DE OURINHOS
BRUNA ANDRADE ALVES
GIOVANA BEATRIZ FERREIRA
GUSTAVO CEZAR
GUSTAVO KAZUYUKI MATSUNAKA
KAYQUE DIAS MORENO
NELSON GILBERTO
PEDRO JOSÉ SIEIRO MARQUES
PROJETO INTEGRADOR
CLEAN HOUSE
OURINHOS
2025
1. INTRODUÇÃO
Este relatório tem como objetivo analisar o protótipo da plataforma “Clean House
Serviços”, com foco nas telas de cadastro e tela inicial (home), considerando os aspectos
de usabilidade, campos de entrada, comportamento dos elementos e sugestões de
melhoria.
2. CAMPOS DE CADASTRO
A tela de cadastro apresenta os seguintes campos:
• Email
• Nome completo
• Telefone
• CPF
• Senha
• Checkbox de aceite dos termos de uso
3. CAMPOS OBRIGATÓRIOS
Todos os campos listados acima são obrigatórios para realização do cadastro, conforme
padrões usuais de usabilidade e segurança.
4. VALIDAÇÕES NECESSÁRIAS
As seguintes validações devem ser aplicadas:
• Email: formato válido (ex: usuario@email.com)
• Nome completo: mínimo de dois nomes
• Telefone: número com DDD
• CPF: formato válido e com verificação de dígitos
• Senha: mínimo de 6 caracteres, com opção de visualização (olho)
• Checkbox: deve ser marcado para habilitar o botão "Cadastrar"
5. CAMPOS DE SELEÇÃO
• Checkbox: "Aceito e concordo com os Termos de uso"
• Link adicional: "Para minha empresa" – direciona possivelmente para outro tipo
de cadastro
6. COMPORTAMENTOS APÓS SALVAR
Ao clicar em "Cadastrar", o sistema deve:
• Validar os dados
• Exibir mensagem de sucesso
• Redirecionar para a área do usuário logado (dashboard ou página de perfil)
7. CAMPOS EDITÁVEIS
Os seguintes campos devem ser editáveis:
• Email
• Nome completo
• Telefone
• CPF
• Senha
Esses campos podem ser reeditados antes do envio e, em tela de perfil, devem permitir
atualização posterior.
8. CANCELAR VOLTA PARA...
Ao clicar em Cancelar, o sistema deve retornar para:
• Tela inicial (home), ou
• Tela de login, caso o formulário tenha sido acessado por esse caminho
9. EXCLUIR: LOCAL E FLUXO
Local: tela de perfil do usuário ou painel administrativo
Fluxo sugerido:
1. Clique em "Excluir conta"
2. Exibir modal de confirmação
3. Botões: "Confirmar exclusão" e "Cancelar"
4. Se confirmado, excluir ou inativar a conta
5. Redirecionar para tela inicial com mensagem de confirmação
10. TELA HOME - COLUNAS DE LISTAGEM
Na tela inicial, não há uma listagem tradicional com colunas. Porém, caso fosse
implementada uma listagem de profissionais ou serviços, as colunas recomendadas
seriam:
• Nome do profissional
• Especialidade
• Localidade
• Avaliação
• Status
11. O QUE OCORRE AO CLICAR NA LISTAGEM
Na tela home, ao clicar nos cards do carrossel, espera-se que:
• Navegue entre os slides
• Ou abra detalhes do serviço/profissional (com mais informações e opção de
contratação)
12. CAMPO DE BUSCA
O campo de busca visível tem o placeholder: "Pesquise aqui". Trata-se de uma busca
global.
Sugere-se que permita buscar por:
• Tipo de serviço
• Nome do profissional
• Localidade
• Palavra-chave
