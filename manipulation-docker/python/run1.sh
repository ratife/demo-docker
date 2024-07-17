docker build . -t igy-demo-python:0.1
docker run -d -p 5000:5000 igy-demo-python:0.1