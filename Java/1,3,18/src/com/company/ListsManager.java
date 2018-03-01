package com.company;


    import java.util.*;

    public class ListsManager {

        public ArrayList<String> highPriority, lowPriority;  // the two lists of tasks
        public TaskListGUI controller; // a reference to the main program, with the GUI

        /* Constructs a ListManager object. */
        public ListsManager(TaskListGUI ref) {
            // (you should not change the code in this method)
            controller = ref;
            initialiseLists();
        }

        /* Initialises both lists, to initially be empty. */
        public void initialiseLists() {


        }


        /* Adds the given task to the end of the low-priority list.
         */
        public void addTask(String task) {


        }

        /* Removes the given task to the end of the high-priority list.
         * The index integer gives the current position of the task in
         * the relevant list of tasks. (You can assume that index is a
         * valid position in the relevant list.)
         */
        public void removeLowPriorityTask(int index) {


        }


        /* Removes the given task from the high-priority list.
         * The index integer gives the current position of the task in
         * the relevant list of tasks. (You can assume that index is a
         * valid position in the relevant list.)
         */
        public void removeHighPriorityTask(int index) {


        }

        /* Changes the priority of the given task.
         * The given boolean important indicates the previous priority
         * of the task. e.g. if important is true, then the task was
         * a high-priority task.
         * The index integer gives the current position of the task in
         * the relevant list of tasks. (You can assume that index is a
         * valid position in the relevant list.)
         */
        public void changePriority(boolean important, int index) {


        }

        /* Produces a string that can be used to save the task lists. */
        public String toString() {
            String s = "High Priority Tasks";

            return s;  // dummy return value (before this method is implemented)
        }

        /* Pushes an important task one higher up.
         * The index gives the current position of the task in the
         * highPriority list. (You can assume that index is a
         * valid position in the highPriority list.)
         */
        public void promote(int index) {


        }
    }

