

public class Main {
    public static void main(String[] args) {
        DataModel dataModel = new DataModel();
        ConsoleView consoleView = new ConsoleView();
        DataPresenter dataPresenter = new DataPresenter(dataModel, consoleView);

        dataPresenter.updateData();
    }
}