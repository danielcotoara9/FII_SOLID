
LSP : Liskov substitution Principle - How To obtain a better design

- Create a base class that will be the base for every transportation vehicle based on needs
- Consider Refactoring to a new Base Class
	- Give two classes that shares a lot of behavior but are not substitutable.
	- Ensure substitutability is retained between each class and the new base class.

- Add a method/s there that will do exactly what is needed
- Every child will override this method with its own implementation (can be used an interface as well)