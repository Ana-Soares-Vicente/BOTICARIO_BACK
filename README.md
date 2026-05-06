# 🌸 Sistema de Gestão para Revendedora(o)

Sistema web desenvolvido para gerenciamento de vendas, clientes, pedidos e controle financeiro de revendas como:

- O Boticário
- Eudora
- Natura
- Avon
- entre outras.

---

# 📌 Objetivo

O objetivo do sistema é facilitar o gerenciamento de:

- produtos
- clientes
- pedidos
- pagamentos
- estoque
- lucro
- vendas

permitindo maior organização e controle da revenda.

---

# 👑 Área Administrativa

A área administrativa permitirá ao revendedor:

- cadastrar produtos
- controlar estoque
- cadastrar clientes
- criar pedidos
- acompanhar pagamentos
- visualizar lucros
- acompanhar vendas
- visualizar relatórios financeiros

---

# 👤 Área do Cliente

A área do cliente permitirá:

- visualizar catálogo
- acompanhar pedidos
- visualizar histórico de compras
- realizar pedidos
- acompanhar status de pagamento

---

# 📚 Requisitos Funcionais

## RF01 — Cadastro de Produtos

O sistema deve permitir cadastrar produtos contendo:

- nome
- código
- valor de compra
- valor de revenda
- imagem
- quantidade em estoque

---

## RF02 — Edição de Produtos

O sistema deve permitir editar:

- nome
- preço
- estoque
- imagem

---

## RF03 — Exclusão de Produtos

O sistema deve permitir excluir produtos cadastrados.

---

## RF04 — Cadastro de Clientes

O sistema deve permitir cadastrar clientes contendo:

- nome
- telefone
- endereço
- observações

---

## RF05 — Criação de Pedidos

O sistema deve permitir criar pedidos contendo:

- cliente
- produtos
- quantidade
- forma de pagamento
- observações

---

## RF06 — Controle de Pagamentos

O sistema deve permitir:

- marcar pedidos como pagos
- marcar pedidos pendentes
- controlar parcelas

---

## RF07 — Histórico de Pedidos

O sistema deve permitir visualizar:

- pedidos realizados
- cliente
- data
- valor total
- status

---

## RF08 — Controle de Estoque

O sistema deve:

- reduzir estoque automaticamente após venda
- alertar produtos com estoque baixo

---

## RF09 — Dashboard Financeiro

O sistema deve apresentar:

- lucro total
- vendas do mês
- pedidos pendentes
- produtos mais vendidos

---

## RF10 — Cálculo Automático de Lucro

O sistema deve calcular automaticamente:

```txt
lucro = valor_revenda - valor_compra
```

---

## RF11 — Login do Cliente

O cliente poderá acessar sua conta através de login.

---

## RF12 — Catálogo de Produtos

O cliente poderá visualizar:

- produtos
- imagens
- preços
- descrições

---

## RF13 — Realização de Pedidos

O cliente poderá realizar pedidos pelo sistema.

---

## RF14 — Acompanhamento de Pedidos

O cliente poderá visualizar o status do pedido:

- aguardando pagamento
- pago
- enviado
- entregue

---

## RF15 — Histórico de Compras

O cliente poderá visualizar compras realizadas anteriormente.

---

# 🧩 Modelagem Recomendada

Estrutura ideal do sistema:

```txt
Pedido
 └── ItemPedido
         └── Produto
```

Isso permite:

- múltiplos produtos por pedido
- controle de quantidade
- cálculo correto de lucro
- estrutura profissional

---

# 🛠️ Tecnologias Utilizadas

- Java 11
- Spring Boot 2.7
- Spring Web
- Spring Data JPA
- H2 Database
- Swagger/OpenAPI
- Lombok
- Maven

---

# 🚀 Funcionalidades Futuras

- autenticação JWT
- upload de imagens
- dashboard com gráficos
- integração WhatsApp
- geração de PDF
- exportação Excel
- deploy em nuvem
- banco MySQL/PostgreSQL

---

# 📦 Estrutura Inicial do Backend

```txt
controller/
dto/
entities/
repository/
service/
```

---

# 📊 Funcionalidades Planejadas

## Produtos

- cadastro
- edição
- exclusão
- pesquisa

---

## Pedidos

- criação
- histórico
- status
- pagamento

---

## Clientes

- cadastro
- histórico
- pedidos
- telefone

---

## Financeiro

- lucro
- vendas
- parcelas
- relatórios

---

# 🔐 Futuras Melhorias

- sistema de login
- permissões
- área administrativa
- área do cliente
- autenticação JWT
- upload de imagens
- responsividade
- deploy online

---

# 💡 Objetivo Acadêmico

Projeto desenvolvido com objetivo de estudo e prática de:

- API REST
- Spring Boot
- JPA/Hibernate
- arquitetura em camadas
- integração backend/frontend
- modelagem de banco de dados
- boas práticas de desenvolvimento