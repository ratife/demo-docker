# Command sous docker swarm

### deploiement
```cmd
docker stack deploy -c docker-compose.yml DEMO-IGY
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