import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num13305
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int city = 0;
        st = new StringTokenizer(br.readLine());
        city = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int load[] = new int[city-1];
        int oil[] = new int[city];
        int temp = 0;
        int result = 0;
        for(int i=0;i<city-1;i++)
            load[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<city;i++)
            oil[i] = Integer.parseInt(st.nextToken());
        for(int i=0;i<city-1;i++)
        {
            result += oil[i] * load[i];
            if(oil[i]<=oil[i+1])
            {
                temp = oil[i];
                oil[i] = oil[i+1];
                oil[i+1] = temp;
            }
        }
        System.out.println(result);
    }
}

