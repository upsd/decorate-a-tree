public class OakTree implements Tree {

    private final Tree treeToBeDecorated;

    public OakTree(Tree myTree) {
        this.treeToBeDecorated = myTree;
    }

    @Override
    public String tellMe() {
        return treeToBeDecorated.tellMe() + " and I am made out of Oak";
    }
}
