package net.javaguides;

import java.io.*;

public class SerialDemo {

    public static void main(String[] args)
            throws Exception
    {

        Save obj = new Save();
        obj.i = 4;

        File f = new File("obj.text");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);


        FileInputStream fis = new FileInputStream(f);
        ObjectInput ois = new ObjectInputStream (fis);
        Save obj1 =  (Save) ois.readObject();

        System.out.println(obj1.i);
    }
}
