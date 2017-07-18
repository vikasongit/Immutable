Here is the example of creating a java class immutable.
Below are the key pointers:
1. Class should be declared as final.
2. All the mutable fields should as final.
3. All the mutable fields in the class should marked as private.
4. Mutable fields should be initialzed via constructor performing deep copy.
5. In getter methods do cloning of objectsbefore returing the object.
