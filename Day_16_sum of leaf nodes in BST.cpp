class Solution
{
    public:
        /*You are required to complete below method */
        int sumOfLeafNodes(Node *root ){
            int sumL,sumR;
             if(root==NULL){
                 return 0;
             }
             if(root->left==NULL && root->right==NULL){
                 return root->data;
             }
             sumL=sumOfLeafNodes(root->left);
             sumR=sumOfLeafNodes(root->right);
            
            return sumL+sumR; 
             
        }
};