package Streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {



    public static void main(String[] args) {
        //    Java Streams is a powerful feature introduced in Java 8 that allows developers
//    to perform complex operations on collections of data with concise and expressive code.
//    Here are some examples of using Java Streams:
//
//    Filtering
//    The filter() method in Java Streams allows you to select elements that match a certain condition.
//
//    Example:

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers); // Output: [2, 4, 6, 8, 10]
//        In this example, we have a list of integers, and we use the filter() method to select
//        only the even numbers. The resulting list is then collected and printed.
//

//
//        Mapping
//        The map() method in Java Streams allows you to transform elements of a collection into a different form.
//
//        Example:

        List<String> names = Arrays.asList("John", "Jane", "Bob", "Mary");

        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperCaseNames); // Output: [JOHN, JANE, BOB, MARY]
//        In this example, we have a list of strings representing names, and we use the map()
//        method to transform each name to upper case. The resulting list is then collected and printed.


//        Reducing
//        The reduce() method in Java Streams allows you to perform a reduction operation
//        on a collection of data, such as finding the sum, maximum, or minimum value.
//
//        Example:

        List<Integer> numbersNew = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbersNew.stream()
                .reduce(0, Integer::sum);

        System.out.println(sum); // Output: 15

//        In this example, we have a list of integers, and we use the reduce()
//        method to calculate the sum of all the numbers.



//        Parallelism
//        Java Streams also supports parallel processing,
//        which can significantly improve the performance of operations on large collections of data.
//
//        Example:

        List<Integer> numbersPar = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumPar = numbersPar.parallelStream()
                .reduce(0, Integer::sum);

        System.out.println(sumPar); // Output: 55
//        In this example, we use the parallelStream() method instead
//        of stream() to perform the operation in parallel.
//        The resulting sum is the same as the previous example,
//        but the operation is performed more quickly on a large collection of data.
//
//        These are just a few examples of what you can do with Java Streams.
//            By combining filtering, mapping, reducing, and other operations,
//        you can perform complex transformations and analysis
//        on collections of data with concise and expressive code.

    }



}
