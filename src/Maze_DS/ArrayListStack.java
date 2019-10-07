/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maze_DS;

import ADTs.StackADT;
import Exceptions.EmptyCollectionException;
import java.util.ArrayList;

/**
 * It is ArrayListStack Class where the different methods are created and
 * implemented It holds following methods default constructor, push, pop,
 * isEmpty, peek, size, toString
 *
 * @author Shaishav Maisuria
 * @param <T> it is the generic type required for any data
 * @version 2/19/2019
 */
public class ArrayListStack<T> implements StackADT<T> {

    private int count; // use to keep track of number of element in the stack list
    private final ArrayList<T> listStack;//use to access the element and make changes to it

    /**
     * It is default constructor use for arrayListStack setting the default
     * values to the fields
     *
     */
    public ArrayListStack() {
        count = 0;
        listStack = new ArrayList<>();
    }

    /**
     * This is push method used to add element inside stack
     *
     * @param element which needed to be added
     */
    @Override
    public void push(T element) {
        listStack.add(element);
        count++;
    }

    /**
     * pop method is used remove element outside the stack if it doesnot have
     * any element than it throws exception
     *
     * @return T return address for the removed stack
     * @throws EmptyCollectionException
     */
    @Override
    public T pop() throws EmptyCollectionException {
        T result;
        if (count != 0) {
            result = listStack.remove(listStack.size() - 1); // removing element from stack
            count--;//after the removal the counter is decreased
        } else {
            throw new EmptyCollectionException("POP list in stack fails");
        }

        return result;
    }

    /**
     * It is peek method to see the element at the top of the list
     *
     * @return T return address to which mainly holds value for the peek element
     * @throws EmptyCollectionException
     */

    @Override
    public T peek() throws EmptyCollectionException {
        T result;
        if (!listStack.isEmpty()) {
            result = listStack.get(count - 1);
// only look to the element not at all remove the element just looking
        } else {

            throw new EmptyCollectionException("Stack is empty");
        }
        return result;

    }

    /**
     * This is the isEmpty method to see whether the stack is empty or not
     *
     * @return return true or false based on where the list is empty or not
     */

    @Override
    public boolean isEmpty() {
        // if the counter is zero than the list is empty so returns true
        
        return count == 0;

    }

    /**
     * IT size method used to return the size of the list
     *
     * @return int it acctually returns size of list
     */
    @Override
    public int size() {
        return count;
    }
/**
 * It is toString method used to return the textual representation of 
 * @return string which contains count, listStack
 */
    @Override
    public String toString() {
        return "ArrayListStack{" + "count=" + count + ", listStack=" + listStack + '}';
    }

}
