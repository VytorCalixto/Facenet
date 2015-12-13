# Trabalho para CI062 - TAP - 2015/2

O trabalho será dividido em duas partes:

1. Implementar um modelo de classes orientado à objetos de uma rede social simplificada.
* Implementar o comportamento que possibilita postagem de conteúdo.
* Simular o funcionamento da rede social usando um padrã de projeto.

Seguir a especificação detalhada abaixo.

1. **Rede social: modelo de classes**
    * A rede social deve possuir usuários, estes com nome, login e data de criação, sendo que usuários podem ser pessoas ou grupos.
    * As pessoas podem ter diferentes tipos de relações: "parente", "amigo", "conhecido", "em relacionamento", "observador", sendo que as relações devem ter uma data de início, fim, e uma afinidade variando de 0 a 5. As pessoas também podem "pertencer" aos grupos.
2. **Rede social: comportamento**
    * A linha do tempo pode receber diferentes tipos de publicações: comentários, pensamentos, likes e dislikes. Os usuários são responsáveis por publicar apenas em sua própria linha do tempo. No momento em que uma relação é criada entre 2 usuários, u1 e u2, tudo o que u1 postar aparecerá na linha do tempo de u2.
    * O comportamento das publicações na linha do tempo deve ser implementado usando o padrão de projeto **Observer**. A escolha dos observadores e eventos faz parte da avaliação do trabalho.
3. **Simulação**
    * USO DO PROGRAMA: Criar uma classe Programa que:
        * Crie 3 pessoas(p1, p2 e p3) e 2 grupos (g1 e g2);
        * Criar as relações abaixo, com um valor de afinidade:
            * p1: amiga de p2 e p3, "em relacionamento" com p3, pertence a g1
            * p2: amiga de p3, pertence a g1 e g2
            * p3: parente de p1, conhecido de p2
        * Simular as seguintes publicações:
            * p1 publica um pensamento
            * p2 comenta o pensamento
            * p2 "likes" o pensamento
            * p2 publica um pensamento
            * g1 publica um pensamento
            * p2 "dislike" o pensamento
            * p2 sai de g1

**Nota**: Não é necessário criar entrada de dados, isto é, os valores podem ser atribuídos diretamento no *main()*;

**ENTREGA**

Todas as classes (fontes e compilados) devem estar em uma mesma pasta e compactadas em um arquivo trabalho062.jar. O comando para criar um jar é *jar cvf trabalho062.jar ./\**. Trablahos sem os fontes não serão considerados.

**DATA DE ENTREGA**: 17/12/2015. Cada dia será descontado 10 pontos da nota.

**MODO DE ENTREGA**: enviar o arquivo trabalh062.jar por email para marcos.ddf@inf.ufpr.br (até as 24h da data final).

No corpo do email, colocar o nome dos integrantes da equipe (no mínimo 2 e no máximo 3 integrantes - trabalhos individuais não serão aceitos). No assunto, preencher com "Entrega trabalho 062".
