# Funções Aritméticas com FastAPI

Este projeto 

## Configuração rápida

1. **Instale as dependências:**
    ```sh
    python -m pip install "fastapi[all]"
    python -m pip install requests
    python -m pip install uvicorn

    ```
2. Para rodar o código:

#### Main
```sh
    python -m uvicorn main:app --port 8000 --reload
```

#### Controller
```sh
    python -m uvicorn Controller.arithmetic_controller:app --port 8001 --reload
```

#### Models
```sh
    python -m uvicorn Model.sum_model:app --port 8002 --reload
```
```sh
    python -m uvicorn Model.multiply_model:app --port 8003 --reload
```