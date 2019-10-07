package Maze_DS;

import asset.Cheese;
import asset.Maze;

/**
 * This MazeRunner class it contains main method it is used to set the size of
 * the output maze screen
 *
 * @author zeke
 * @version 1/23/2019
 */
public class MazeRunner {

    /**This is main method used to run all the class.
     * 
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Maze maze = new Maze(9, 16);
        maze.printWorld(new Mouse(), new Cheese()).show();
    }

}
