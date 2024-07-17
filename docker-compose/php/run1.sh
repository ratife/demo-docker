docker build . -t demophp:0.1
docker run -d -p 80:80 demophp:0.1