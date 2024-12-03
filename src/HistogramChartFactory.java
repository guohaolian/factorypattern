public class HistogramChartFactory implements Factory{
    public Chart createChart() {
        Chart chart = new HistogramChart();
        System.out.println("初始化设置柱状图！");
        return chart;
    }
}
