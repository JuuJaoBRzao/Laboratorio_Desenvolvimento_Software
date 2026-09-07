## 2. Revisão de Programação Orientada a Objetos (POO)

A Orientação a Objetos é um paradigma de programação estruturado em conceitos-chave:
*   **Classe:** Uma estrutura que abstrai um conjunto de objetos com características similares, definindo suas variáveis (atributos) e funções (métodos) [4].
*   **Objeto:** A instância concreta de uma classe (ex: se a classe for *Carro*, um objeto pode ser o *Gol*) [5, 6]. Um objeto possui um estado (seus atributos) e comportamentos (seus métodos) [5].
*   **Encapsulamento:** Empacotamento de atributos e métodos dentro de uma classe para proteção dos dados [6, 7]. O nível de acesso é controlado pelos modificadores de acesso do Java [7]:
    *   `public`: Qualquer classe pode acessar o membro [7].
    *   `private`: Apenas a própria classe pode acessar o membro [7].
    *   `protected`: Subclasses e classes do mesmo pacote podem acessar o membro [7].
    *   `default` (padrão, sem palavra-chave): Apenas classes do mesmo pacote podem acessar o membro [7].
*   **Getters e Setters:** Métodos públicos utilizados para acessar e modificar atributos privados de forma controlada [8]. Seguem o padrão `getNome()` para ler e `setNome(String nome)` para escrever [9].
*   **Herança:** Reutilização de software e facilitação de manutenção (alterações em cascata) através da palavra-chave `extends` [10]. Como o Java não suporta herança múltipla de classes diretamente, utiliza-se a herança em cascata (uma classe estende outra, que estende outra) [10].
    *   **Uso de `super`:** O comando `super` serve para chamar o construtor da superclasse herdada [11]. Se for explicitado no construtor da classe filha, deve ser obrigatoriamente a primeira instrução [11].
*   **Polimorfismo:** Capacidade de métodos assumirem "muitas formas" [12]. Existem dois tipos principais [12]:
    *   **Sobrescrita de métodos (*Override*):** Implementação de um método herdado de uma classe base em uma classe derivada, mantendo a mesma assinatura (nome, parâmetros e retorno), mas alterando a implementação interna [12, 13].
    *   **Sobrecarga de métodos (*Overload*):** Fornecimento de várias implementações de métodos com o mesmo nome na mesma classe, porém com assinaturas (parâmetros e/ou tipos de retorno) diferentes [12, 14].

### Modelagem com UML
A Linguagem de Modelagem Unificada (UML) é o padrão industrial para modelagem visual de sistemas [15]. No diagrama de classes, cada classe é dividida em três partes [16]:
1.  **Nome da classe** [16].
2.  **Atributos:** Declarados como `<acesso> <nome> : <tipo>` [17].
3.  **Métodos:** Declarados como `<acesso> <nome> (<parâmetros>) : <tipo>` [17].

Os modificadores de acesso são indicados por símbolos gráficos [17]:
*   `+` : público (`public`) [17]
*   `-` : privado (`private`) [17]
*   `#` : protegido (`protected`) [17]
*   `~` : default/package [17]

---

## 3. Classes Abstratas e Interfaces

O Java oferece duas estruturas fundamentais para criar abstrações e estabelecer contratos de desenvolvimento:

### Classe Abstrata
*   Declarada usando a palavra-chave `abstract` antes de `class` [18].
*   Não pode ser instanciada diretamente [18].
*   Projetada para ser estendida por subclasses concretas [18].
*   Pode conter métodos abstratos (apenas a assinatura, sem corpo) que as subclasses devem obrigatoriamente implementar [18, 19].
*   Pode conter construtores [20].
*   Pode conter atributos com diferentes níveis de visibilidade (`public`, `protected`, `private`) [20].
*   Utilizada quando se deseja criar uma classe base com algumas implementações de comportamento padrão que serão compartilhadas e herdadas pelas subclasses [19, 21].

### Interface
*   Declarada usando a palavra-chave `interface` [22].
*   Não pode ser instanciada diretamente. Funciona como um contrato lógico de métodos que uma classe deve implementar utilizando a palavra-chave `implements` [22, 23].
*   Por padrão, todos os métodos de uma interface são implicitamente `public` e `abstract` (métodos abstratos e públicos) [23].
*   Não pode conter construtores [20].
*   Não pode ter atributos normais. Todos os atributos declarados em uma interface são implicitamente `public`, `static` e `final` (constantes) [20].
*   Uma única classe pode implementar múltiplas interfaces simultaneamente (mitigando a restrição de herança múltipla do Java) [20, 24].
*   **Vantagens:** Favorece o polimorfismo entre classes distintas, estimula a modularização lógica e garante independência de implementação [25].

### Resumo das Diferenças (Classe Abstrata vs. Interface) [20]

| Critério | Classe Abstrata | Interface |
| :--- | :--- | :--- |
| **Instanciação** | Não permitida [18]. | Não permitida [22]. |
| **Atributos** | Visibilidade variável (`public`, `private`, `protected`) [20]. | Sempre `public static final` (constantes) [20]. |
| **Construtores** | Sim, possui construtores [20]. | Não possui construtores [20]. |
| **Métodos** | Pode conter métodos concretos (com implementação) e abstratos [20]. | Tradicionalmente contém apenas métodos abstratos (públicos por padrão) [20, 23]. |
| **Herança/Implementação** | Uma classe só pode herdar de uma superclasse (herança única) [20]. | Uma classe pode implementar várias interfaces (`implements`) [20]. |

---

## 4. Interface Gráfica com Java Swing

O **Java Swing** é uma biblioteca da JFC (*Java Foundation Classes*) voltada à criação de interfaces gráficas (GUIs) para sistemas desktop [26].

### Vantagens e Desvantagens do Swing

*   **Vantagens:** Independência de plataforma (funciona de forma multiplataforma sem reescrever código) [27], componentes altamente personalizáveis [27], rica variedade de componentes visuais [27], interface responsiva e rápida [27] e suporte a diferentes "Look and Feels" [27].
*   **Desvantagens:** Aparência não nativa em todos os sistemas operacionais (pode parecer deslocado na interface padrão do usuário) [28], consumo de hardware mais pesado em interfaces complexas em relação a soluções nativas [28] e ausência de conceitos/recursos de design modernos [28].

### Ambientes de Desenvolvimento
*   **Eclipse:** Necessita da instalação do plugin *WindowBuilder* através do Eclipse Marketplace para construir as telas arrastando componentes [29, 30].
*   **NetBeans:** O Swing já vem nativamente instalado por padrão, oferecendo maior facilidade de organização visual e código-fonte [30].

### Componentes Gráficos Comuns e Convenções de Nomenclatura
Para manter o código compreensível e legível, adota-se um prefixo correspondente ao tipo do componente seguido de sua finalidade [31, 32]:

1.  `JPanel` (prefixo **`pnl`**): Contêiner flexível para agrupar e organizar logicamente outros componentes em uma área comum [31, 33].
2.  `JButton` (prefixo **`btn`**): Botão que dispara uma ação ao ser clicado [31, 33]. Essa ação é executada no método `actionPerformed` gerado pelo evento de clique [34].
3.  `JLabel` (prefixo **`lbl`**): Exibe textos explicativos estáticos ou imagens na tela [31, 33].
4.  `JTextField` (prefixo **`txt`**): Caixa de texto de linha única para inserção de dados pelo usuário [31, 33].
5.  `JTextArea` (prefixo **`txa`**): Área de texto multilinha que permite visualização e edição de grandes blocos de texto [35]. Utiliza o método `append(String)` para adicionar novos textos sem apagar o conteúdo anterior [35, 36].
6.  `JCheckBox` (prefixo **`chk`**): Caixa de seleção para marcar ou desmarcar opções independentes (o usuário pode escolher múltiplas opções simultaneamente) [31, 35, 37].
7.  `JRadioButton` (prefixo **`rad`**): Botões de opção mutuamente exclusivos (apenas um pode ser selecionado por vez) [31, 35, 36]. Para impedir seleções simultâneas, os botões de opção devem ser inseridos dentro de um objeto invisível chamado `ButtonGroup` [38].
8.  `JComboBox` (prefixo **`cmb`**): Caixa de combinação contendo uma lista suspensa de opções selecionáveis [31, 37].
9.  `JTable` (prefixo **`tbl`**): Componente para exibição e edição de dados tabulares (organizados em formato de colunas e linhas, similar a uma planilha) [31, 35, 39].

### Gerenciadores de Layout Comuns
Os gerenciadores controlam o posicionamento e redimensionamento automático dos elementos visuais dentro da tela [34]:
*   **FlowLayout:** Posiciona os componentes de forma linear em uma única linha; caso não caibam, são deslocados para a linha seguinte [34].
*   **BorderLayout:** Divide o espaço visível em cinco áreas geográficas exclusivas: *North* (norte), *South* (sul), *East* (leste), *West* (oeste) e *Center* (centro) [40].
*   **GridLayout:** Organiza os elementos de maneira uniforme em uma grade retangular de células de tamanhos iguais [40].
*   **BoxLayout:** Alinha componentes verticalmente ou horizontalmente de forma linear [41].
*   **GridBagLayout:** Oferece excelente flexibilidade, permitindo total controle de posicionamento e redimensionamento, embora seja mais complexo [41].
*   **CardLayout:** Permite empilhar múltiplos painéis, alternando a visibilidade para exibir apenas um cartão por vez [42].
*   **Absolute Layout:** Desativa qualquer gerenciador automático. Permite posicionar componentes livremente por coordenadas X e Y fixas [42].

---

## 5. Manipulação de Tabelas (JTable) e Persistência em Arquivo Texto

Sistemas de cadastro completos requerem o gerenciamento de coleções na memória do programa, exibição estruturada em telas e gravação em disco para persistência:

### Gerenciamento de Tabelas (`JTable`)
Para gerenciar linhas de dados de forma dinâmica em uma tabela, utiliza-se o modelo padrão `DefaultTableModel` [39, 43]:
1.  **Obter o modelo:** Obtém-se o modelo da tabela utilizando o método `getModel()` [39, 43]:
    ```java
    DefaultTableModel tabela = (DefaultTableModel) tbl_Pessoas.getModel();
    ```
2.  **Adicionar linha:** Insere-se um vetor de objetos correspondente às colunas usando `addRow()` [43]:
    ```java
    tabela.addRow(new Object[] { nome, sexo, idioma });
    ```
3.  **Remover linha:** Exclui-se a linha na posição especificada usando `removeRow(index)` [43].
4.  **Limpar dados da tabela:** Redefine-se o número de linhas para zero usando `setRowCount(0)` [43].

### Fluxo de Cadastro e Persistência em Arquivo Texto
Em uma aplicação com persistência local [44]:
1.  **Sincronização com Listas:** Os dados digitados na tela são recuperados, instanciam um objeto de negócio (ex: classe `Pessoa`) e este objeto é inserido em uma lista em memória (`List<Pessoa>`) [44].
2.  **Gravação em Arquivo:** O programa percorre a lista de objetos e salva cada linha em um arquivo texto (ex: `pessoas.txt`), comumente separando os dados por um caractere delimitador como ponto e vírgula (`;`) [44]. Classes auxiliares como `FileWriter` e `BufferedWriter` são empregadas para realizar a gravação física.
3.  **Leitura do Arquivo no Inicializador:** Ao carregar a interface gráfica, o programa executa a leitura do arquivo texto utilizando classes como `FileReader` e `BufferedReader`. O método `readLine()` lê linha por linha e o método `split(";")` divide a String em partes [44]. Com essas partes, os objetos são reconstruídos na lista de memória e, em seguida, mapeados para carregar as linhas correspondentes no `DefaultTableModel` do `JTable` [44].

