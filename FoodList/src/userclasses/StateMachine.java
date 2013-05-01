/**
 * Your application code goes here
 */
package userclasses;

import com.codename1.analytics.AnalyticsService;
import com.codename1.io.Log;
import com.codename1.ui.*;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.geom.Dimension;
import com.codename1.ui.util.Resources;
import com.ncc.foddlist.conf.ApplicationConfig;
import generated.StateMachineBase;
import java.io.IOException;
import userclasses.model.FoodGroupClass;
import userclasses.renderer.FoodGroupRenderer;
import userclasses.renderer.FoodInfoRenderer;

/**
 *
 * @author Your name here
 */
public class StateMachine extends StateMachineBase {

    public StateMachine(String resFile) {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
    }

    @Override
    protected boolean initListModelList(List cmp) {
        cmp.setModel(FoodGroupClass.MILK_LIST);
        cmp.setRenderer(new FoodInfoRenderer());
        return true;
    }

    @Override
    protected boolean initListModelComboBoxFoodGroupList(List cmp) {
        cmp.setModel(FoodGroupClass.FOOD_GROUP_LIST_MODEL);
        cmp.setRenderer(new FoodGroupRenderer());
        return true;
    }

    @Override
    protected void onMain_ComboBoxFoodGroupListAction(Component c, ActionEvent event) {

        int selected = ((ComboBox) c).getModel().getSelectedIndex();
        //System.out.println(selected);

        if (selected == FoodGroupClass.MILK_INDEX) {
            this.findList().setModel(FoodGroupClass.MILK_LIST);
        } else if (selected == FoodGroupClass.FRUIT_INDEX) {
            this.findList().setModel(FoodGroupClass.FRUIT_LIST);
        } else if (selected == FoodGroupClass.DRIED_FRUIT_INDEX) {
            this.findList().setModel(FoodGroupClass.DRIED_FRUIT_LIST);
        } else if (selected == FoodGroupClass.VEGETABLE_A_INDEX) {
            this.findList().setModel(FoodGroupClass.VEGETABLE_A_LIST);
        } else if (selected == FoodGroupClass.VEGETABLE_B_INDEX) {
            this.findList().setModel(FoodGroupClass.VEGETABLE_B_LIST);
        } else if (selected == FoodGroupClass.CEREAL_INDEX) {
            this.findList().setModel(FoodGroupClass.CEREAL_LIST);
        } else if (selected == FoodGroupClass.LEGUM_INDEX) {
            this.findList().setModel(FoodGroupClass.LEGUM_LIST);
        } else if (selected == FoodGroupClass.MEAT_1_INDEX) {
            this.findList().setModel(FoodGroupClass.MEAT_1_LIST);
        } else if (selected == FoodGroupClass.MEAT_2_INDEX) {
            this.findList().setModel(FoodGroupClass.MEAT_2_LIST);
        } else if (selected == FoodGroupClass.MEAT_3_INDEX) {
            this.findList().setModel(FoodGroupClass.MEAT_3_LIST);
        } else if (selected == FoodGroupClass.MEAT_4_INDEX) {
            this.findList().setModel(FoodGroupClass.MEAT_4_LIST);
        } else if (selected == FoodGroupClass.EGG_INDEX) {
            this.findList().setModel(FoodGroupClass.EGG_LIST);
        } else {
            this.findList().setModel(FoodGroupClass.MILK_LIST);
        }
    }

    @Override
    protected void onMain_BtnExitAction(Component c, ActionEvent event) {
        boolean close = Dialog.show("Sair", "Você realmente deseja sair?", "Sim", "Não");

        if (close) {
            System.exit(0);
        }
    }

    @Override
    protected void onMain_BtnAboutAction(Component c, ActionEvent event) {

        //boolean about = Dialog.show("Nutricomciencia",
        //        "Viviane Sakzenian - CRN/3 17394 - Alameda dos Vidoeiros, 455 piso 1 - Gramado Mall, Campinas/SP - (19) 2121-8088 - viviane@nutricomciencia.com.br",
        //        "Voltar", null);

        showForm("Splash", null);
    }

    @Override
    protected void postSplash(Form f) {

        Log.p("GoogleAnalytics::AnalyticsService.init", Log.INFO);

        AnalyticsService.init(
                ApplicationConfig.GOOGLE_ANALYTICS_SERVICE_UA, 
                ApplicationConfig.GOOGLE_ANALYTICS_SERVICE_DOMAIN);

        Log.p("GoogleAnalytics::AnalyticsService.init executed.", Log.INFO);

    }

    @Override
    protected void beforeSplash(Form f) {
        try {

            Image imageContactMap = Resources.open("/theme.res").getImage("mapa.png");
            
                  this.findContainerMapFrame().setSize(new Dimension(100, 100));
                  
                  //this.findLabelMap().setTactileTouch(true);
                  //this.findLabelMap().setSize(new Dimension(593, 471));  
                  
                  this.findLabelMap().setIcon(imageContactMap);
            
        } catch (IOException ex) {
            Log.p("ERROR: ".concat(this.findLabelMap().getName()).concat(" - ").concat(ex.getMessage()));
        }    
    }            
    
    @Override
    protected void onCreateSplash() {
        
  
    }
    
    
}
