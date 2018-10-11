package objects;

public class CountryInformation implements Country{
    String countryName;
    String presidentName;
    double population;

    public CountryInformation(String countryName, String presidentName, double population) {
        this.countryName = countryName;
        this.presidentName = presidentName;
        this.population = population;
    }

    public void showInfo(){
        System.out.println("Country "+this.getCountryname());
        System.out.println("President" +(this.getPresident()));
        System.out.println("Nr of people "+String.valueOf(this.getNrOfPeople()));
    }

    public String getCountryname(){
        return countryName;
    }
    public void setCountryname(String cn){
        this.countryName= cn;
    }

    public String getPresident(){
        return presidentName;
    }
    public void setPresident(String pr){
        this.presidentName=pr;
    }

    public double getNrOfPeople(){
        return this.population;
    }
    public void setNrOfPeople(double nrOfPeople){
        this.population=nrOfPeople;
    }
}
