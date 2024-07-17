docker build . -t demo-java:0.1
docker run -d -p 8080:8080 demo-java:0.1