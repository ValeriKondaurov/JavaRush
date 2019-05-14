package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("c:\\java\\name.txt", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            javaRush.users.add(new User());
            javaRush.users.get(0).setFirstName("Ivan");
            javaRush.users.get(0).setLastName("Ivanov");
            javaRush.users.get(0).setMale(true);
            javaRush.users.get(0).setBirthDate(new Date());
            javaRush.users.get(0).setCountry(User.Country.RUSSIA);
            javaRush.users.add(new User());
            javaRush.users.get(1).setFirstName("Petra");
            javaRush.users.get(1).setLastName("Frank");
            javaRush.users.get(1).setMale(false);
            javaRush.users.get(1).setBirthDate(new Date());
            javaRush.users.get(1).setCountry(User.Country.OTHER);

            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            javaRush.save(outputStream);
            outputStream.flush();
            outputStream.close();


            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            if (javaRush.equals(loadedObject))
                System.out.println("Прочитанный объект соответствует записаному" );
            else System.out.println("Прочитанный объект НЕ соответствует записаному" );

            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны

            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter printWriter = new PrintWriter(outputStream);
            if (users.size()>0)
                for(User u:users) {
                    u.save(printWriter);
                }


        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while (reader.ready()) {
                users.add(new User());
                users.get(users.size() - 1).load(reader);
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
