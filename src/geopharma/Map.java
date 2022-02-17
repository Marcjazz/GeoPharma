/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geopharma;

import com.teamdev.jxbrowser.browser.Browser;
import com.teamdev.jxbrowser.engine.Engine;
import com.teamdev.jxbrowser.engine.EngineOptions;
import static com.teamdev.jxbrowser.engine.RenderingMode.HARDWARE_ACCELERATED;
import com.teamdev.jxbrowser.view.swing.BrowserView;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author media
 */
public class Map {
    public void open_Map(){
        Engine engine = Engine.newInstance(EngineOptions.newBuilder(HARDWARE_ACCELERATED).licenseKey("1BNDHFSC1G1RS20CDAMUELEYHH92MEMUNA6H2ZTADSHKFOJ6HS6O6RMRN61OA899UBZDWS ").build());
        System.setProperty("jxbrowser.license.key", "1BNDHFSC1G1RS20CDAMUELEYHH92MEMUNA6H2ZTADSHKFOJ6HS6O6RMRN61OA899UBZDWS ");
        Browser browser = engine.newBrowser();
        SwingUtilities.invokeLater(() -> {
            BrowserView view = BrowserView.newInstance(browser);
            JFrame frame = new JFrame("Geoloc Pharmacie");
            frame.add(view, BorderLayout.CENTER);
            frame.setSize(700, 500);
            frame.setVisible(true);
            browser.navigation().loadUrl("G:\\IAI2022\\POD\\GeoPharma\\src\\geopharma\\Map.html");
        });
        
    }
    public static void main(String[] args){
        Map map = new Map();
        map.open_Map();
    }
}
