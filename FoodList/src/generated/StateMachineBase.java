/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.util.*;
import com.codename1.ui.plaf.*;
import com.codename1.ui.events.*;

public abstract class StateMachineBase extends UIBuilder {
    private Container aboutToShowThisContainer;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    /**
    * @deprecated use the version that accepts a resource as an argument instead
    
**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("ComboBox", com.codename1.ui.ComboBox.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("List", com.codename1.ui.List.class);
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            initVars(res);
            return showForm("Main", null);
        } else {
            Form f = (Form)createContainer(resPath, "Main");
            initVars(fetchResourceFile());
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("ComboBox", com.codename1.ui.ComboBox.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("List", com.codename1.ui.List.class);
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "Main");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.codename1.ui.Label findLabelGroupTitle(Component root) {
        return (com.codename1.ui.Label)findByName("labelGroupTitle", root);
    }

    public com.codename1.ui.Label findLabelGroupTitle() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("labelGroupTitle", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("labelGroupTitle", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabelAddress(Component root) {
        return (com.codename1.ui.Label)findByName("LabelAddress", root);
    }

    public com.codename1.ui.Label findLabelAddress() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("LabelAddress", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("LabelAddress", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabelName(Component root) {
        return (com.codename1.ui.Label)findByName("LabelName", root);
    }

    public com.codename1.ui.Label findLabelName() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("LabelName", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("LabelName", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findCntHeader(Component root) {
        return (com.codename1.ui.Container)findByName("cntHeader", root);
    }

    public com.codename1.ui.Container findCntHeader() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("cntHeader", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("cntHeader", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainerMap(Component root) {
        return (com.codename1.ui.Container)findByName("ContainerMap", root);
    }

    public com.codename1.ui.Container findContainerMap() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ContainerMap", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ContainerMap", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainerHeader(Component root) {
        return (com.codename1.ui.Container)findByName("ContainerHeader", root);
    }

    public com.codename1.ui.Container findContainerHeader() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ContainerHeader", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ContainerHeader", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findCntSubstList(Component root) {
        return (com.codename1.ui.Container)findByName("cntSubstList", root);
    }

    public com.codename1.ui.Container findCntSubstList() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("cntSubstList", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("cntSubstList", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabelTitle(Component root) {
        return (com.codename1.ui.Label)findByName("labelTitle", root);
    }

    public com.codename1.ui.Label findLabelTitle() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("labelTitle", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("labelTitle", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabelMap(Component root) {
        return (com.codename1.ui.Label)findByName("LabelMap", root);
    }

    public com.codename1.ui.Label findLabelMap() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("LabelMap", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("LabelMap", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLblLogo(Component root) {
        return (com.codename1.ui.Label)findByName("lblLogo", root);
    }

    public com.codename1.ui.Label findLblLogo() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("lblLogo", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("lblLogo", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabelPhone(Component root) {
        return (com.codename1.ui.Label)findByName("LabelPhone", root);
    }

    public com.codename1.ui.Label findLabelPhone() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("LabelPhone", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("LabelPhone", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findCntFooter(Component root) {
        return (com.codename1.ui.Container)findByName("cntFooter", root);
    }

    public com.codename1.ui.Container findCntFooter() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("cntFooter", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("cntFooter", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtnAbout(Component root) {
        return (com.codename1.ui.Button)findByName("btnAbout", root);
    }

    public com.codename1.ui.Button findBtnAbout() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btnAbout", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btnAbout", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findComboBoxFoodGroupList(Component root) {
        return (com.codename1.ui.ComboBox)findByName("comboBoxFoodGroupList", root);
    }

    public com.codename1.ui.ComboBox findComboBoxFoodGroupList() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("comboBoxFoodGroupList", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("comboBoxFoodGroupList", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabelEmail(Component root) {
        return (com.codename1.ui.Label)findByName("LabelEmail", root);
    }

    public com.codename1.ui.Label findLabelEmail() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("LabelEmail", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("LabelEmail", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainerMapFrame(Component root) {
        return (com.codename1.ui.Container)findByName("ContainerMapFrame", root);
    }

    public com.codename1.ui.Container findContainerMapFrame() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ContainerMapFrame", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ContainerMapFrame", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.List findList(Component root) {
        return (com.codename1.ui.List)findByName("List", root);
    }

    public com.codename1.ui.List findList() {
        com.codename1.ui.List cmp = (com.codename1.ui.List)findByName("List", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.List)findByName("List", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtnExit(Component root) {
        return (com.codename1.ui.Button)findByName("btnExit", root);
    }

    public com.codename1.ui.Button findBtnExit() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btnExit", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btnExit", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabelAddress2(Component root) {
        return (com.codename1.ui.Label)findByName("LabelAddress2", root);
    }

    public com.codename1.ui.Label findLabelAddress2() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("LabelAddress2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("LabelAddress2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainerInfo(Component root) {
        return (com.codename1.ui.Container)findByName("ContainerInfo", root);
    }

    public com.codename1.ui.Container findContainerInfo() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ContainerInfo", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ContainerInfo", aboutToShowThisContainer);
        }
        return cmp;
    }

    protected void exitForm(Form f) {
        if("Splash".equals(f.getName())) {
            exitSplash(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            exitMain(f);
            aboutToShowThisContainer = null;
            return;
        }

    }


    protected void exitSplash(Form f) {
    }


    protected void exitMain(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("Splash".equals(f.getName())) {
            beforeSplash(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            beforeMain(f);
            aboutToShowThisContainer = null;
            return;
        }

    }


    protected void beforeSplash(Form f) {
    }


    protected void beforeMain(Form f) {
    }

    protected void beforeShowContainer(Container c) {
    aboutToShowThisContainer = c;
        if("Splash".equals(c.getName())) {
            beforeContainerSplash(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            beforeContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

    }


    protected void beforeContainerSplash(Container c) {
    }


    protected void beforeContainerMain(Container c) {
    }

    protected void postShow(Form f) {
        if("Splash".equals(f.getName())) {
            postSplash(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            postMain(f);
            aboutToShowThisContainer = null;
            return;
        }

    }


    protected void postSplash(Form f) {
    }


    protected void postMain(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("Splash".equals(c.getName())) {
            postContainerSplash(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            postContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

    }


    protected void postContainerSplash(Container c) {
    }


    protected void postContainerMain(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("Splash".equals(rootName)) {
            onCreateSplash();
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(rootName)) {
            onCreateMain();
            aboutToShowThisContainer = null;
            return;
        }

    }


    protected void onCreateSplash() {
    }


    protected void onCreateMain() {
    }

    protected boolean setListModel(List cmp) {
        String listName = cmp.getName();
        if("comboBoxFoodGroupList".equals(listName)) {
            return initListModelComboBoxFoodGroupList(cmp);
        }
        if("List".equals(listName)) {
            return initListModelList(cmp);
        }
        return super.setListModel(cmp);
    }

    protected boolean initListModelComboBoxFoodGroupList(List cmp) {
        return false;
    }

    protected boolean initListModelList(List cmp) {
        return false;
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        if(c.getParent().getLeadParent() != null) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("Main")) {
            if("btnAbout".equals(c.getName())) {
                onMain_BtnAboutAction(c, event);
                return;
            }
            if("btnExit".equals(c.getName())) {
                onMain_BtnExitAction(c, event);
                return;
            }
            if("List".equals(c.getName())) {
                onMain_ListAction(c, event);
                return;
            }
            if("comboBoxFoodGroupList".equals(c.getName())) {
                onMain_ComboBoxFoodGroupListAction(c, event);
                return;
            }
        }
    }

      protected void onMain_BtnAboutAction(Component c, ActionEvent event) {
      }

      protected void onMain_BtnExitAction(Component c, ActionEvent event) {
      }

      protected void onMain_ListAction(Component c, ActionEvent event) {
      }

      protected void onMain_ComboBoxFoodGroupListAction(Component c, ActionEvent event) {
      }

}
