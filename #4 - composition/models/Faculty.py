from models.School import School


class Faculty:

    def __init__(self, name: str, schools: list[School] = None):
        self.schools = schools
        self.name = name

    def set_schools(self, schools: list[School]):
        self.schools = schools

    def __dict__(self):
        data = {
            "name": self.name,
            "schools": list(map(lambda school: school.__dict__(), self.schools))
        }
        return data
