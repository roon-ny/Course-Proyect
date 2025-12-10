package App.Model;

import App.Model.DailyRecord;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class Database {

    private static final String FILE_PATH = "daily_records.json";

    private static ArrayList<DailyRecord> recordList = new ArrayList<>();

    public static void loadRecords() {
        try (FileReader reader = new FileReader(FILE_PATH)) {
            Type listType = new TypeToken<ArrayList<DailyRecord>>(){}.getType();
            recordList = new Gson().fromJson(reader, listType);

            if (recordList == null) recordList = new ArrayList<>();

        } catch (IOException e) {
            recordList = new ArrayList<>();
        }
    }

    private static void saveRecords() {
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            new Gson().toJson(recordList, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addRecord(DailyRecord record) {
        recordList.add(record);
        saveRecords();
    }

    public static ArrayList<DailyRecord> getRecords() {
        return recordList;
    }
}