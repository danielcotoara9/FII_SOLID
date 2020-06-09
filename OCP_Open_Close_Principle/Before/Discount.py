

class Discount:
    def __init__(self, customer, price):
        self.customer = customer
        self.price = price

    def apply_discount(self):

        if self.customer == 'favorite':
            return self.price * 0.1

        if self.customer == "vip":
            return self.price * 0.2
            
        if self.customer == 'microsoft':
            return self.price * 0.3
