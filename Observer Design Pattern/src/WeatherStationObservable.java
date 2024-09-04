interface WeatherStationObservable {
    List<DisplayObserver> observerList;
    public void add(DisplayObserver obj);
    public void remove(DisplayObserver obj);
    public void notifyTemp();
    public void setTemp();
}
