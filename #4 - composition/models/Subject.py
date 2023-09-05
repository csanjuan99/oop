from models.Grade import Grade


class Subject:

    def __init__(self, id: int, name: str, grade: Grade = None):
        self.id = id
        self.name = name
        self.grade = grade

    def add_grade(self, grade: Grade):
        self.grade = grade

    def __dict__(self):
        return {
            "id": self.id,
            "name": self.name,
            "grade": self.grade.__dict__
        }
