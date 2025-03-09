# Registro de Logs com Timestamps - Java / Log Recording with Timestamps - Java

[Português](#português) | [English](#english)

---

<a id="português"></a>
## Português

### Descrição
Este programa permite registrar logs em um arquivo `log.txt`, adicionando uma nova linha a cada execução com a data e hora do evento.

### Funcionalidades
1. **Entrada do Usuário**
   - O usuário pode digitar mensagens que serão salvas no arquivo de log.
   - O programa permite adicionar várias mensagens antes de encerrar.

2. **Registro de Logs**
   - Cada linha do `log.txt` contém um timestamp e a mensagem fornecida pelo usuário.
   - O formato do log é:
     ```
     [YYYY/MM/DD HH:MM:SS]: Mensagem do usuário
     ```
   - Os logs são **acrescentados** ao arquivo em vez de sobrescrevê-lo.

3. **Tratamento de Erros**
   - Se houver falha ao gravar no arquivo, o programa exibe uma mensagem de erro apropriada.

### Conceitos Praticados
- Manipulação de arquivos com `FileWriter` no modo `append = true`.
- Uso de `LocalDateTime` e `DateTimeFormatter` para geração de timestamps.
- Entrada de dados do usuário com `Scanner`.
- Estrutura `try-with-resources` para garantir fechamento correto do arquivo.
- Tratamento de exceções com `IOException`.

---

<a id="english"></a>
## English

### Description
This program allows recording logs in a `log.txt` file, adding a new line with each execution including the date and time of the event.

### Features
1. **User Input**
   - The user can type messages that will be saved in the log file.
   - The program allows adding multiple messages before ending.

2. **Log Recording**
   - Each line of `log.txt` contains a timestamp and the message provided by the user.
   - The log format is:
     ```
     [YYYY/MM/DD HH:MM:SS]: User message
     ```
   - Logs are **appended** to the file rather than overwriting it.

3. **Error Handling**
   - If there is a failure when writing to the file, the program displays an appropriate error message.

### Practiced Concepts
- File manipulation with `FileWriter` in `append = true` mode.
- Use of `LocalDateTime` and `DateTimeFormatter` for timestamp generation.
- User data input with `Scanner`.
- `try-with-resources` structure to ensure proper file closure.
- Exception handling with `IOException`.
