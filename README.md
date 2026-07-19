# Workshop #2.7 — Inspeção e Revisão de Código

Atividade prática de Pull Requests, revisão de código e análise estática com Checkstyle.

Os arquivos Java em `src/main/java/com/workshop/` possuem problemas propositais de estilo e qualidade.

## Atividade

1. Faça um fork deste repositório.
2. Clone o seu fork e crie uma branch.
3. Escolha um arquivo Java para corrigir.
4. Rode o Checkstyle e use os avisos como guia.
5. Faça commit e push.
6. Abra um Pull Request.
7. Acompanhe a validação automática no GitHub Actions.
8. Revise os dois Pull Requests de exemplo disponibilizados pelos apresentadores.

## Arquivos disponíveis

- `Calculadora.java`
- `usuario.java`
- `PedidoService.java`
- `RelatorioUtil.java`

## Rodar o Checkstyle no Windows

Abra o terminal na raiz do projeto e execute:

```powershell
.\RODAR_CHECKSTYLE.bat Calculadora.java
```

Troque `Calculadora.java` pelo arquivo escolhido. Sem informar um arquivo, o script analisa todos.

Também é possível executar diretamente:

```powershell
java -jar .\checkstyle-10.21.1-all.jar -c .\checkstyle.xml .\src\main\java\com\workshop\Calculadora.java
```

Os avisos exibidos inicialmente são esperados e fazem parte da atividade.
