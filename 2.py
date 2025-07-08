# coding utf-8
from random import randint


def versions_2(string_column: int, iterations_num: tuple[int, int]):
    matrix = [
        [randint(*iterations_num) for I in range(string_column)]
            for J in range(string_column)
    ]

    print(f"\nИсходная матрица:")
    for matrix_values in matrix:
        print(' '.join(f'{num:3}' for num in matrix_values))
    

    print(f"\nТранспонированная матрица:")
    transposition_matrix = list(map(list, zip(*matrix)))
    for matrix_values in transposition_matrix:
        print(' '.join(f'{num:4}' for num in matrix_values))


if __name__ == "__main__":
    string_m = int(input("Введите количество строк: "))

    versions_2(string_m, iterations_num=(0, 100))


