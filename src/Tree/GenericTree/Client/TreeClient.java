package Tree.GenericTree.Client;

import Tree.GenericTree.Model.Node;
import Tree.GenericTree.services.constructor.AbstractConstructor;
import Tree.GenericTree.services.linearize.Linearize;
import Tree.GenericTree.services.removeLeaves.RemoveLeaves;
import Tree.GenericTree.services.traversal.Traversal;
import Tree.GenericTree.services.display.DisplayTree;
import Tree.GenericTree.services.height.TreeHeight;
import Tree.GenericTree.services.maxOfTree.TreeMax;
import Tree.GenericTree.services.mirror.TreeMirror;
import Tree.GenericTree.services.size.TreeSize;
import Tree.GenericTree.Model.NodeWithLevel;
import Tree.GenericTree.services.treeViews.View;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class TreeClient {
    public static void main(String[] args) {

        //input 1
        int[] input = new int[]{10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 180, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        // Creating tree with input1
        final Function<int[], Node<Integer>> constructTree = AbstractConstructor::construct;
        Node<Integer> root = constructTree.apply(input);

        //input 2
        int[] input1 = new int[]{10, 20, 50, -1, 60, 70, -1, -1, -1, 30, 80, 90, 100, -1, -1, -1, -1, 40, -1};
        // Creating tree with input2
        final Function<int[], NodeWithLevel<Integer>> constructTreeHavingNodeWithLevel = AbstractConstructor::constructNodeWithLevel;
        NodeWithLevel<Integer> rootWithLevel = constructTreeHavingNodeWithLevel.apply(input1);

        //Initializing consumer for displaying tree made for input 1
        DisplayTree<Integer> displayTree = new DisplayTree<>();
        final Consumer<Node<Integer>> display = displayTree::display;

        //Initializing consumer for displaying tree made for input 2
        DisplayTree<Integer> displayTreeForInput2 = new DisplayTree<>();
        Consumer<NodeWithLevel<Integer>> dispTreeForInput2 = displayTreeForInput2::displayNodeHavingLevel;

        //Initializing View object
        //This can be used to display leftView, Right View, etc. of the tree
        View<Integer> view = new View<>();

        while (true) {
            System.out.println();
            System.out.println("1.Display Tree 2.Size Of tree 3.Height of tree 4.Max of tree 5.Traversal 6. Mirror 7.Without Leaves 8.Linearize 9.View 10.exit");
            System.out.println();
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {

                case 1:
                    display.accept(root);
                    break;

                case 2:
                    TreeSize<Integer> treeSize = new TreeSize<>();
                    Function<Node<Integer>, Integer> findSize = treeSize::size;
                    System.out.println("Size of tree is: " + findSize.apply(root));
                    break;

                case 3:
                    TreeHeight<Integer> treeHeight = new TreeHeight<>();
                    Function<Node<Integer>, Integer> findHeight = treeHeight::height;
                    System.out.println("Height of tree is: " + findHeight.apply(root));
                    break;

                case 4:
                    TreeMax<Integer> maxOfTree = new TreeMax<>();
                    Function<Node<Integer>, Integer> max = maxOfTree::max;
                    System.out.println("Max of tree is: " + max.apply(root));
                    break;

                case 6:
                    TreeMirror<Integer> treeMirror = new TreeMirror<>();
                    Consumer<Node<Integer>> mirrorTree = treeMirror::getMirror;
                    mirrorTree.accept(root);
                    displayTree.display(root);
                    break;

                case 7:
                    RemoveLeaves<Integer> removeLeave = new RemoveLeaves<>();
                    Consumer<Node<Integer>> treeWithoutLeaves = removeLeave::removeLeaves;
                    treeWithoutLeaves.accept(root);
                    displayTree.display(root);
                    break;

                case 8:
                    Linearize<Integer> linearizeTree = new Linearize<>();
                    Consumer<Node<Integer>> linearTree = linearizeTree::linearize;
                    linearTree.accept(root);
                    displayTree.display(root);
                    break;

                case 10:
                    System.exit(0);

                case 5:
                    System.out.println("11.PreOrderTraversal 12.PostOrderTraversal 13.LevelOrderTraversal 14.LevelOrderTraversalZigZag 15.Go to main menu");
                    switch (scanner.nextInt()) {
                        case 11:
                            Traversal<Integer> preOrderTraversal = new Traversal<>();
                            Consumer<Node<Integer>> preTraverse = preOrderTraversal::preOrdertraverse;
                            preTraverse.accept(root);
                            System.exit(0);

                        case 12:
                            Traversal<Integer> postOrderTraversal = new Traversal<>();
                            Consumer<Node<Integer>> postTraverse = postOrderTraversal::postOrderTraverse;
                            postTraverse.accept(root);
                            System.exit(0);

                        case 13:
                            Traversal<Integer> levelOrderTraversal = new Traversal<>();
                            Consumer<Node<Integer>> levelTraverse = levelOrderTraversal::levelOrderTraverse;
                            levelTraverse.accept(root);
                            System.exit(0);
                        case 14:
                            Traversal<Integer> levelOrderTraversalZigZag = new Traversal<>();
                            Consumer<Node<Integer>> levelTraverseZigZag = levelOrderTraversalZigZag::levelOrderTraverseZigZag;
                            levelTraverseZigZag.accept(root);
                            System.exit(0);
                        case 15:
                            System.exit(0);
                        default:
                            System.out.println("Invalid input");
                            System.exit(0);
                    }

                case 9:
                    System.out.println("11.LeftView 12.RightView 13. exit");
                    switch (scanner.nextInt()) {
                        case 11:
                            System.out.println("Complete Tree");
                            dispTreeForInput2.accept(rootWithLevel);
                            System.out.println();
                            System.out.println();
                            System.out.println("LeftView:");
                            Consumer<NodeWithLevel<Integer>> leftView = view::leftView;
                            leftView.accept(rootWithLevel);
                            System.out.println();
                            break;

                        case 12:
                            System.out.println("Complete Tree");
                            dispTreeForInput2.accept(rootWithLevel);
                            System.out.println();
                            System.out.println();
                            System.out.println("RightView:");
                            Consumer<NodeWithLevel<Integer>> rightView = view::rightView;
                            rightView.accept(rootWithLevel);
                            System.out.println();
                            break;

                        case 13:
                            System.exit(0);
                        default:
                            System.exit(0);
                    }


            }
        }
    }
}
