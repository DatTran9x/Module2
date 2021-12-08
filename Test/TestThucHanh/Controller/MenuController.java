package Test.TestThucHanh.Controller;

import Test.TestThucHanh.View.FunctionView;
import Test.TestThucHanh.View.GetAndAlert;
import Test.TestThucHanh.View.Menu;

public class MenuController {
    Menu menu = new Menu();
    static FunctionView functionView = new FunctionView();
    static GetAndAlert getAndAlert = new GetAndAlert();

    public void menu() {
        while (true) {
            switch (menu.mainMenu()) {
                case "1":
                    functionView.showdMenu();
                    break;
                case "2":
                    functionView.addMenu();
                    break;
                case "3":
                    functionView.editMenu();
                    break;
                case "4":
                    functionView.deleteMenu();
                    break;
                case "5":
                    functionView.sortMenu();
                    break;
                case "6":
                    functionView.getMenu();
                    break;
                case "7":
                    functionView.saveMenu();
                    break;
                case "8":
                    System.exit(8);
                default:
                    getAndAlert.alertChoose();
            }
        }
    }
}
