FROM python:3.9-slim
RUN apt-get update && apt-get install -y iputils-ping
WORKDIR /app
COPY app.py ./
RUN pip install Flask
EXPOSE 5000
CMD ["python", "app.py"]
