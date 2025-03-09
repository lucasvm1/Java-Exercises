# Cópia de Arquivo - Java / File Copy - Java

[Português](#português) | [English](#english)

---

<a id="português"></a>
## Português

### Descrição
Este programa copia o conteúdo de um arquivo `entrada.txt` para um novo arquivo `copia.txt`, garantindo que todo o conteúdo seja mantido.

### Funcionalidades
1. **Leitura do Arquivo de Origem**
   - O programa lê o conteúdo do arquivo `entrada.txt` linha por linha.
   - Utiliza `BufferedReader` para otimizar a leitura.

2. **Escrita no Arquivo de Destino**
   - O conteúdo lido é copiado para o arquivo `copia.txt`.

3. **Tratamento de Erros**
   - Se o arquivo de origem não existir, exibe uma mensagem apropriada.
   - Se ocorrer um erro na leitura ou escrita, captura a exceção e informa ao usuário.

### Conceitos Praticados
- Manipulação de arquivos com `BufferedReader` e `FileWriter`.
- Processamento linha por linha para eficiência.
- Estrutura `try-with-resources` para gerenciamento de arquivos.
- Tratamento de exceções com `FileNotFoundException` e `IOException`.

---

<a id="english"></a>
## English

### Description
This program copies the content of an `entrada.txt` file to a new `copia.txt` file, ensuring that all content is maintained.

### Features
1. **Source File Reading**
   - The program reads the content of the `entrada.txt` file line by line.
   - Uses `BufferedReader` to optimize reading.

2. **Destination File Writing**
   - The read content is copied to the `copia.txt` file.

3. **Error Handling**
   - If the source file does not exist, displays an appropriate message.
   - If an error occurs during reading or writing, catches the exception and informs the user.

### Practiced Concepts
- File manipulation with `BufferedReader` and `FileWriter`.
- Line-by-line processing for efficiency.
- `try-with-resources` structure for file management.
- Exception handling with `FileNotFoundException` and `IOException`.
