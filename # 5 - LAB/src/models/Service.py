from src.models.Sample import Sample


class Service:

    def __init__(self):
        self.simple_sample = [] * 30
        self.complex_sample = [] * 30

    def get_simple_sample(self) -> list:
        return self.simple_sample

    def get_complex_sample(self) -> list:
        return self.complex_sample

    def add_sample(self, sample: Sample):
        if 0 <= sample.get_deep() <= 10:
            self.__add_simple_sample(sample)
        elif 11 <= sample.get_deep() <= 50:
            self.__add_complex_sample(sample)
        else:
            raise ValueError("Invalid deep value")

    def __add_simple_sample(self, sample: Sample):
        self.simple_sample.append(sample)

    def __add_complex_sample(self, sample: Sample):
        self.complex_sample.append(sample)

    @staticmethod
    def __get_media(samples: list) -> float:
        media = 0
        for sample in samples:
            media += sample.get_deep()
        return media / len(samples) if len(samples) > 0 else 0

    @staticmethod
    def __get_total_cost(samples: list) -> float:
        total_cost = 0
        for sample in samples:
            if 0 <= sample.get_deep() <= 10:
                total_cost += 400000
            elif 11 <= sample.get_deep() <= 50:
                total_cost += 1000000
        return total_cost

    def get_media_simple_sample(self) -> float:
        return self.__get_media(self.simple_sample)

    def get_media_complex_sample(self) -> float:
        return self.__get_media(self.complex_sample)

    def get_total_cost(self) -> float:
        return self.__get_total_cost(self.simple_sample) + self.__get_total_cost(self.complex_sample)
