# Contagem de Palavras em Arquivo - Java / Word Count in File - Java

[Português](#português) | [English](#english)

---

<a id="português"></a>
## Português

### Descrição
Este programa lê um arquivo de texto (`entrada.txt`) e conta o número total de palavras, considerando espaços, tabulações e quebras de linha como separadores.

### Funcionalidades
1. **Leitura do Arquivo**
   - O programa abre e lê o conteúdo do arquivo `entrada.txt`.
   - Armazena todo o texto do arquivo em um `StringBuilder` para processamento.

2. **Contagem de Palavras**
   - Divide o texto em palavras utilizando `split("\s+")`, garantindo separação precisa.
   - Exibe o total de palavras no console.
   - Caso o arquivo esteja vazio, informa ao usuário.

3. **Tratamento de Erros**
   - Se o arquivo não for encontrado, exibe uma mensagem apropriada.
   - Se houver problemas na leitura, captura a exceção e exibe uma mensagem.

### Conceitos Praticados
- Leitura de arquivos com `BufferedReader`.
- Manipulação de strings com `StringBuilder` para eficiência.
- Uso de expressões regulares (`split("\s+")`) para dividir palavras corretamente.
- Tratamento de exceções com `FileNotFoundException` e `IOException`.

---

<a id="english"></a>
## English

### Description
This program reads a text file (`entrada.txt`) and counts the total number of words, considering spaces, tabs, and line breaks as separators.

### Features
1. **File Reading**
   - The program opens and reads the content of the `entrada.txt` file.
   - Stores all the text from the file in a `StringBuilder` for processing.

2. **Word Counting**
   - Splits the text into words using `split("\s+")`, ensuring precise separation.
   - Displays the total number of words in the console.
   - If the file is empty, informs the user.

3. **Error Handling**
   - If the file is not found, displays an appropriate message.
   - If there are reading problems, catches the exception and displays a message.

### Practiced Concepts
- File reading with `BufferedReader`.
- String manipulation with `StringBuilder` for efficiency.
- Use of regular expressions (`split("\s+")`) to correctly divide words.
- Exception handling with `FileNotFoundException` and `IOException`.
