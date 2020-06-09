from OCP_Open_Close_Principle.After.Discount import Discount

class VIPDiscount(Discount):
    def apply_discount(self):
        return super().apply_discount() * 2