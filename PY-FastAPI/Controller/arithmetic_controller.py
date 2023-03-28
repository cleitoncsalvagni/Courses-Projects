from fastapi import FastAPI
import requests
from fastapi.staticfiles import StaticFiles
from fastapi.responses import HTMLResponse


app = FastAPI()

app = FastAPI(
    title="Funções Aritméticas com FastAPI",
    version="0.0.1",
    openapi_url="/openapi.json",
    docs_url="/docs",
    redoc_url="/redoc",
    description="Para rodar o projeto, você precisa instalar o *FastAPI*, *requests* e *uvicorn*. Após a instalação desses "
                "itens vamos rodar o projeto, serão três servidores e a nossa main.py. **Primeiro Passo (main)**: "
                "```python -m uvicorn main:app --port 8000 --reload``` **Segundo Passo (controller)**: "
                "```python -m uvicorn Controller.arithmetic_controller:app --port 8001 --reload``` **Terceiro Passo (model)**: "
                "```python -m uvicorn Model.sum_model:app --port 8002 --reload```  ```python -m uvicorn Model.multiply_model:app --port 8003 --reload```",
)

app.mount("/View", StaticFiles(directory="view"), name="view")

@app.get("/", response_class=HTMLResponse, summary="Inicio", description="Esta rota carrega a nossa view.")
async def home():
    with open("View/home.html", "r") as f:
        html_content = f.read()
    return html_content


@app.get("/somar/{a}/{b}", summary="Soma dois números", description="Esta rota retorna a soma de dois números.")
async def add_numbers(a: int, b: int):

    response = requests.post("http://127.0.0.1:8002/somar", json={"a": a, "b": b})
    result = response.json()["result"]

    return result


@app.get('/multiplicar/{a}/{b}', summary="Multiplica dois números", description="Esta rota retorna o produto de dois números.")
async def multiply_numbers(a: int, b: int):
    response = requests.post("http://127.0.0.1:8003/multiplicar", json={"a": a, "b": b})
    result = response.json()["result"]

    return result
