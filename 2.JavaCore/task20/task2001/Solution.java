package com.javarush.task.task20.task2001;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Читаем и пишем в файл: Human
*/
public class Solution {
    public static void main(String[] args) {
        //исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File file = File.createTempFile("Human.txt", null);
            OutputStream outputStream = new FileOutputStream(file);
            InputStream inputStream = new FileInputStream(file);

            Human ivanov = new Human("Ivanov", new Asset("home", 999_999.99), new Asset("car", 2999.99));
            ivanov.save(outputStream);
            outputStream.flush();
            outputStream.close();
            Human somePerson = new Human();
            somePerson.load(inputStream);
            inputStream.close();
            if (somePerson.equals(ivanov))
                System.out.println("Прочитанный объект соответствует записаному" );
            else System.out.println("Прочитанный объект НЕ соответствует записаному" );

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {
            if (name != null) {
                PrintWriter printWriter = new PrintWriter(outputStream);
                printWriter.println(name);
                printWriter.flush();
                if (assets.size()>0) {
                    printWriter.println("yes");
                    printWriter.flush();
                    for (Asset a : assets)
                        a.save(printWriter);
                } else printWriter.println("no");
                printWriter.flush();
                printWriter.close();
            }
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            name = bufferedReader.readLine();
            if (bufferedReader.readLine().equals("yes")) {
                while (bufferedReader.ready()) {
                    assets.add(new Asset());
                    assets.get(assets.size()-1).load(bufferedReader);
                }
            }
        }
    }
}
