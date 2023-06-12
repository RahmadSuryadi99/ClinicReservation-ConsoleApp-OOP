package view;

import com.sun.tools.javac.Main;
import service.TreatmenSchudleService;

public class TreatmenSchdule implements Menu {

    private static TreatmenSchdule instance = new TreatmenSchdule();

    public static TreatmenSchdule getInstance() {
        return instance;
    }
    @Override
    public void run() {
        TreatmenSchudleService.printAllSchdule();
        MainMenu.getInstance().run();
    }

}
