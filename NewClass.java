
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array
        System.out.print("Enter the elements of the array separated by spaces: ");
        String[] inputArray = scanner.nextLine().split(" ");
        List<Integer> array = new ArrayList<>();
        for (String element : inputArray) {
            array.add(Integer.parseInt(element));
        }

        // Partition size
        System.out.print("Enter the partition size: ");
        int partitionSize = scanner.nextInt();

        // Partition order
        System.out.print("Enter the partition order separated by spaces: ");
        List<Integer> partitionOrder = new ArrayList<>();
        for (int i = 0; i < array.size() / partitionSize; i++) {
            partitionOrder.add(scanner.nextInt());
        }

        // Partition the array
        List<List<Integer>> partitions = partitionArray(array, partitionSize);

        // Merge based on the partition order
        List<Integer> mergedArray = mergePartitions(partitions, partitionOrder);

        // Output the result
        System.out.println("Output:");
        for (int element : mergedArray) {
            System.out.print(element + " ");
        }

        scanner.close();
    }

    private static List<List<Integer>> partitionArray(List<Integer> array, int partitionSize) {
        List<List<Integer>> partitions = new ArrayList<>();
        for (int i = 0; i < array.size(); i += partitionSize) {
            partitions.add(new ArrayList<>(array.subList(i, Math.min(i + partitionSize, array.size()))));
        }
        return partitions;
    }

    private static List<Integer> mergePartitions(List<List<Integer>> partitions, List<Integer> partitionOrder) {
        List<Integer> mergedArray = new ArrayList<>();
        for (int order : partitionOrder) {
            if (order >= 1 && order <= partitions.size()) {
                mergedArray.addAll(partitions.get(order - 1));
            }
        }
        return mergedArray;
    }
}
