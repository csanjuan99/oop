from src.models import Service, Sample


class Lab:

    def __init__(self):
        self.__services: [Service] = [] * 100

    def add_service(self, service: Service):
        self.__services.append(service)

    def get_services(self) -> [Service]:
        return self.__services

    def __get_service(self, index: int) -> Service:
        return self.__services[index]

    def register_sample(self, sample: Sample, index: int):
        current_service = self.__get_service(index)
        current_service.add_sample(sample)

    def get_info_lab(self):
        for service in self.__services:
            print('-------------------------------------------')
            print(f'Service: {self.__services.index(service)}')
            print(f'Media of simple samples: {service.get_media_simple_sample()}')
            print(f'Media of complex samples: {service.get_media_complex_sample()}')
            print(f'Total cost: {service.get_total_cost()}')
            print('-------------------------------------------')
