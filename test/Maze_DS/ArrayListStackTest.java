/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maze_DS;

import Exceptions.EmptyCollectionException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This is ArrayListStackTest class used to test the arrayListStack It have five
 * methods to check such as push, pop ,stack ,isEmpty, and size
 *
 * @author Shaishav Maisuria
 * @version 2/20/2019
 */
public class ArrayListStackTest {

    /**
     * Test of push method, of class ArrayListStack. It tests whether stack
     * shows empty before and after adding, check the size increases or not
     * after adding
     *
     * @throws Exceptions.EmptyCollectionException
     */
    @Test
    public void testPush() throws EmptyCollectionException {

        ArrayListStack<String> instance = new ArrayListStack<>();
        //Test to see the element presence before adding any element
        assertTrue(instance.isEmpty());

        // Test to see the element is entered in the arraylist and 
        instance.push("One");
        assertFalse(instance.isEmpty());
        assertEquals(instance.size(), 1);
        instance.push("Two");
        instance.push("Three");

        //Test to see whether the added element increases it size
        assertEquals(instance.size(), 3);
        //does the top element is the same element which is pushed last
        try {
            assertEquals("Three", instance.peek());
        } catch (EmptyCollectionException e) {
            fail("Exception in push method");
        }

    }

    /**
     * Test of pop method, of class ArrayListStack. It tries to remove before
     * and after the element is added
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testPop() throws Exception {

        ArrayListStack<String> instance = new ArrayListStack<>();
        // Test to remove the element before adding it
        try {
            instance.pop();
            fail("The peek fails");
        } catch (EmptyCollectionException e) {
            System.out.println("Expected gets into the exception");
            assertTrue(e instanceof EmptyCollectionException);
        }

        //Test after adding the element can we remove 
        //the same object and also checking the size
        instance.push("Hello World");
        instance.push("World");

        try {

            String s = instance.pop();
            assertFalse(instance.isEmpty());
            assertEquals(s, "World");
            assertEquals(instance.toString(),"ArrayListStack{count=1, listStack=[Hello World]}");
            assertEquals(1,instance.size());
        } catch (EmptyCollectionException e) {
            System.out.println("Problem: gets into exception");
            fail("caught exception that shouldnt happen");
        }
        try {

            String s = instance.pop();
            assertTrue(instance.isEmpty());
            assertEquals(s, "Hello World");
            assertEquals(0,instance.size());
        } catch (EmptyCollectionException e) {
            System.out.println("Problem: gets into exception");
            fail("caught exception that shouldnt happen");
        }

    }

    /**
     * Test of peek method, of class ArrayListStack. It test to peek before and
     * after adding the element in Stack list It also check which element are we
     * seeing and does peeking makes any changes to stack
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testPeek() throws Exception {
        //Test to see the object before adding the element in stacklist
        ArrayListStack<String> instance = new ArrayListStack<>();
        try {
            instance.peek();
            fail("This is not supposed to executed");
        } catch (EmptyCollectionException e) {
            System.out.println("Everything is fine");
            assertTrue(instance.isEmpty());
        }

        //Test to see whether peeking makes any changes in size of stack
        instance.push("One");
        assertEquals(1, instance.size());
        assertEquals("One", instance.peek());
        assertEquals(1, instance.size());

        //Test to see the top most part of stack is viewed
        instance.push("Two");
        assertEquals("Two", instance.peek());
    }

    /**
     * Test of isEmpty method, of class ArrayListStack. It checks whether the
     * list is empty or not before and after adding element
     */
    @Test
    public void testIsEmpty() {
        //Test to see before and after adding the element whether it is empty or not
        ArrayListStack<String> instance = new ArrayListStack<>();
        assertTrue(instance.isEmpty());
        instance.push("one");
        assertFalse(instance.isEmpty());
    }

    /**
     * Test of size method, of class ArrayListStack. check size before and after
     * adding the element
     */
    @Test
    public void testSize() {
        //Test to check the size before and after adding the element
        ArrayListStack instance = new ArrayListStack();

        assertEquals(0, instance.size());
        instance.push("one");
        assertEquals(1, instance.size());
        try {
            instance.pop();
            assertEquals(0, instance.size());
        } catch (EmptyCollectionException e) {
            fail("The size test has problem");
        }
    }

}
