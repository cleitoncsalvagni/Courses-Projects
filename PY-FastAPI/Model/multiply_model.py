from fastapi import FastAPI

app = FastAPI()


@app.post("/multiplicar")
async def multiply_number(request: dict):
    a = request["a"]
    b = request["b"]
    result = a * b

    return {"result": result}
