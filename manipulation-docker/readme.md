# Command sous docker

## commande IMAGE
### affichage list images
```cmd
docker images 
```

### Creation d'image avec dockerfile
```cmd
docker build . -t <nom>:<version>
```


### supprimer image
```cmd
docker rmi <id_image>
```

## commande CONTAINER

### affichage list container en cours d'execution
```cmd
docker ps
```

### affichage list de tout les container 
```cmd
docker ps -a
```

### lancer un contenaire :
```cmd
 docker run -d --name  demo-cont -p 81:80 demophp:0.1
 ```
 
### executer un commande interactive sh avec un contaner
```cmd
docker exec -it <id_contenair> sh
```



## commande network

### list network
```cmd
docker network ls
```
### creation network
```cmd
docker network create demo-bridge1 --driver <driver>
```
### delete network
```cmd
docker network rm <id_network>
```

## commande registry

### se loger
```cmd
docker login
```

### publier image
```cmd
docker tag igy-demo-php:0.1 ratife/igy-demo-php:0.1
docker push ratife/igy-demo-php:0.1
```

### recuperer image
```cmd
docker pull
```