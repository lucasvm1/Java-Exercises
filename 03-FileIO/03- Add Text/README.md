# Adição de Texto ao Arquivo - Java / Text Appending to File - Java

[Português](#português) | [English](#english)

---

<a id="português"></a>
## Português

### Descrição
Este programa solicita ao usuário um texto e adiciona ao final do arquivo `saida.txt`, sem sobrescrever o conteúdo anterior.

### Funcionalidades
1. **Entrada de Dados**
   - O usuário pode digitar várias linhas para adicionar ao arquivo.
   - O programa pergunta se deseja adicionar outra linha antes de finalizar.

2. **Escrita no Arquivo**
   - O texto digitado é **adicionado** ao final do arquivo `saida.txt`.
   - Se o arquivo não existir, ele será criado automaticamente.

3. **Tratamento de Erros**
   - Se houver problemas na escrita, uma mensagem de erro é exibida.
   - Garante que apenas respostas válidas (`s/n`) sejam aceitas.

### Conceitos Praticados
- Manipulação de arquivos com `FileWriter` no modo de adição (`append = true`).
- Entrada e validação de dados com `Scanner`.
- Uso de loops (`do-while`) para permitir múltiplas entradas.
- Tratamento de exceções (`IOException`) para lidar com falhas na escrita do arquivo.

---

<a id="english"></a>
## English

### Description
This program asks the user for text input and adds it to the end of the `saida.txt` file without overwriting the previous content.

### Features
1. **Data Input**
   - The user can type multiple lines to add to the file.
   - The program asks if the user wants to add another line before finishing.

2. **File Writing**
   - The typed text is **appended** to the end of the `saida.txt` file.
   - If the file does not exist, it will be created automatically.

3. **Error Handling**
   - If there are problems with writing, an error message is displayed.
   - Ensures that only valid responses (`y/n`) are accepted.

### Practiced Concepts
- File manipulation with `FileWriter` in append mode (`append = true`).
- Data input and validation with `Scanner`.
- Use of loops (`do-while`) to allow multiple entries.
- Exception handling (`IOException`) to deal with file writing failures.
