import java.util.Iterator;

public class SuperList<T> extends ListManager<T> {

    @Override
    public void addElement(T element) {
        list.add(element);
    }

    @Override
    public T removeElement(int position) {
        return list.remove(position);
    }


    @Override
    public void showElements() {

        Iterator<T> it = list.iterator();
        while(it.hasNext())
            // T tal = it.next();
            System.out.println(it.next());

        /* Iterator <SuperList> it = list.it();

        while (it.hasNext()) {
            SuperList list = it.next();
            System.out.println(list); */

    }

    @Override
    public void showReversedElements() {

    }
}

