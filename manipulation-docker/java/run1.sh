docker build . -t igy-demo-java:0.1
docker run -d -p 8080:8080 igy-demo-java:0.1