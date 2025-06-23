import pandas as pd

def find_customers(customers: pd.DataFrame, orders: pd.DataFrame) -> pd.DataFrame:
    # Left join to keep all customers even if they didn't place orders
    merged = customers.merge(orders, how='left', left_on='id', right_on='customerId')

    # Filter out customers who didn't place any orders (NaN in customerId from orders)
    no_orders = merged[merged['customerId'].isna()]

    # Return a DataFrame with a column named 'Customers'
    return no_orders[['name']].rename(columns={'name': 'Customers'})
