public class DataModel {
    private String data;

    public DataModel() {
        this.data = "Initial Data";
    }

    public String getData(){
        return data;

    }

    public void setData(String data){
        this.data = data;
    }

    public void addMoreData(String moreData){
        this.data += " | " + moreData;
    }

}
