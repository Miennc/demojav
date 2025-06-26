package collections;

import java.util.*;

/**
 * Java Collections Framework
 * -------------------------
 * Cung cấp các cấu trúc dữ liệu mạnh mẽ như List, Set, Map, Queue...
 * Giúp lưu trữ, truy xuất và xử lý dữ liệu hiệu quả.
 *
 * Mục đích sử dụng:
 * - Quản lý và thao tác với tập hợp dữ liệu lớn.
 * - Dễ dàng tìm kiếm, sắp xếp, thêm, xóa phần tử.
 * - Tăng tính linh hoạt và tái sử dụng mã nguồn.
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        // 1. List: Lưu trữ các phần tử theo thứ tự, cho phép trùng lặp
        // ArrayList: Truy xuất nhanh, thêm/xóa cuối nhanh
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Apple"); // Cho phép trùng lặp
        System.out.println("ArrayList: " + arrayList);

        // LinkedList: Thêm/xóa đầu/cuối nhanh, duyệt chậm hơn ArrayList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Cat");
        linkedList.add("Dog");
        linkedList.add("Cat");
        System.out.println("LinkedList: " + linkedList);

        // 2. Set: Lưu trữ các phần tử không trùng lặp
        // HashSet: Không đảm bảo thứ tự
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple"); // Không cho phép trùng lặp
        System.out.println("HashSet: " + hashSet);

        // TreeSet: Tự động sắp xếp tăng dần
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Orange");
        treeSet.add("Banana");
        treeSet.add("Apple");
        System.out.println("TreeSet (sorted): " + treeSet);

        // 3. Map: Lưu trữ cặp key-value, key không trùng lặp
        // HashMap: Không đảm bảo thứ tự
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 2);
        hashMap.put("Banana", 3);
        hashMap.put("Apple", 5); // Ghi đè giá trị cũ
        System.out.println("HashMap: " + hashMap);

        // TreeMap: Key được sắp xếp tăng dần
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Orange", 1);
        treeMap.put("Banana", 2);
        treeMap.put("Apple", 3);
        System.out.println("TreeMap (sorted): " + treeMap);

        // 4. Queue: Hàng đợi, thường dùng PriorityQueue
        // PriorityQueue: Mặc định là min-heap (phần tử nhỏ nhất ở đầu)
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(3);
        System.out.println("PriorityQueue (min-heap): " + priorityQueue);
        System.out.println("Lấy phần tử nhỏ nhất: " + priorityQueue.poll());
        System.out.println("PriorityQueue sau khi poll: " + priorityQueue);
    }
}
