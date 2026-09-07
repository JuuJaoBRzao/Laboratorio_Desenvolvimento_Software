1. Estrutura da Disciplina e Avaliação
A disciplina está dividida em quatro unidades principais:

    Unidade 1: Planejamento de projeto de software, ambientes de desenvolvimento, codificação em camadas e arquitetura.
    Unidade 2: Interface gráfica com Java Swing, seus principais componentes e estudos de caso.
    Unidade 3: Integração e comunicação com bancos de dados.
    Unidade 4: Gerenciamento de dependências, repositórios, implementação e distribuição de software.

Para aprovação, exige-se frequência mínima de 75% nas aulas. A Nota Final (NF) é calculada pela média aritmética de três notas (N1, N2 e N3), cada uma composta por exercícios práticos em sala de aula (peso 3,0) e um Produto de Aprendizagem (peso 7,0).
2. Revisão de Programação Orientada a Objetos (POO)
A programação orientada a objetos baseia-se em abstrair conceitos do mundo real por meio de estruturas de código:

    Classe: Uma estrutura que abstrai um conjunto de objetos com características similares, definindo seus atributos (variáveis/estado) e métodos (funções/comportamento).
    Objeto: A instância concreta de uma classe (por exemplo, o objeto Gol instanciado a partir da classe Carro).
    Encapsulamento: Proteção e ocultamento dos dados de uma classe. É implementado usando modificadores de acesso:
        public: Acesso livre a qualquer classe.
        private: Acesso restrito apenas à própria classe.
        protected: Acesso permitido à própria classe, suas subclasses e classes do mesmo pacote.
        Default (sem palavra-chave): Acesso apenas a classes do mesmo pacote.
    Getters e Setters: Métodos públicos utilizados para obter (get) e modificar (set) atributos privados de forma controlada. Seguem uma nomenclatura padronizada com a primeira letra do atributo em maiúscula (ex: getNome() e setNome()).
    UML (Linguagem de Modelagem Unificada): Padrão industrial para modelagem visual de sistemas. No diagrama de classes, a estrutura é dividida em Nome da Classe, Atributos e Métodos, indicando visibilidade por símbolos: + para público, - para privado, # para protegido e ~ para default.
    Herança: Reutilização e facilitação de manutenção por meio da palavra-chave extends. Como o Java não permite herança múltipla direta, utiliza-se a herança em cascata (uma subclasse herda de outra que, por sua vez, herda de uma classe base). O comando super serve para invocar o construtor da superclasse e deve ser a primeira instrução no construtor da classe filha.
    Polimorfismo: Capacidade de métodos assumirem "muitas formas". Divide-se em:
        Sobrescrita (Override): Implementação de um método herdado da classe base na classe derivada, mantendo exatamente a mesma assinatura (nome, parâmetros e retorno), mas alterando seu comportamento interno.
        Sobrecarga (Overload): Criação de métodos com o mesmo nome dentro de uma classe, porém com assinaturas (parâmetros e/ou tipos de retorno) diferentes.

3. Classes Abstratas vs. Interfaces
O Java disponibiliza recursos específicos para a criação de contratos de desenvolvimento e polimorfismo:
Característica
	
Classe Abstrata
	
Interface
Instanciação
	
Não pode ser instanciada diretamente.
	
Não pode ser instanciada diretamente.
Palavra-chave
	
Declarada com abstract class.
	
Declarada com interface.
Métodos
	
Pode conter métodos abstratos (sem corpo) e métodos concretos (com implementação).
	
Tradicionalmente só contém assinaturas de métodos abstratos. Os métodos são implicitamente public e abstract.
Atributos
	
Pode possuir variáveis com qualquer nível de visibilidade e modificadores.
	
Atributos são implicitamente public, static e final (constantes).
Construtores
	
Pode conter construtores.
	
Não pode conter construtores.
Herança/Implementação
	
Uma classe só pode herdar de uma classe abstrata (herança única).
	
Uma classe pode implementar múltiplas interfaces usando implements.
Vantagens do uso de interfaces: Permitem o polimorfismo entre objetos de classes completamente distintas, favorecem a modularização do código de forma lógica e promovem a independência de implementação.
4. Interface Gráfica com Java Swing
O Java Swing é uma biblioteca da JFC (Java Foundation Classes) para criação de interfaces gráficas para aplicativos desktop.

    Vantagens: Independência de plataforma (multiplataforma), componentes altamente personalizáveis e ricos, look-and-feel consistente com o SO e boa velocidade de execução.
    Desvantagens: Aparência não nativa em todas as plataformas (o que pode parecer deslocado no sistema operacional do usuário), maior consumo de recursos de hardware em relação a tecnologias nativas e ausência de recursos de design modernos.
    Desenvolvimento: Pode ser estruturado no Eclipse (com a instalação do plugin WindowBuilder) ou no NetBeans (onde o Swing já vem embutido).

Principais Componentes e Convenção de Nomenclatura:
Adota-se uma convenção de prefixos nos nomes das variáveis para facilitar a identificação dos componentes no código gráfico:

    JPanel (prefixo pnl): Contêiner para organizar e agrupar componentes.
    JButton (prefixo btn): Botão clicável que dispara uma ação gerenciada no método actionPerformed.
    JLabel (prefixo lbl): Exibe textos informativos estáticos ou imagens.
    JTextField (prefixo txt): Campo para inserção de texto em linha única.
    JTextArea (prefixo txa): Área multilinha para visualização ou edição de blocos de texto. Permite o uso do método append() para acrescentar conteúdo sem sobrescrever o existente.
    JCheckBox (prefixo chk): Caixa de seleção para escolhas independentes (múltiplas opções podem ser marcadas simultaneamente).
    JRadioButton (prefixo rad ou rdo): Botão de opção para escolhas mutuamente exclusivas. Para que funcionem corretamente bloqueando seleções simultâneas, devem ser agrupados logicamente em um ButtonGroup invisível.
    JComboBox (prefixo cmb): Caixa de combinação com lista suspensa.
    JTable (prefixo tbl): Componente para exibição e edição de dados tabulares organizados em colunas e linhas.

Gerenciadores de Layout Comuns:
Os gerenciadores controlam a posição e comportamento responsivo dos componentes dentro da tela:

    FlowLayout: Posiciona elementos em linha única, passando para a próxima linha apenas se faltar espaço.
    BorderLayout: Divide o espaço em cinco regiões geográficas: North, South, East, West e Center.
    GridLayout: Organiza os elementos em células uniformes dentro de uma grade retangular.
    BoxLayout: Organiza elementos de forma linear, seja horizontalmente ou verticalmente.
    GridBagLayout: O mais flexível e complexo, permitindo controle preciso de redimensionamento e alinhamento.
    CardLayout: Alterna a visualização entre diferentes painéis de maneira sobreposta.
    Absolute Layout: Desativa o posicionamento automático, permitindo arrastar os componentes livremente para coordenadas X e Y fixas na tela.

5. Manipulação de Tabelas e Persistência em Arquivos
A criação de telas completas com recursos de CRUD (Cadastro, Leitura, Atualização e Exclusão) envolve o gerenciamento de coleções na memória, exibição em tabelas e salvamento em arquivos físicos:

    Manipulação de JTable: Utiliza-se a classe DefaultTableModel obtida a partir do método getModel() da tabela. Para gerenciar os dados dinamicamente, utilizam-se os métodos addRow() (para adicionar um vetor de objetos), removeRow(linha) (para excluir a linha selecionada) e setRowCount(0) (para limpar visualmente as linhas da tabela antes de recarregá-la).
    Sincronização com Listas: Os dados inseridos no formulário instanciam um objeto da classe de negócio (ex: Pessoa), que é armazenado em um List na memória e, em seguida, mapeado para a tabela.
    Persistência em Arquivo de Texto:
        Escrita (Gravação): Para salvar as informações, percorre-se a lista de objetos e escreve-se os atributos em um arquivo .txt utilizando classes como FileWriter e BufferedWriter. Os campos são comumente delimitados por caracteres específicos, como ponto e vírgula (;).
        Leitura (Carregamento): Ao iniciar o sistema, lê-se o arquivo texto usando FileReader e BufferedReader linha por linha através de readLine(). Cada linha é dividida novamente usando o método split(";") para restaurar os dados, reconstruir as instâncias dos objetos de negócio na memória e atualizar a exibição do JTable.
