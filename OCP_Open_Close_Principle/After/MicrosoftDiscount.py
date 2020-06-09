from OCP_Open_Close_Principle.After.Discount import Discount

class MicrosoftDiscount(Discount):
    def apply_discount(self):
        return super().apply_discount() * 3