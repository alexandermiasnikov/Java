public class Balance {
    public static void main(String[] args) {
        String ans = "";
        String [] answers = {"{\"Ref\":\"12345678\",\"State\":\"y\",\"CardPan\":\"4149437740090293\",\"BaseAccount\":{\"isOnline\":true,\"Overdraft\":0.00,\"MinPay\":8730.17,\"MinPaySM\":8730.17,\"AccNumber\":\"4149437740090293980\",\"CreditLimit\":0.00,\"sumForSave\":0,\"sign\":true,\"flag_delay\":false,\"calculationDate\":\"03.09.2020\",\"hasTransactionInDayCalc\":false,\"LimitAcc\":[]},\"BonusPlus\":{\"Currency\":980,\"BonusSumm\":0.00}}",
            "{\"message\":\"org.springframework.security.authentication.InternalAuthenticationServiceException\",\"exceptionClass\":\"org.springframework.security.authentication.InternalAuthenticationServiceException\",\"exceptionText\":\"java.net.SocketTimeoutException: Read timed out\",\"code\":401,\"status\":401,\"errorId\":\"AUTHENTICATION_ERROR\"}",
        "{\"Ref\":\"12345678\",\"State\":\"y\",\"CardPan\":\"88009600024194\",\"BaseAccount\":{\"isOnline\":true,\"Overdraft\":0.00,\"Currency\":980,\"Remain\":-557.58,\"Avail\":-557.58,\"MinPay\":557.58,\"MinPaySM\":557.58,\"AccNumber\":\"88009600024194980\",\"sign\":true,\"flag_delay\":false,\"calculationDate\":\"27.08.2020\",\"hasTransactionInDayCalc\":false}}"};

        for(String answer : answers){
            ans = "";
            String[] ex = answer.split("\"");

            for (int i = 0; i < ex.length; i++){

                if (ex[i].contains("CardPan")) {

                    ans += ex[i + 2] + "][";

                }

                if (ex[i].contains("Remain") && !ex[i].contains("FullRemain")) {

                    ans += ex[i + 1].substring(1, ex[i + 1].length() - 1) + "][" + " ";

                }

                if(ex[i].contains("errorId")){

                    ans += " " + "][" + " " + "][" + ex[i + 2];

                }
            }

            if (!answer.contains("Remain") && !answer.contains("errorId")){

                ans += " " + "][" + "no Remain";

            }

            System.out.println(ans);

        }
    }
}
