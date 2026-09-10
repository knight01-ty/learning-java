import java.io.File;

class FileDemo {

    public static void main(String[] args) {

        File file = new File("C:/Java/abc.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
            System.out.println("Error occurred.");
        }

        System.out.println("Exists = " + file.exists());
        System.out.println("Is Directory = " + file.isDirectory());
        System.out.println("Is File = " + file.isFile());
        System.out.println("Name = " + file.getName());
        System.out.println("Absolute Path = " + file.getAbsolutePath());
    }
}
