# coding utf-8
from random import randint


def versions_1(string: int, column: int, iterations_num: tuple[int, int]):
    matrix = [
        [randint(*iterations_num) for I in range(string)]
            for J in range(column)
    ]

    print(f"\nИсходная матрица:")
    for matrix_values in matrix:
        print(' '.join(f'{num:4}' for num in matrix_values))


    max_value = matrix[0][0]
    max_str, max_col = 0, 0

    for I in range(string):
        for J in range(column):
            if matrix[I][J] > max_value:
                max_value = matrix[I][J]
                max_str = I
                max_col = J
    
    print(f"\nМаксимальный элемент: {max_value}\nЕго координаты: строка {max_str + 1}, столбец {max_col + 1}")


if __name__ == "__main__":
    string_m = int(input("Введите количество строк: "))
    column_n = int(input("Введите количество столбцов: ")) 

    versions_1(string_m, column_n, iterations_num=(-100, 100))











# matrix = [
#     [randint(-100, 101) for I in range(string_m)] \
#         for II in range(column_n)
# ]

# print(f"\nИсходная матрица:")
# for matrix_values in matrix:
#     print(' '.join(f'{num:4}' for num in matrix_values))

# max_value = None
# for I in matrix:
#     for II in I:
#         if max_value is None or II > max_value:
#             max_value = II


# max_value = max(max(I) for  I in matrix)
# print(f"\nМаксимальный элемент: {max_value}\n")






# print(f"Исходная матрица:\n {(' '.join(f'{num:4}' for num in matrix_values) for matrix_values in matrix)}\n")


