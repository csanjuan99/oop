class Sample:

    def __init__(self):
        self.__deep: int = 0
        self.__serial: str = ""
        self.__date: str = ""

    def __init__(self, deep: int, serial: str, date: str):
        self.__deep = deep
        self.__serial = serial
        self.__date = date

    def set_deep(self, deep: int):
        self.__deep = deep

    def set_serial(self, serial: str):
        self.__serial = serial

    def set_date(self, date: str):
        self.__date = date

    def get_deep(self) -> int:
        return self.__deep

    def get_serial(self) -> str:
        return self.__serial

    def get_date(self) -> str:
        return self.__date
