docker build . -t demophp:0.1
docker run -d -p 80:80 -v ./src:/var/www/html/ demophp:0.1 