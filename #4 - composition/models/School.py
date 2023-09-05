from models.Student import Student


class School:

    def __init__(self, name: str, students: list[Student] = None):
        self.name = name
        self.students = students

    def add_student(self, student: Student):
        self.students.append(student)

    def __dict__(self):
        data = {
            "name": self.name,
            "students": list(map(lambda student: student.__dict__(), self.students)),
        }
        return data
