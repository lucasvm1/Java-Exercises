# Leitura de Arquivo - Java / File Reading - Java

[Português](#português) | [English](#english)

---

<a id="português"></a>
## Português

### Descrição
Este programa lê o conteúdo de um arquivo `entrada.txt` e exibe seu conteúdo linha por linha no console.

### Funcionalidades
1. **Verificação do Arquivo**
   - O programa tenta abrir o arquivo `entrada.txt` no caminho especificado.
   - Caso o arquivo não exista, uma mensagem amigável é exibida.

2. **Leitura e Exibição**
   - O conteúdo do arquivo é lido **linha por linha** e impresso no terminal.
   - Utiliza `BufferedReader` para otimizar a leitura do arquivo.

3. **Tratamento de Erros**
   - Se o arquivo não for encontrado, o programa exibe um aviso específico.
   - Se ocorrer outro erro, o programa captura a falha e evita a interrupção abrupta.

### Conceitos Praticados
- Leitura de arquivos com `BufferedReader`.
- Uso de `FileReader` para abertura de arquivos.
- Estrutura `try-with-resources` para gerenciamento de recursos.
- Tratamento de exceções com `FileNotFoundException` e `IOException`.

---

<a id="english"></a>
## English

### Description
This program reads the content of an `entrada.txt` file and displays its content line by line in the console.

### Features
1. **File Verification**
   - The program attempts to open the `entrada.txt` file in the specified path.
   - If the file does not exist, a friendly message is displayed.

2. **Reading and Display**
   - The file content is read **line by line** and printed in the terminal.
   - Uses `BufferedReader` to optimize file reading.

3. **Error Handling**
   - If the file is not found, the program displays a specific warning.
   - If another error occurs, the program catches the failure and prevents abrupt interruption.

### Practiced Concepts
- File reading with `BufferedReader`.
- Use of `FileReader` for opening files.
- `try-with-resources` structure for resource management.
- Exception handling with `FileNotFoundException` and `IOException`.
