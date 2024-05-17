Explanation:
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

This line creates a list of integers using the Arrays.asList method.
Filtering Even Numbers:

.stream() converts the list into a stream.
.filter(n -> n % 2 == 0) filters out only the even numbers using a lambda expression.
.forEach(System.out::println) prints each element of the filtered stream.
Mapping to Squares:

.stream() again converts the list into a stream.
.map(n -> n * n) maps each element to its square using a lambda expression.
.forEach(System.out::println) prints each squared number.