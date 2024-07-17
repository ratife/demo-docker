import socket



from flask import Flask

app = Flask(__name__)

@app.route('/')
def hello_world():
    hostname = socket.gethostname()
    local_ip = socket.gethostbyname(hostname)
    return 'Hello, World python : IP = ' + local_ip

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000)
