# Contagem de Caracteres em Arquivo - Java / Character Count in File - Java

[Português](#português) | [English](#english)

---

<a id="português"></a>
## Português

### Descrição
Este programa lê um arquivo de texto (`entrada.txt`) e conta o número total de caracteres, ignorando espaços em branco e quebras de linha.

### Funcionalidades
1. **Leitura do Arquivo**
   - O programa abre e lê o conteúdo do arquivo `entrada.txt`.
   - Armazena todo o texto do arquivo para processamento.

2. **Processamento dos Caracteres**
   - Remove todos os espaços e quebras de linha.
   - Conta o total de caracteres restantes e exibe o resultado no console.

3. **Tratamento de Erros**
   - Se o arquivo não for encontrado, exibe uma mensagem amigável.
   - Se houver problemas na leitura do arquivo, informa o erro ao usuário.

### Conceitos Praticados
- Leitura de arquivos com `BufferedReader`.
- Manipulação de strings com `StringBuilder` para eficiência.
- Uso de expressões regulares (`replaceAll("\s+", "")`) para remoção de espaços.
- Tratamento de exceções com `IOException`.

---

<a id="english"></a>
## English

### Description
This program reads a text file (`entrada.txt`) and counts the total number of characters, ignoring whitespace and line breaks.

### Features
1. **File Reading**
   - The program opens and reads the content of the `entrada.txt` file.
   - Stores all the text from the file for processing.

2. **Character Processing**
   - Removes all spaces and line breaks.
   - Counts the total remaining characters and displays the result in the console.

3. **Error Handling**
   - If the file is not found, displays a friendly message.
   - If there are problems reading the file, informs the user of the error.

### Practiced Concepts
- File reading with `BufferedReader`.
- String manipulation with `StringBuilder` for efficiency.
- Use of regular expressions (`replaceAll("\s+", "")`) for space removal.
- Exception handling with `IOException`.
