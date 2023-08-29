class Coffee:

    def __init__(self):
        self.cash = 20000
        self.level = 100
        self.onzValue = 100
        self.onzPrice = 0
        self.receiveCash = 0

    def getCoffeePrice(self):
        return self.onzPrice * self.onzValue

    def getChange(self):
        change = self.receiveCash - self.getCoffeePrice()
        if change < 0:
            raise ValueError('Not enough money')
        if change == 0:
            print('No change')
        return change

    def setOnzValue(self, onzValue):
        if onzValue < 0:
            raise ValueError('Onz value must be greater than 0')
        if onzValue > self.level:
            raise ValueError(f'Onz value must be less than level. Current level is {self.level}')
        self.onzValue = onzValue

    def setReceiveCash(self, receiveCash):
        self.receiveCash = receiveCash

    def buyCoffee(self):
        if self.receiveCash < self.getCoffeePrice():
            raise ValueError('Not enough money')

        self.cash += self.getCoffeePrice()
        self.level -= self.onzValue
        self.onzValue = 0
        self.receiveCash = 0

        print('Buy coffee success')
        return self.getChange()
