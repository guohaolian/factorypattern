public class Client {
    public static void main(String[] args) {
        Factory factory;
        Chart chart;
        factory=(Factory)XMLUtil.getBean();
        chart=factory.createChart();
        chart.display();

    }
}
