public class Park {
    public static void main(String[] args) {
        Park park = new Park();
        Park.Attractions attraction1 = new Park.Attractions("Аттракцион 1", "10:00 - 18:00", 100);
        Park.Attractions attraction2 = new Park.Attractions("Аттракцион 2", "12:00 - 19:00", 150);
        System.out.println(attraction1.getName());
        System.out.println(attraction1.getTime());
        System.out.println(attraction2.getCost());
        attraction1.setName("Новое название");
        System.out.println(attraction1.getName());
        attraction1.setTime("Новое время");
        System.out.println(attraction1.getTime());
        attraction2.setCost("Новая цена");
        System.out.println(attraction2.getCost());
        System.out.println(park);
    }
    public static class Attractions {
        private String name;
        private String time;
        private double cost;
        public Attractions (String name, String time, double cost) {
            this.name = name;
            this.time = time;
            this.cost = cost;
        }
        public String getName() {
            return name;
        }
        public void setName (String name) {
            this.name = name;
        }
        public String getTime() {
            return time;
        }
        public void setTime (String time) {
            this.time = time;
        }
        public double getCost() {
            return cost;
        }
        public void setCost(double cost) {
            this.cost = cost;
        }
    }
}
