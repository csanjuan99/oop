from src.models.Sample import Sample
from src.models.Service import Service
from src.models.Lab import Lab


def main():
    lab = Lab()
    service_0 = Service()
    service_1 = Service()

    lab.add_service(service_0)
    lab.add_service(service_1)

    ## create samples
    sample_1 = Sample(5, "123", "12/12/2020")
    sample_2 = Sample(9, "456", "12/12/2020")
    sample_3 = Sample(9, "789", "12/12/2020")
    sample_4 = Sample(14, "101", "12/12/2020")
    sample_5 = Sample(7, "112", "12/12/2020")
    sample_6 = Sample(30, "131", "12/12/2020")
    sample_7 = Sample(50, "415", "12/12/2020")

    sample_8 = Sample(5, "123", "12/12/2020")
    sample_9 = Sample(15, "456", "12/12/2020")
    sample_10 = Sample(10, "789", "12/12/2020")
    sample_11 = Sample(22, "101", "12/12/2020")
    sample_12 = Sample(8, "112", "12/12/2020")
    sample_13 = Sample(39, "131", "12/12/2020")
    sample_14 = Sample(50, "415", "12/12/2020")

    ## register sample to service 0
    lab.register_sample(sample_1, 0)
    lab.register_sample(sample_2, 0)
    lab.register_sample(sample_3, 0)
    lab.register_sample(sample_4, 0)
    lab.register_sample(sample_5, 0)
    lab.register_sample(sample_6, 0)
    lab.register_sample(sample_7, 0)

    ## register sample to service 1
    lab.register_sample(sample_8, 1)
    lab.register_sample(sample_9, 1)
    lab.register_sample(sample_10, 1)
    lab.register_sample(sample_11, 1)
    lab.register_sample(sample_12, 1)
    lab.register_sample(sample_13, 1)
    lab.register_sample(sample_14, 1)

    ## information of lab
    lab.get_info_lab()


main()
