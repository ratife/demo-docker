# Command sous docker swarm

### creation node master
```cmd
docker swarm init
```
### creation add node worker
```cmd
docker swarm join-token
```

### deploiement
```cmd
docker stack deploy -c deploy.yml DEMO-IGY
```

### affichage deployement
```cmd
docker stack ls
```

### affichage satus
```cmd
docker stack services DEMO-IGY
```

### supprimer deployment
```cmd
docker stack rm DEMO-IGY
```