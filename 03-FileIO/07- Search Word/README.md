# Busca de Palavra em Arquivo - Java / Word Search in File - Java

[Português](#português) | [English](#english)

---

<a id="português"></a>
## Português

### Descrição
Este programa permite que o usuário busque uma palavra dentro de um arquivo `entrada.txt` e informa quantas vezes ela aparece no texto.

### Funcionalidades
1. **Entrada do Usuário**
   - O usuário digita a palavra que deseja buscar no arquivo.

2. **Leitura e Processamento do Arquivo**
   - O arquivo `entrada.txt` é lido e seu conteúdo é processado.
   - A busca não diferencia maiúsculas e minúsculas (`case-insensitive`).
   - A contagem de ocorrências da palavra no arquivo é feita corretamente.

3. **Tratamento de Erros**
   - Se o arquivo não for encontrado, exibe uma mensagem apropriada.
   - Se houver falhas na leitura, captura a exceção e informa ao usuário.

### Conceitos Praticados
- Leitura de arquivos com `BufferedReader`.
- Manipulação de strings para busca com `equalsIgnoreCase()`.
- Uso de `split("\s+")` para segmentação precisa das palavras.
- Tratamento de exceções com `FileNotFoundException` e `IOException`.

---

<a id="english"></a>
## English

### Description
This program allows the user to search for a word inside an `entrada.txt` file and reports how many times it appears in the text.

### Features
1. **User Input**
   - The user types the word they want to search for in the file.

2. **File Reading and Processing**
   - The `entrada.txt` file is read and its content is processed.
   - The search is case-insensitive.
   - The count of occurrences of the word in the file is done correctly.

3. **Error Handling**
   - If the file is not found, displays an appropriate message.
   - If there are reading failures, catches the exception and informs the user.

### Practiced Concepts
- File reading with `BufferedReader`.
- String manipulation for searching with `equalsIgnoreCase()`.
- Use of `split("\s+")` for precise word segmentation.
- Exception handling with `FileNotFoundException` and `IOException`.
