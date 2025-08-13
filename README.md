# CalculadoraImc
walter-domiciano:~/development/Exercicios/CalculadoraImc(git:main)$ echo "# CalculadoraImc" >> README.md
walter-domiciano:~/development/Exercicios/CalculadoraImc(git:main)$ git status
On branch main

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
	new file:   README.md
	new file:   src/main/java/CalculadoraIMC.java

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   README.md
	modified:   src/main/java/CalculadoraIMC.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
	.gitignore
	.idea/
	CalculadoraImc.iml
	src/Main.java

walter-domiciano:~/development/Exercicios/CalculadoraImc(git:main)$ git init
Reinitialized existing Git repository in /home/walter-domiciano/development/Exercicios/CalculadoraImc/.git/
walter-domiciano:~/development/Exercicios/CalculadoraImc(git:main)$ git status
On branch main

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
	new file:   README.md
	new file:   src/main/java/CalculadoraIMC.java

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   README.md
	modified:   src/main/java/CalculadoraIMC.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
	.gitignore
	.idea/
	CalculadoraImc.iml
	src/Main.java

walter-domiciano:~/development/Exercicios/CalculadoraImc(git:main)$ git add README.md
walter-domiciano:~/development/Exercicios/CalculadoraImc(git:main)$ git status
On branch main

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
	new file:   README.md
	new file:   src/main/java/CalculadoraIMC.java

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   src/main/java/CalculadoraIMC.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
	.gitignore
	.idea/
	CalculadoraImc.iml
	src/Main.java

walter-domiciano:~/development/Exercicios/CalculadoraImc(git:main)$ git commit -m "first commit"
[main (root-commit) 6b5e269] first commit
 2 files changed, 7 insertions(+)
 create mode 100644 README.md
 create mode 100644 src/main/java/CalculadoraIMC.java
walter-domiciano:~/development/Exercicios/CalculadoraImc(git:main)$ git branch -M main
walter-domiciano:~/development/Exercicios/CalculadoraImc(git:main)$ git status
On branch main
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   src/main/java/CalculadoraIMC.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
	.gitignore
	.idea/
	CalculadoraImc.iml
	src/Main.java

no changes added to commit (use "git add" and/or "git commit -a")
walter-domiciano:~/development/Exercicios/CalculadoraImc(git:main)$ git remote add origin https://github.com/Walterdev1k/CalculadoraImc.git
walter-domiciano:~/development/Exercicios/CalculadoraImc(git:main)$ git log
commit 6b5e2690d0aba981287d16f7a7552c1979defc3e (HEAD -> main)
Author: Walterdev1k <walterdev1k81@hotmail.com>
Date:   Wed Aug 13 17:26:48 2025 -0300

    first commit
walter-domiciano:~/development/Exercicios/CalculadoraImc(git:main)$ git push -u origin main
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 4 threads
Compressing objects: 100% (4/4), done.
Writing objects: 100% (7/7), 464 bytes | 464.00 KiB/s, done.
Total 7 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/Walterdev1k/CalculadoraImc.git
 * [new branch]      main -> main
branch 'main' set up to track 'origin/main'.
