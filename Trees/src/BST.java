public class BST {

    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }

    private Node root;

    public BST(){}

    public int height(Node node)
    {
        if(node == null){
            return -1;
        }

        return node.height;
    }


    public boolean isEmpty(){
        return root == null;
    }

    public void display(){
        display(root, "Root Node: ");
    }

    public void display(Node node, String details){
        if(node == null){
            return;
        }

        System.out.println(details + node.getValue());

        display(node.left, "Left child of "+node.getValue()+" : ");
        display(node.right, "Right child of "+node.getValue()+" : ");


    }

    public void prettyDisplay()
    {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level)
    {
        if(node == null)
            return;

        prettyDisplay(node.right, level + 1);

        if(level != 0)
        {
            for(int i=0;i<level-1;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|------>"+node.value);
        }
        else {
            System.out.println(node.value);
        }

        prettyDisplay(node.left,  level + 1);
    }

    public void insert(int val){

        root = insert(root, val);
    }

    private Node insert(Node node, int val)
    {
        //insert when node becomes null
        if(node == null)
        {
            Node new_node = new Node(val);
            return new_node;
        }

        // go right if val greater than node
        if(val > node.getValue()){
            node.right = insert(node.right, val);
        }

        if(val <node.getValue()){
            node.left = insert(node.left,val);
        }

        node.height =  Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }


    public void populate(int[] nums){
        for(int i=0; i< nums.length; i++)
        {
            this.insert(nums[i]);
        }
    }
    public boolean balanced(){
        return balanced(root);
    }

    private  boolean balanced(Node node){

        if(node == null)
            return true;

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public static void main(String[] args) {
        BST tree = new BST();
        int[] nums = {5,2,7,1,4,6,9,8,3,10};
        tree.populate(nums);
//        tree.display();

        tree.prettyDisplay();
    }

}
