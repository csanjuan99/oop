from models.Coffee import Coffee


if __name__ == "__main__":
    coffee = Coffee()
    coffee.setOnzValue(50)
    coffee.setReceiveCash(1000)
    coffee.buyCoffee()
