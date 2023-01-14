# Java Generics Implementation#
This assignment was completed as part of graduate coursework.
</br>

Overview for each file:</br>
1. ***Attributed.java:***</br>
  Refactored this class so that Attributed is parameterized by a type that determines the type of the attributes. The parameterization is at the *interface* level and not the method-level.

2. ***AttributedDataContainer.java***</br>
  This class has been refactored to be parameterizable with types that implement Attributed.
  Refactored the AttributedDataContainer class so that the "data" can be parameterized with any type that implements the Attributed interface.

3. ***DataContainer.java***</br>
Refactored the DataContainer class so that the "data" can be parameterized with any type.</br>

4. ***Mapping.java***</br>
 Refactored this class so that the classes for the identifier and value can be parameterized separately from each other.</br>
 
5. ***NestedDataContainer.java***</br>
 Refactored the NestedDataContainer to be parameterized in a way based on how many type parameters are expected and what the return type of getData should be.
