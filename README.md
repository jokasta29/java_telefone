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


Feel free to explore and modify the code to suit your needs. 😄

## License
This project is licensed under the MIT License - see the LICENSE file for details.


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
