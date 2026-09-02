# java-learning

Personal log of my first steps in Java — My study is following [this Java playlist](https://www.youtube.com/watch?v=NxuGmdGBDdk&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW).

This isn't a single project — it's a growing collection of tests and mini-programs. New exercises get added as I keep learning, following the same structure below.

## Structure

```
src/
├── p01_oop/
│   ├── Main.java          # entry point, run this to try the exercise
│   └── domain/             # supporting classes for this exercise
├── p02_inheritance/
│   ├── Main.java
│   └── domain/
└── ...                     # pXX_topic, one package per concept studied
misc/                        # extra files an exercise needs or generate at runtime
└── p07_serialization/       
    └── fplan.ser             # (e.g. a serialized object written/read by that exercise)
```

Every exercise lives in its own `pXX_topic` package under `src/`, numbered in the order I studied it, with a `Main.java` you can run directly. When an exercise needs to read or write a file (like the serialization example), that file goes in `misc/pXX_topic/` instead of mixing runtime output into the source tree.

## Environment

- Language level: **Java 8**
- JDK installed locally: 16
- IntelliJ IDEA project
