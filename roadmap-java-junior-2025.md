# Roadmap Back end junior
##

```markdown
# 🚀 Roadmap Backend Java Júnior 2025 - Completo

**Guia definitivo para sair da teoria e conseguir seu primeiro emprego como Backend Java Júnior**

*Última atualização: Dezembro 2025 | Tempo estimado: 4-6 meses | Nível: Iniciante → Júnior*

---

## 📋 Sumário Executivo

Para ser contratado como **Backend Java Júnior**, você precisa dominar:
1. **Java Core** (alicerce técnico)
2. **Spring Boot** (padrão de mercado)
3. **Banco de dados** (persistência)
4. **Testes** (garantia de qualidade)
5. **DevOps básico** (Docker + documentação)
6. **1 projeto portfólio** (prova prática)

---

## 🎯 Competências Essenciais (Checklist Final)

### ☕ **Java Core (2-3 semanas)**
- [ ] Sintaxe básica + Primitivos/Wrappers
- [ ] Collections (ArrayList, HashMap, HashSet)
- [ ] POO completa (classes, interfaces, herança, polimorfismo)
- [ ] **Lambda + Streams** (essencial para entrevistas)
- [ ] **Optional** (evitar NullPointerException)
- [ ] Exceções (Checked vs Unchecked + custom exceptions)

### 🛠️ **Ferramentas (1 semana)**
- [ ] **Maven** (pom.xml, dependências, lifecycle)
- [ ] **Git** (branching, PR, rebase, merge)
- [ ] **VS Code** + extensões Java

### 🍃 **Spring Boot (4-6 semanas)**
- [ ] **Spring Initializr** + estrutura de projeto
- [ ] **REST APIs** (Controller, @RestController, @GetMapping)
- [ ] **Spring Data JPA** (@Entity, @Repository, CRUD)
- [ ] **Injeção de Dependência** (@Autowired, @Component)
- [ ] **Validação** (@Valid, @NotNull, @NotBlank)
- [ ] **Configuração** (application.yml, profiles)

### 🗄️ **Banco de Dados (2 semanas)**
- [ ] **PostgreSQL** (instalar + Docker)
- [ ] **SQL básico** (SELECT, JOIN, GROUP BY, subqueries)
- [ ] **Flyway** (migrations versionadas)

### 🧪 **Testes (2 semanas)**
- [ ] **JUnit 5** (unit tests)
- [ ] **Mockito** (mocking de dependências)
- [ ] **Testes de integração** (@SpringBootTest)

### 🐳 **DevOps Júnior (1-2 semanas)**
- [ ] **Docker** (Dockerfile, docker-compose.yml)
- [ ] **Swagger/OpenAPI** (documentação automática)
- [ ] **Logs estruturados** (SLF4J)

---

## 📈 Plano de Estudos 90 Dias (12 Semanas)

| Semana | Foco Principal | Meta Semanal | Horas/Dia |
|--------|----------------|-------------|-----------|
| **1-2** | Java Core | 80% proficiency | 3h |
| **3** | Maven + Git + SQL | Configurar ambiente | 2h |
| **4-6** | Spring Boot REST + JPA | Primeira API funcional | 4h |
| **7** | Validação + Configuração | API robusta | 3h |
| **8** | Testes Unitários | 70% coverage | 3h |
| **9** | Docker + Banco | Ambiente containerizado | 2h |
| **10** | Documentação + Polish | README + Swagger | 2h |
| **11-12** | **Projeto Final** + Deploy | Portfólio pronto | 4h |

---

## 🗃️ Projeto Portfólio Obrigatório

### **Sistema de Gestão de Tarefas (Task Manager API)**

**Funcionalidades mínimas:**
```
GET /tasks - Lista todas tarefas
GET /tasks/{id} - Detalhe da tarefa
POST /tasks - Criar tarefa
PUT /tasks/{id} - Atualizar tarefa
DELETE /tasks/{id} - Remover tarefa
GET /tasks/user/{userId} - Tarefas por usuário
```

**Checklist técnico completo:**
- [ ] CRUD completo com validação
- [ ] Testes unitários (80%+ coverage)
- [ ] PostgreSQL + Flyway migrations
- [ ] Docker Compose (app + banco)
- [ ] Swagger documentado
- [ ] README com badges e instruções

---

## 📚 Recursos Gratuitos Recomendados

### **Java Core**
```
🔥 Curso GRATUITO: DevDojo Java Completo
📖 Livro: Java 17 OCP Guide (capítulos iniciais)
🎮 Exercícios: HackerRank Java Track
```

### **Spring Boot**
```
🚀 Spring Boot 3 + JPA (Balta.io - GRATUITO)
📚 Spring Guides (spring.io/guides)
💻 Projeto prático: GitHub spring-petclinic
```

### **Banco + Docker**
```
🐘 PostgreSQL Tutorial (freeCodeCamp YouTube)
🐳 Docker para Devs (Curso em Vídeo)
```

### **Testes**
```
🧪 JUnit 5 User Guide (oficial)
🧪 Spring Boot Testing (spring.io)
```

---

## 🛠️ Configuração Inicial (Dia 1 - 2h)

```
# 1. Instalar Java 17/21 (SDKMAN ou Adoptium)
sdk install java 21.0.4-tem

# 2. Instalar PostgreSQL via Docker
docker run --name postgres -e POSTGRES_PASSWORD=root -p 5432:5432 -d postgres:15

# 3. Criar projeto Spring Boot
curl https://start.spring.io/starter.zip \
-d dependencies=web,data-jpa,validation,postgresql \
-d javaVersion=21 \
-d bootVersion=3.2.0 \
-o taskmanager.zip
```

---

## ✅ Critérios de Conclusão (Você é Júnior quando...)

1. **Consegue criar** uma API REST funcional em < 2h
2. **Escreve testes** que passam em CI/CD
3. **Faz deploy** com Docker em qualquer máquina
4. **Tem portfólio** com README 5 estrelas
5. **Explica** Injeção de Dependência e JPA para um colega

---

## 🎖️ Próximos Passos Pós-Roadmap

```
✅ Júnior contratado
↓
- Spring Security (JWT)
- Microsserviços básicos
- Kafka/RabbitMQ
- CI/CD (GitHub Actions)
- Cloud (AWS/Heroku)
```

---

**💡 Dica final:** Dedique **4h/dia consistente** + **1 projeto real**. Em 90 dias você estará pronto para vagas júnior com salário inicial R$3.5k-5k (SP/PR).

**Comece AGORA com Java Core!** ⏳
```

