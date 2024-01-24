public class Main {



        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            MyTree aTree = new MyTree();

            aTree.insert(20);
            aTree.insert(10);
            aTree.insert(30);
            aTree.insert(5);
            aTree.insert(15);
            aTree.insert(25);
            aTree.insert(31);

            aTree.preorder();
            aTree.inorder();
            aTree.postorder();

        }

    }

