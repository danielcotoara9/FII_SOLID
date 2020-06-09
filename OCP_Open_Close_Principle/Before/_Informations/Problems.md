

OCP Open Closed Principle - Problems

- More business rules to come !!! => 
- apply_discount method is doing more than is suppose to (determing the exact rule to apply)

- So this is a valid time for us to be looking at this and thinking, how can we change this code in such a way that we don't have to go in and edit this particular method, every time someone(Business Analys, Client, ...) comes up with a different discount based on a rule.