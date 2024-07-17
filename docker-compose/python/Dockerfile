FROM python:3.9-slim

WORKDIR /app

COPY app.py requirements.txt ./

RUN pip install Flask

EXPOSE 5000

CMD ["python", "app.py"]
