# COMANDOS GIT

## AYUDA

> [!NOTE] git help
> Obtiene ayuda general

> [!NOTE] git help add
> Obtiene ayuda de un comando específico

## CONFIGURACIONES

> [!NOTE] git config --global user.name [username]
> Establece un username a mi identidad

> [!NOTE] git config --global user.mail [email]
> Establece un email a mi identidad

> [!NOTE] git config --global --unset user.name [username]
> Elimina un username a mi identidad

> [!NOTE] git config --global --unset user.email [email]
> Elimina un email a mi identidad

> [!NOTE] git config --list
> Lista las configuraciones de GIT Local

## GESTIÓN DE ARCHIVOS

> [!NOTE] git init
> Crea un nuevo repositorio

> [!NOTE] git status
> Muestra el estado de los archivos del repositorio

> [!NOTE] git add [file]
> Agrega al área de staging un archivo en específico

> [!NOTE] git add .
> Agrega al área de staging todos los archivos

> [!NOTE] git commit -m "message"
> Pasa los archivos del área de staging al historial del repositorio

> [!NOTE] git checkout -- [file]
> Descarta cambios locales en un archivo

> [!NOTE] git reset head [file]
> Descarta cambios locales en un archivo que se encuentra en el área de staging

> [!NOTE] git commit --amend -m "message"
> Cambia el mensaje de commit del último commit realizado

> [!NOTE] git stash
> Guarda los cambios actuales sin hacer commit y limpia el directorio de trabajo

> [!NOTE] git stash pop
> Recupera los cambios guardados del stash, eliminandolo de la lista de stashes

## LOGS

> [!NOTE] git log
> Muestra el historial de commits

> [!NOTE] git log -- [path]
> Muestra el historial de commits de un archivo específico

> [!NOTE] git log --author=[username]
> Muestra el historial de commits de un usuario específico

## REPOSITORIO REMOTO

> [!NOTE] git remote
> Muestra una lista de los repositorios remotos configurados en el repositorio

> [!NOTE] git remote -v
> Muestra en detalle una lista de los repositorios remotos configurados en el repositorio

> [!NOTE] git remote add origin [url]
> Enlaza un repositorio remoto con el repositorio local

> [!NOTE] git remote show origin
> Muestra información detallada sobre el repositorio remoto enlazado

> [!NOTE] git remote rename origin [new-name]
> Renombra el repositorio remoto enlazado

> [!NOTE] git remote rm [name]
> Desvincula del repositorio local, el repositorio remoto enlazado

## GESTIÓN DE REPOSITORIOS

> [!NOTE] git push -u origin master
> Se utiliza por primera vez y realiza el push de una rama al repositorio remoto

> [!NOTE] git push
> Realiza el push de una rama al repositorio remoto

> [!NOTE] git pull
> Actualiza la rama actual del repositorio local desde el repositorio remoto

> [!NOTE] git fetch origin
> Obtiene los últimos cambios del repositorio remoto sin modificar código de mi rama actual

> [!NOTE] git clone [url]
> Clona un repositorio remoto en el disco local

## GESTIÓN DE RAMAS

> [!TIP] HEAD
> Puntero especial que indica la branch actual en la que se está trabajando. Por defecto, apunta a la branch principal (como `main` o `master`), pero puede cambiar cuando cambias de rama o creas commits.

> [!NOTE] git branch [branch-name]
> Crea una nueva rama en el repositorio local

> [!NOTE] git checkout [branch-name]
> Cambia en el repositorio local a una rama existente

> [!NOTE] git checkout -b [branch-name]
> Crea una nueva rama en el repositorio local y cambia el puntero a dicha rama

> [!NOTE] git merge [branch-name]
> Realiza la unión entre la rama actual (HEAD) y la rama indicada

> [!NOTE] git branch -d [branch-name]
> Elimina una rama del repositorio local

> [!NOTE] git branch
> Muestra una lista de las ramas existentes en el repositorio local

> [!NOTE] git branch -v
> Muestra una lista con información de los últimos commits de las ramas existentes en el repositorio local

> [!NOTE] git branch --merged
> Muestra una lista de las ramas que ya han sido mergeadas

> [!NOTE] git branch --no-merged
> Muestra una lista de las ramas que no han sido mergeadas

> [!NOTE] git merge --abort
> Cancela un merge en progreso, dejando el repositorio en su estado anterior

> [!NOTE] git reset --merge
> Cancela un merge en progreso, pero puede no ser seguro en todos los casos

> [!NOTE] git reset HEAD
> Deshace los cambios en staging

> [!NOTE] git reset --hard HEAD
> Deshace los cambios en staging y en el directorio de trabajo
