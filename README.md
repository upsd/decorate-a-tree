# Decorate a Tree
This repo demonstrates the decorator pattern.

## How it works
There are two implementations of the [Tree](./src/main/java/Tree.java) in this project. They both implement the
`tellMe()` method that provides a little sentence describing the tree.

The below shows an example of the decorator pattern in use:
```java
// Create Simple tree
SimpleTree myTree = new SimpleTree();

// Returns "I am a tree"
myTree.tellMe();

// Create Oak tree, passing myTree as an argument so we can decorate
OakTree oaky = new OakTree(myTree);

// Returns "I am a tree and I am made out of Oak"
oaky.tellMe();
```

Now in the above example we are using the decorator pattern to enhance the behaviour implemented in 
[Simple Tree](./src/main/java/SimpleTree.java) without having to change anything in that class. This is achieved via
decoration in [Oak Tree](./src/main/java/OakTree.java) to enhance the `String` returned from `tellMe()` when it is
called on the instance passed into `OakTree`, as seen below:
```java
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
```

## Run the tests
To run the [tests](./src/test/java/DecoratingTreeTests.java), run the below from the project root:

    $ ./gradlew test