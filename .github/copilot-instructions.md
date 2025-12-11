# Guidance for AI coding assistants

This repository is a collection of small Java exercise programs (console apps). The goal of these instructions is to help an AI coding assistant be immediately productive without making large, invasive refactors.

- **Big picture:** This is not a multi-module application or service. It's a set of standalone Java programs organized into folders such as `CoursKonda`, `Exercices corrigés`, `Entrainement`, and top-level exercise files. Most classes are simple `public static void main` console apps. Example: `CoursKonda/exoParNiv/exoNiv3_cor.java` (menu-driven bank demo).

- **Build / Run (Windows PowerShell):** there is no Maven/Gradle. Use `javac`/`java`. Preserve UTF-8 for accented French text.
  - Compile a single file:
    javac -encoding UTF-8 "path\to\File.java"
  - Compile all `.java` files recursively:
    Get-ChildItem -Path . -Recurse -Filter *.java | ForEach-Object { javac -encoding UTF-8 $_.FullName }
  - Run a compiled class in the default package (run from folder that contains the `.class`):
    java ClassName
  - Run a class inside a named package (example `Entrainement.Message`):
    cd to repository root then: java -cp . Entrainement.Message

- **Project-specific conventions / patterns**
  - Many files use the Java default (no `package`) — modifying these into packages will change how they're run. If you add packages, update run instructions and keep changes minimal.
  - User-facing strings and prompts are in French; preserve language and punctuation in any edits that affect console output (e.g. `System.out.println("Quel est votre nom ? :")`).
  - Classes and filenames are inconsistent (some lowercase names like `exoNiv3_cor.java`). Avoid renaming files unless requested — renames break users' expectations and runnable commands.
  - Most programs read from `Scanner(System.in)` and write to console; tests and CI are not present. Treat programs as interactive examples.

- **When editing or adding code**
  - Keep changes small and localized. Prefer fixing logic bugs rather than full refactors across many files.
  - If adding a new utility class used by several exercises, place it in a new package and update instructions on how to compile/run those exercises. Document the change in the repo root or in a short README.
  - Preserve existing input/output behavior in exercises unless making a targeted bug fix; many files are used as teaching examples where behaviour matters.

- **Files/directories to consult for examples**
  - `CoursKonda/exoParNiv/exoNiv3_cor.java` — menu-driven example with `Scanner` and `switch`.
  - `Entrainement/Message.java` — example with a `package` declaration; shows how packaged classes differ from default-package classes.
  - Top-level files like `JalonBlancexo_1.java` — representative simple exercises.

- **Integration / external dependencies**
  - None. No build system, no external libraries. All code uses standard Java JDK classes.

- **Do Not**
  - Do not reorganize the repository into packages or modules without asking — this will change compile/run commands and may break intended examples.
  - Do not convert console apps into services or GUIs unless requested; these are pedagogical exercises.

If any part of the codebase looks like it should be refactored into a proper Java project (Maven/Gradle) or if you want automated compilation and tests added, ask and I can propose a minimal migration. Please tell me which files you want me to examine or modify next.
