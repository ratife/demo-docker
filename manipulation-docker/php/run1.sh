docker build . -t igy-demo-php:0.1
docker run -d -p 80:80 igy-demo-php:0.1