from fastapi import FastAPI

app = FastAPI()


@app.post("/somar")
async def add_numbers(request: dict):
    a = request["a"]
    b = request["b"]
    result = a + b

    return {"result": result}
