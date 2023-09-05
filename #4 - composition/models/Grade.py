class Grade:

    def __init__(self, first_grade: float, second_grade: float, third_grade: float):
        self.first_grade = first_grade
        self.second_grade = second_grade
        self.third_grade = third_grade

    def get_media(self):
        return (self.first_grade + self.second_grade + self.third_grade) / 3;
