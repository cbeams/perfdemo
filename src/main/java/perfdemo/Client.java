package perfdemo;

import org.springframework.web.client.RestTemplate;

public class Client {

    public static void main(String[] args) {
        RestTemplate client = new RestTemplate();
        long msStart = System.currentTimeMillis();
        int nReqests = 100;
        for (int i = 0; i < nReqests; i++)
            client.getForObject("http://localhost:8080?n="+i, String.class);
        long msEnd = System.currentTimeMillis();
        long msTotal = msEnd - msStart;
        System.out.println("n requests: " + nReqests);
        System.out.println("total ms:   " + msTotal);
        System.out.println("ms per req: " + (float)msTotal/nReqests);
    }
}
