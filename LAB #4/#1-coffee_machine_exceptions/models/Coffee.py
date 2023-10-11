class Coffee:

    def __init__(self):
        self.cash = 20000
        self.level = 100
        self.onzValue = 100
        self.onzPrice = 0
        self.receiveCash = 0

    def getCoffeePrice(self):
        if self.onzPrice < 0:
            raise ValueError('Onz price must be greater than or equal to 0')
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
            raise ValueError('Onz value must be greater than or equal to 0')
        if onzValue > self.level:
            raise ValueError(f'Onz value must be less than or equal to level. Current level is {self.level}')
        self.onzValue = onzValue

    def setReceiveCash(self, receiveCash):
        if receiveCash < 0:
            raise ValueError('Receive cash must be greater than or equal to 0')
        self.receiveCash = receiveCash


    def buyCoffee(self):
        if self.receiveCash < self.getCoffeePrice():
            raise ValueError('Not enough money to buy coffee')
    
        if self.level < self.onzValue:
            raise ValueError('Not enough coffee available')
    
        self.cash += self.getCoffeePrice()
        self.level -= self.onzValue
        self.onzValue = 0
        self.receiveCash = 0

        print('Buy coffee success')
        return self.getChange()

