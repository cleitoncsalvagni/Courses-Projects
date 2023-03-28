from fastapi import FastAPI
from Controller.arithmetic_controller import app as app1
from Model.sum_model import app as app2
from Model.multiply_model import app as app3

from fastapi.middleware.cors import CORSMiddleware

app = FastAPI()

app.add_middleware(
    CORSMiddleware,
    allow_credentials=False,
    allow_methods=["*"],
    allow_origins=["*"],
    allow_headers=["*"],
)





