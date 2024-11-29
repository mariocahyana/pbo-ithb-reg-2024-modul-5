package Main;

import Controller.KTPController;
import Model.KTPModel;
import View.KTPView;

public class Main {
    public static void main(String[] args) {
        KTPModel model = new KTPModel();
        KTPView view = new KTPView();
        new KTPController(model, view);
        view.setVisible(true);
    }
}
