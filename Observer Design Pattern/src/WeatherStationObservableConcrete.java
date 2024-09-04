public class WeatherStationObservableConcrete implements WeatherStationObservable{
    List<DisplayObserver> displayList;
    int temp;
    @Override
    public void add(DisplayObserver obj) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void remove(DisplayObserver obj) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setTemp() {
        // TODO Auto-generated method stub
        temp= temp+10;
        notify();
        
    }

    @Override
    public void notifyTemp() {
        // TODO Auto-generated method stub
        
    }
    
}
