package com.company;




class HomeAppLiancesStore{


    public    class  Fridge extends   HomeAppLiancesStore {
        private int with=setter(112);
        private int height=setter(11);
        private int vathos=setter(51);
        private String katasteasti=getter("---");
        private  String montelos=getter("redmi_-6ta");
        private String tupos=getter("Fringe");
        private  int tpd=setter(110);
        private int kg=setter(151);
        private int xoritikotita=setter(51);
        private  int max=setter(451);
        private int low=setter(01);
        private int price=2199;
        int count=1;
    }

    public   class washiMachine extends HomeAppLiancesStore {
        private int with=setter(124);
        private int height=setter(1);
        private int vathos=setter(5);
        private String katasteasti=getter("pitsos");
        private  String montelos=getter("plus4");
        private String tupos=getter("washmachine");
        private  int tpd=setter(2000);
        private int kg=setter(155);
        private int xoritikotita=setter(55);
        private  int max=setter(451);
        private int low=setter(10);
        private int price=599;
        int count=1;
    }
    public   class Oven extends HomeAppLiancesStore{
        private int with=setter(122);
        private int height=setter(21);
        private int vathos=setter(52);
        private String katasteasti=getter("1352");
        private  String montelos=getter("redmi fafa");
        private String tupos=getter("oven");
        private  int tpd=setter(1344);
        private int kg=setter(152);
        private int xoritikotita=setter(15);
        private  int max=setter(435);
        private int low=setter(90);
        private int price=499;
        int count=1;

    }
    public class AirCondition extends HomeAppLiancesStore{
        private int with=setter(12);
        private int height=setter(1);
        private int vathos=setter(5);
        private String katasteasti=getter("xiaomi");
        private  String montelos=getter("redmi plus");
        private String tupos=getter("AirCondition");
        private  int tpd=setter(1000);
        private int kg=setter(15);
        private int xoritikotita=setter(5);
        private  int max=setter(45);
        private int low=setter(0);
        private int price=299;
        int count=1;

    }


    int x;
    String name;
    String address;
    int y;
    String name2;
    public static String getter(String name2) {

        return name2;
    }
    public static int setter(int y) {

        return y;
    }

    public static int setX(int x) {

        return x;
    }

    public static String setName(String name) {

        return name;
    }
    public static String setAddress(String address) {

        return address;
    }

    public static void main (String[]args ){

        // write your code here

        String name=setName(args[0]);
        String addres=setAddress(args[1]);

        try{
            int x=setX(Integer.parseInt(args[2]));
            System.out.println( "oi employee einai:" + x);
        }
        catch(Exception e){
            System.out.println("Min apodekto  parametron eisosou");
            int x=0;
        }

        try{
            System.out.println(name);
        }
        catch(Exception e){
            System.out.println("Den uparxei parametron eisosou");
        }
        try{
            System.out.println(addres);
        }
        catch(Exception e){
            System.out.println("Den uparxei parametron eisosou");
        }
        try{
            System.out.println(args[2]);

        }
        catch(Exception e){
            System.out.println("Den uparxei parametron eisosou");
        }



    }




}
