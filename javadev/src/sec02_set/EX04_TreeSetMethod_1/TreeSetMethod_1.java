package sec02_set.EX04_TreeSetMethod_1;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMethod_1 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 50; i > 0; i -= 2) {
            treeSet.add(i);
        }
        System.out.println(treeSet.toString());
        // 1. first()
        System.out.println(treeSet.first());
        // 2. last()
        System.out.println(treeSet.last());
        // 3. lower(E element)
        System.out.println(treeSet.lower(26));
        // 4. higher(E element)
        System.out.println(treeSet.higher(26));
        // 5. floor(E element)
        System.out.println(treeSet.floor(25));
        System.out.println(treeSet.floor(26));
        // 6. ceiling(E element)
        System.out.println(treeSet.ceiling(25));
        System.out.println(treeSet.ceiling(26));
        System.out.println();
        // 7. pollFirst()
        int treeSetSize = treeSet.size();
        System.out.println(treeSetSize);
        for (int i = 0; i < treeSetSize; i++) {
            System.out.print(treeSet.pollFirst() + " ");
        }
        System.out.println();
        System.out.println(treeSet.size());
        // 8. pollLast()
        for (int i = 50; i > 0; i -= 2) {
            treeSet.add(i);
        }
        treeSetSize = treeSet.size();
        for (int i = 0; i < treeSetSize; i++) {
            System.out.print(treeSet.pollLast() + " ");
        }
        System.out.println();
        // 9. SortedSet<E> headSet(E toElement)
        System.out.println(treeSet.size());
        for (int i = 50; i > 0; i -= 2) {
            treeSet.add(i);
        }
        SortedSet<Integer> sSet = treeSet.headSet(20);
        System.out.println(sSet.toString());
        // 10 NavigableSet<E> headSet(E toElement, boolean inclusive)
        NavigableSet<Integer> nSet = treeSet.headSet(20, true);
        System.out.println(nSet.toString());
        nSet = treeSet.headSet(20, false);
        System.out.println(nSet.toString());
        // 11. SortedSet<E> tailSet(E fromElement)
        sSet = treeSet.tailSet(20);
        System.out.println(sSet.toString());
        // 12. NavigableSet<E> tailSet(E fromElement, boolean inclusive)
        nSet = treeSet.tailSet(20, true);
        System.out.println(nSet.toString());
        nSet = treeSet.tailSet(20, false);
        System.out.println(nSet.toString());
        // 13. SortedSet<E> subSet(E fromElement, E toElement)
        sSet = treeSet.subSet(20, 30);
        System.out.println(sSet.toString());
        // 14. NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement,
        // boolean toInclusive)
        nSet = treeSet.subSet(10, true, 20, false);
        System.out.println(nSet.toString());
        nSet = treeSet.subSet(10, false, 20, true);
        System.out.println(nSet.toString());
        // 15.NavigableSet<E> descendingSet()
        System.out.println(treeSet);
        NavigableSet<Integer> descendingSet = treeSet.descendingSet();
        System.out.println(descendingSet);
        descendingSet = descendingSet.descendingSet();
        System.out.println(descendingSet);
    }
}
