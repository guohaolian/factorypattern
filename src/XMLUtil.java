import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XMLUtil {
    public static Object getBean(){

        //创建文档对象
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        try {
            builder = factory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src//config.xml"));
            //获取包含图表类型的文本结点
            NodeList nodeList = doc.getElementsByTagName("className");
            Node classnode = nodeList.item(0).getFirstChild();
            String className = classnode.getNodeValue();
           Class c=Class.forName(className);
           Object obj=c.newInstance();
           return obj;

        } catch (ParserConfigurationException | SAXException | IOException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }

    }
}
