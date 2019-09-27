package com.company;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main {

    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        
        int sayi = BURAYA FAKTORİYELİNİ BULMAK İSTEDİĞİNİZ SAYIYI GİRİN;

        String islem = "";
        
        for (int i = 1; i < sayi+1; i++) { //Bu for döngüsü işlemi hazırlamak için yapılıyor
            islem = islem+i+"*";
        }
        islem = islem.substring(0,islem.length()-1); //Bu substring işlemi algoritmanın doğru çalışmasını sağlamakta
        Object result = engine.eval(islem); //Veri işleniyor ve bilgiye dönüştürülüyor
        System.out.print(result); //Bilgi kullanıcıya aktarılıyor
    }
}
