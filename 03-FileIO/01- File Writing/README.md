# Escrita em Arquivo - Java / File Writing - Java

[Português](#português) | [English](#english)

---

<a id="português"></a>
## Português

### Descrição
Este programa solicita um texto ao usuário e o grava em um arquivo chamado `texto.txt`. Se o arquivo já existir, ele será sobrescrito com o novo conteúdo.

### Funcionalidades
1. **Entrada de Dados**
   - O programa solicita ao usuário um texto via terminal.
   - O texto digitado é armazenado para ser escrito em um arquivo.

2. **Escrita no Arquivo**
   - O texto fornecido pelo usuário é gravado em um arquivo `texto.txt`.
   - Se o arquivo já existir, ele será sobrescrito.

3. **Tratamento de Erros**
   - Caso ocorra algum problema ao gravar o arquivo (ex.: falta de permissões ou erro no disco), o programa exibe uma mensagem de erro amigável.

### Conceitos Praticados
- Manipulação de arquivos em Java com `FileWriter`.
- Entrada de dados do usuário com `Scanner`.
- Tratamento de exceções com `IOException`.
- Uso da estrutura `try-with-resources` para fechamento automático de arquivos.

---

<a id="english"></a>
## English

### Description
This program asks the user for text input and writes it to a file called `texto.txt`. If the file already exists, it will be overwritten with the new content.

### Features
1. **Data Input**
   - The program requests text from the user via the terminal.
   - The entered text is stored to be written to a file.

2. **File Writing**
   - The text provided by the user is written to a `texto.txt` file.
   - If the file already exists, it will be overwritten.

3. **Error Handling**
   - If there is a problem writing to the file (e.g., lack of permissions or disk error), the program displays a friendly error message.

### Practiced Concepts
- File manipulation in Java using `FileWriter`.
- User data input with `Scanner`.
- Exception handling with `IOException`.
- Use of the `try-with-resources` structure for automatic file closing.
