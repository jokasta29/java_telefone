# Telephone Music Player Project 📱

## Overview

This Java ☕ project implements a phone with music playing capabilities, utilizing a hierarchical class structure. Rather than every class extending a single main class, the classes are organized in a hierarchy, with each class extending another to promote code reuse and maintainability.

## Getting Started

To run the project, follow these steps:

1. Ensure you have Java installed on your system.
2. Download the project files.
3. Compile and run the `TelefoneFuncionando` class.


## Class Hierarchy
1. TelefoneFuncionando
Main class demonstrating the phone's functionality.
Extends: ReprodutorMusical
2. ReprodutorMusical
Provides music-related functionality.
Extends: AparelhoTelefonico
3. NavegadorDeInternet
Manages internet browsing features.
Extends: None (directly extends Object)
4. AparelhoTelefonico
Represents the core functionality of a phone.
Extends: NavegadorDeInternet


## Usage
The TelefoneFuncionando class serves as an entry point to the project. It demonstrates the sequence of operations involving the music player, internet browser, and telephone functionalities.


## Contributing 😄

I'm sharing this project to foster collaboration and knowledge sharing within the coding community. If you have any suggestions, improvements, or feature requests, please feel free to open an issue or submit a pull request. Your contributions will help me enhance my skills and make the project more enjoyable.

## License

This project is licensed under the [MIT License](LICENSE). You are welcome to use, modify, and distribute the code as needed.


Thank you for checking out my second coding project on GitHub. I hope you find it engaging and inspiring. Happy coding!


## For a simple and clear visualization

```mermaid
 
classDiagram
  class TelefoneFuncionando {
    +main(String[] args)
  }

  class ReprodutorMusical {
    -boolean tocar
    -boolean pausar
    -boolean selecionarMusica
    +tocar()
    +pausar()
    +selecionarMusica()
  }

  class NavegadorDeInternet {
    -boolean exibirPagina
    -boolean adicionarNovaAba
    -boolean atualizarPagina
    +exibirPagina()
    +adicionarNovaAba()
    +atualizarPagina()
  }

  class AparelhoTelefonico {
    -boolean ligar
    -boolean atender
    -boolean iniciarCorreioVoz
    +ligar()
    +atender()
    +iniciarCorreioVoz()
  }

  TelefoneFuncionando --|> ReprodutorMusical
  ReprodutorMusical --|> AparelhoTelefonico
  AparelhoTelefonico --|> NavegadorDeInternet
