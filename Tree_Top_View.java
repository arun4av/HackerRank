/*
   class Node 
       int data;
       Node left;
       Node right;
*/

ArrayList<Integer> left(Node root)
{
    ArrayList<Integer> A=new ArrayList<Integer>();
    if(root.left==null)
    {
        A.add(root.data);
        return A;
    }
    A=left(root.left);
    A.add(root.data);
    return A;
}

void top_view(Node root)
{
    ArrayList<Integer> A=new ArrayList<Integer>();
    A=left(root);
    while(root.right!=null)
    {
        root=root.right;
        A.add(root.data);
    }
    for(int val: A)
        System.out.print(val+" ");
}