import org.junit.Test;
import java.lang.*;

public class ReadFile {

    @Test
    public void main1() throws Exception {

        Calkulate sum = new Calkulate();
        sum.Summ("data_file.txt");
    }

    @Test
    public void main2() throws Exception {

        Calkulate razn = new Calkulate();
        razn.Razn("data_file.txt");
    }

    @Test
    public void main3() throws Exception {

        Calkulate delenie = new Calkulate();
        delenie.Delen("data_file.txt");
    }

    @Test
    public void main4() throws Exception {

        Calkulate umn = new Calkulate();
        umn.Proizv("data_file.txt");
    }
}
