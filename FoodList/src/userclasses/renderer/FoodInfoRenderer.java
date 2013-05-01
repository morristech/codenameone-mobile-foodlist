/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userclasses.renderer;

import com.codename1.ui.Component;
import com.codename1.ui.Container;
import com.codename1.ui.Font;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.list.ListCellRenderer;
import userclasses.model.FoodInfoClass;

/**
 *
 * @author Danilo
 */
public class FoodInfoRenderer extends Container implements ListCellRenderer {

    private static int BGCOLOR = 223;
    
    private Label pic = new Label("Picture");
    private Label name = new Label("");
    private Label measure = new Label("");

    private Label focus = new Label("");

    public FoodInfoRenderer() {

        setLayout(new BorderLayout());

        //addComponent(BorderLayout.WEST, pic);

        Container cnt = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        Container cntInfo = new Container(new BoxLayout(BoxLayout.X_AXIS));

        name.getStyle().setBgTransparency(0);
        name.getStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD,
                Font.SIZE_MEDIUM));

        measure.getStyle().setBgTransparency(0);
        measure.getStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_PLAIN,
                Font.SIZE_SMALL));

        cntInfo.addComponent(measure);

        cnt.addComponent(name);
        cnt.addComponent(cntInfo);

        addComponent(BorderLayout.CENTER, cnt);
        focus.getStyle().setBgTransparency(100);
    }

    public Component getListCellRendererComponent(com.codename1.ui.List list, Object value, int index, boolean isSelected) {

        FoodInfoClass food = (FoodInfoClass) value;

        name.setText(food.getName());

        measure.setText(food.getMeasure());

        if (isSelected) {
            setFocus(true);
            getStyle().setBgTransparency(100);
            getStyle().setBgColor(FoodInfoRenderer.BGCOLOR);
            
        } else {
            setFocus(false);
            getStyle().setBgTransparency(0);
        }
        return this;
                
    }

    public Component getListFocusComponent(com.codename1.ui.List list) {
        return focus;
    }
    
}
