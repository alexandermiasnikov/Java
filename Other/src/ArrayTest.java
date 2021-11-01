public class ArrayTest {
    public static void main(String[] args) {

        String procId = "1";
        String[] tableNames = {"name1", "name2"};

        checkMongoArray(procId, tableNames);

    }

    public static int checkMongoArray(String procId, String[] tableNames){

        for(String tableName : tableNames){

            System.out.println(tableName);

        }
        return 1;
    }

    public int checkMongoArray(String procId){
        return checkMongoArray(procId, new String[]{" "});
    }

}
