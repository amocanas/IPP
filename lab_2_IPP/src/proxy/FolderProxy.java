package proxy;

/**
 * Created by Alina on 26/09/2016.
 */
public class FolderProxy implements IFolder {

    Folder folder;
    User user;

    public FolderProxy(User user) {
        this.user = user;
    }

    public void PerformOperations() {

        if(user.getUserName().equalsIgnoreCase("arpit") && user.getPassword().equalsIgnoreCase("arpit"))
        {
            folder=new Folder();
            folder.PerformOperations();
        }
        else
        {
            System.out.println("You don't have access to this folder");
        }
    }
}
