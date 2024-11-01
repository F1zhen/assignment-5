

public class DataPresenter {
    private final DataModel dataModel;
    private final ConsoleView consoleView;

    public DataPresenter(DataModel dataModel, ConsoleView consoleView){
        this.dataModel = dataModel;
        this.consoleView = consoleView;
    }

    public void updateData() {
        consoleView.displayData(dataModel.getData());

        String newData = consoleView.getInput("Enter new data: ");
        dataModel.setData(newData);
        consoleView.displayData("new data: " + dataModel.getData());

        String moreData = consoleView.getInput("Enter another piece of data: ");
        dataModel.addMoreData(moreData);
        consoleView.displayFinalData(dataModel.getData());
    }

}
