package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "usertest")
    public Object[][] getData(){
        Object[][] data= new Object[][]{
                { "FMLNameee","ESS" ,"Qwerty Qwerty LName"," Enabled" },
//                { "Cassidy.Hope"," ESS" ,"Cassidy Hope ","Enable "},
//                { "Nina.Patel"," ESS" ,"Nina Patel","Enable"},
//                {"Odis.Adalwin", "Admin Odis", "Adalwin", "Enable" }
        };
        return data;
    }



}



