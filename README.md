# 📺 Catálogo Netflix - Java

Sistema de catálogo de séries desenvolvido em Java para praticar HashMap e arquitetura em camadas.

## 📚 Conceitos aplicados

- **HashMap** → armazena séries e notas em par chave/valor
- **Arquitetura em camadas** → model, service e Main separados
- **D (Dependency Inversion)** → CatalogoService depende de Catalogo pelo construtor

## 🗂️ Estrutura do projeto

    src/
    └── br/
        └── com/
            └── netflix/
                ├── model/
                │   └── Catalogo.java
                ├── service/
                │   └── CatalogoService.java
                └── Main.java

## ⚙️ Funcionalidades

- Adicionar séries com nota
- Listar todas as séries do catálogo
- Buscar série por parte do nome
- Verificar se uma série existe no catálogo
- Exibir total de séries cadastradas

## 🚀 Como rodar

1. Clone o repositório
2. Abra no IntelliJ IDEA
3. Rode a classe `Main.java`

## 🛠️ Tecnologias

- Java 21
- IntelliJ IDEA
