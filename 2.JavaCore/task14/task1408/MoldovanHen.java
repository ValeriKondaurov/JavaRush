package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen implements Country{
    @Override
    public int getCountOfEggsPerMonth() {
        return 8;
    }

    @Override
    public String getDescription() {
        return super.getDescription()
                + " Моя страна - " + Country.MOLDOVA +
                ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
