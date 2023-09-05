from models.Address import Address
from models.Student import Student
from models.Subject import Subject
from models.Grade import Grade
from models.School import School
from models.Faculty import Faculty
import json


def main():
    address = Address('CLL 52 #23-31', 'Bucaramanga', 'Santander', 'Sotomayor', '680003')
    math_grade = Grade(3.5, 2.0, 4.1)
    science_grade = Grade(1.5, 2.0, 2.1)
    subjects = [Subject(1, 'Calculo', math_grade), Subject(2, 'Programacion basica', science_grade)]
    student = Student('Carlos Sanjuan', 19, 11, address, subjects)
    # print(f'Estudiante: {json.dumps(student.__dict__(), indent=4)}')
    school = School('Ingenieria de Sistemas', [student])
    faculty = Faculty('Facultad de fisico mecanicas')
    faculty.set_schools([school])
    print(f'Facultad: {json.dumps(faculty.__dict__(), indent=4)}')


if __name__ == '__main__':
    main()
