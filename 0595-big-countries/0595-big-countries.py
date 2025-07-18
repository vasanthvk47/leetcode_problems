import pandas as pd

def big_countries(world: pd.DataFrame) -> pd.DataFrame:
    # select name, population, area from world where area>=3000000 or population>=25000000
    return world.loc[
        (world['area'] >= 3000000) | (world['population'] >= 25000000),
        ['name', 'population', 'area']
    ]