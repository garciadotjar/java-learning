# java-learning

Log pessoal dos meus primeiros estudos em Java - Estudando seguindo [esta playlist](https://www.youtube.com/watch?v=NxuGmdGBDdk&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW).

O repositório conta com uma coleção de testes e mini-programas. Novos exercícios serão adicionados conforme estudo o básico da linguagem, seguindo a estrutura abaixo.

## Estrutura

```
src/
├── p01_oop/
│   ├── Main.java          # ponto de entrada, execute para rodar o exercício
│   └── domain/             # classes adicionais para o exercício
├── p02_inheritance/
│   ├── Main.java
│   └── domain/
└── ...                     # pXX_topico, um pacote para cada conceito estudado
misc/                        # pasta para exercícios que precisam gerar ou ler arquivos extras
└── p07_serialization/       
    └── fplan.ser             # (ex: um objeto serializado usado no exercício 7)
```

Cada exercício está no seu pacote `pXX_topico` dentro de `src/`, numerado na ordem de estudo, onde  `Main.java` pode ser executado diretamente. Quando um exercício precisa ler ou escrever um arquivo (como no exemplo de serialização), esse arquivo vai em `misc/pXX_topic/`.

## Requisitos:

- **Java 8 ou superior**
