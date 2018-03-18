public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Heater x = new Heater();

        //x.getTemperature();
        System.out.println(x.getTemperature());
        x.Warmer();
        System.out.println(x.getTemperature());
        x.setIncrement(2);
        x.Cooler();
        System.out.println(x.getTemperature());
        x.setIncrement(200);
        x.Warmer();
        System.out.println(x.getTemperature());
	}

}
