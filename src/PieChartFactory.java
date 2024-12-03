public class PieChartFactory implements  Factory{
    public Chart createChart(){
        Chart chart = new PieChart();
        return chart;
    }
}
