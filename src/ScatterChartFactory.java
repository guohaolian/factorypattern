public class ScatterChartFactory implements Factory{
    public Chart createChart(){
        Chart chart=new ScatterChart();
        System.out.println("初始化设置散点图！");
        return chart;
    }
}
