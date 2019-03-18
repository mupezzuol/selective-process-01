# Segue abaixo as respostas


###### 1. 
**Segue a resposta no código do repositório. Foi utilizado Java, Scanner, Streams, Lambda, Listas etc.**

###### 2.
```java
@Entity
@Table(name = "tbl_pessoa")
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="Pessoa_id")
    private Long id;
    
    @Column(name="Nome")
    private String nome;
}

```

###### 3.
* __Spring:__ É um framework Java criado para facilitar o desenvolvedor no seu dia a dia.
* __Spring MVC:__ Spring MVC é um framework que facilita o desenvolvimento de aplicações web, com ele nós conseguimos construir aplicações web robustas e flexíveis de forma mais simples.
* __Reflection:__ É uma forma de usar métodos e atributos que você ainda não conhece, e são atribuidos em tempo de execução.

**Observação:** O Reflection eu nunca utilizei em minhas experiências.

###### 4.
```sql
-- Banco MySQL 8.0.13 via terminal (não estava especificando o banco, foi criado de acordo com o word)
-- Criação da tabela
CREATE TABLE desc_funcionarios (
    cod_funcionario DECIMAL NOT NULL,
    nome_funcionario VARCHAR(250),
    data_admissao DATE,
    salario DECIMAL(32,2)
);

-- Valores para teste
INSERT INTO desc_funcionarios (cod_funcionario, nome_funcionario, data_admissao, salario) VALUES (1, "Murillo Pezzuol", '2018-10-01', 4525.50);
INSERT INTO desc_funcionarios (cod_funcionario, nome_funcionario, data_admissao, salario) VALUES (2, "Carlos Alberto", '2000-11-07', 4000.70);
INSERT INTO desc_funcionarios (cod_funcionario, nome_funcionario, data_admissao, salario) VALUES (3, "Silvia Rodrigues", '1990-06-12', 2500.00);
INSERT INTO desc_funcionarios (cod_funcionario, nome_funcionario, data_admissao, salario) VALUES (4, "Gabriella Monteiro", '1998-03-25', 3225.00);
INSERT INTO desc_funcionarios (cod_funcionario, nome_funcionario, data_admissao, salario) VALUES (5, "Manuela Zambelli", '2009-04-18', 7225.00);
INSERT INTO desc_funcionarios (cod_funcionario, nome_funcionario, data_admissao, salario) VALUES (6, "Raul Pezzuol", '2010-11-27', 1400.25);
INSERT INTO desc_funcionarios (cod_funcionario, nome_funcionario, data_admissao, salario) VALUES (7, "Jorge Kamezawa", '2008-01-09', 2780.65);
INSERT INTO desc_funcionarios (cod_funcionario, nome_funcionario, data_admissao, salario) VALUES (8, "Kauê Costa", '2019-09-21', 3400.75);
INSERT INTO desc_funcionarios (cod_funcionario, nome_funcionario, data_admissao, salario) VALUES (9, "Babuxo Silva", '2014-07-02', 2100.80);
INSERT INTO desc_funcionarios (cod_funcionario, nome_funcionario, data_admissao, salario) VALUES (10, "Carolina Marta", '1985-10-28', 2980.90);

-- Querys utilizadas para auxilio
SELECT * FROM desc_funcionarios;
SELECT CURDATE() as DATA_ATUAL, DATE_SUB(CURDATE(), INTERVAL 10 YEAR) AS DATA_SUBTRAIDA;

-- Query para listar as pessoas que deveram receber o aumento
SELECT * FROM desc_funcionarios WHERE data_admissao <= DATE_SUB(CURDATE(), INTERVAL 10 YEAR);

-- Query Final - Alteração
UPDATE desc_funcionarios SET salario=salario * 1.20 WHERE data_admissao <= DATE_SUB(CURDATE(), INTERVAL 10 YEAR);
```

###### 5.
* __SOLID__, cada letra representa um dos 5 princípios de orientação a objetos que nos ajudam a manter o código organizado:
    - Single Responsibility Principle -> Princípio da Responsabilidade Única;
    - Open Closed Principle -> Princípio do Aberto Fechado;
    - Liskov Substitution Principle -> Príncipio da Substituição de Liskov;
    - Interface Segregation Principle -> Princípio da Segregação de Interfaces;
    - Dependency Inversion Principle -> Princípio da Inversão de Dependências;
* Design Patterns (factory, adapter etc.);
* Comentários Úteis utilizando também o Javadoc;
* Utilizar bem os pilares da programação orientada a objetos, como Abstração, Encapsulamento, Herança e Polimorfismo;
* Temos também a endentação (Organizando o código), criação de pacotes (package) de forma correta, convenções de nomes para classes, métodos, variáveis e tratamento de erros (try/catch).

###### 6.
**Podemos utilizar um 'Balanceamento de Carga' para alta disponibilidade, pois clusters de balanceamento de carga, as tarefas de processamento são distribuídas o mais uniformemente possível entre os nós.**
**Para a base de dados seria utilizado Apache Hadoop com o HDFS que já tem tolerância a falha (se um nó do cluster cair um outro nó assumiria), podendo também adicionar novas máquinas (máquinas baratas) para caso tenha aumento de demanda.**



