from models.Address import Address
from models.Subject import Subject


class Student:
    def __init__(self, name: str, age: int, level: int, address: Address = None, subjects: list[Subject] = None):
        self.name = name
        self.age = age
        self.level = level
        self.address = address
        self.subjects = subjects

    def set_address(self, address: Address):
        self.address = address

    def set_subjects(self, subjects: list[Subject]):
        self.subjects = subjects

    def __dict__(self):
        data = {
            "name": self.name,
            "age": self.age,
            "level": self.level,
            "address": self.address.__dict__,
            "subjects": list(map(lambda subject: subject.__dict__(), self.subjects))
        }
        return data

