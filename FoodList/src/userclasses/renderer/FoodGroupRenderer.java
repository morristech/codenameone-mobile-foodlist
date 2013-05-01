/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userclasses.renderer;

import com.codename1.io.Log;
import com.codename1.ui.*;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.list.ListCellRenderer;
import com.codename1.ui.util.Resources;
import java.io.IOException;
import userclasses.model.FoodGroupClass;

/**
 *
 * @author Danilo
 */
public class FoodGroupRenderer  extends Container implements ListCellRenderer{
    
    private static int BGCOLOR = 223;

    private Label pic = new Label("");
    private Label name = new Label("");

    private Label focus = new Label("");

    public FoodGroupRenderer() {

        setLayout(new BorderLayout());

        addComponent(BorderLayout.WEST, pic);

        Container cnt = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        
        name.getStyle().setBgTransparency(0);
        name.getStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD,
                Font.SIZE_SMALL));

        cnt.addComponent(name);

        addComponent(BorderLayout.CENTER, cnt);
        focus.getStyle().setBgTransparency(100);
    }
    
    public Component getListCellRendererComponent(List list, Object value, int index, boolean isSelected) {
        
        FoodGroupClass foodGroup = (FoodGroupClass) value;

        name.setText(foodGroup.getName());
        
        try {
            
            Image imageFoodGroup = Resources.open("/theme.res").getImage(foodGroup.getIcon());
            pic.setIcon(imageFoodGroup);
            
        } catch (IOException ex) {
            Log.p("FoodGroupRenderer::getListCellRendererComponent", Log.ERROR);
            Log.p("ERROR: ".concat(FoodGroupRenderer.class.getName()).concat(" - ").concat(ex.getMessage()), Log.ERROR);
        }

        if (isSelected) {
            setFocus(true);
            getStyle().setBgTransparency(100);
            getStyle().setBgColor(FoodGroupRenderer.BGCOLOR);
            
        } else {
            setFocus(false);
            getStyle().setBgTransparency(60);
            getStyle().setBgColor(20);
        }
        return this;
    }

    public Component getListFocusComponent(List list) {
        return focus;
    }
    
}
