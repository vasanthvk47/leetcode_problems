import pandas as pd

def nth_highest_salary(employee: pd.DataFrame, N: int) -> pd.DataFrame:
    salaries = employee['salary'].drop_duplicates()
    salaries = salaries.sort_values(ascending=False)

    col_name = f'getNthHighestSalary({N})'  # use f-string for dynamic name

    if N <= len(salaries) and N>0:
        return pd.DataFrame({col_name: [salaries.iloc[N - 1]]})
    else:
        return pd.DataFrame({col_name: [None]})
