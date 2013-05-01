/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userclasses.model;

import com.codename1.ui.list.DefaultListModel;

/**
 *
 * @author Danilo
 */
public final class FoodGroupClass {
    
    private String name;
    private String icon;

    public static final int MILK_INDEX = 0;
    public static final int FRUIT_INDEX = 1;
    public static final int DRIED_FRUIT_INDEX = 2;
    public static final int VEGETABLE_A_INDEX = 3;
    public static final int VEGETABLE_B_INDEX = 4;
    public static final int CEREAL_INDEX = 5;
    public static final int LEGUM_INDEX = 6;
    public static final int MEAT_1_INDEX = 7;
    public static final int MEAT_2_INDEX = 8;
    public static final int MEAT_3_INDEX = 9;
    public static final int MEAT_4_INDEX = 10;
    public static final int EGG_INDEX = 11;
    
    static final FoodGroupClass MILK_LABEL = new FoodGroupClass("Leite e Derivados", "grupoLeite_icon.png");
    static final FoodGroupClass FRUIT_LABEL = new FoodGroupClass("Frutas", "grupoFrutas_icon.png");
    static final FoodGroupClass DRIED_FRUIT_LABEL = new FoodGroupClass("Frutas Secas", "grupoFrutas_icon.png");
    static final FoodGroupClass VEGETABLE_A_LABEL = new FoodGroupClass("Vegetais A - Crus", "grupoVegetais_icon.png");
    static final FoodGroupClass VEGETABLE_B_LABEL = new FoodGroupClass("Vegetais B - Cozidos/Refogados", "grupoVegetais_icon.png");
    static final FoodGroupClass CEREAL_LABEL = new FoodGroupClass("Cereais, Pães, Massas e Tubérculos", "grupoCereais_icon.png");
    static final FoodGroupClass LEGUM_LABEL = new FoodGroupClass("Leguminosas", "grupoVegetais_icon.png");
    static final FoodGroupClass MEAT_1_LABEL = new FoodGroupClass("Carnes (Bovina)", "grupoCarnes_icon.png");
    static final FoodGroupClass MEAT_2_LABEL = new FoodGroupClass("Carnes (Aves)", "grupoCarnes_icon.png");
    static final FoodGroupClass MEAT_3_LABEL = new FoodGroupClass("Carnes (Suína/Ovina)", "grupoCarnes_icon.png");
    static final FoodGroupClass MEAT_4_LABEL = new FoodGroupClass("Carnes (Frutos do Mar)", "grupoCarnes_icon.png");
    static final FoodGroupClass EGG_LABEL = new FoodGroupClass("Ovos", "grupoCarnes_icon.png");

    public static final DefaultListModel FOOD_GROUP_LIST_MODEL = new DefaultListModel(new FoodGroupClass[]{
        MILK_LABEL, FRUIT_LABEL, DRIED_FRUIT_LABEL, VEGETABLE_A_LABEL, VEGETABLE_B_LABEL, CEREAL_LABEL,
        LEGUM_LABEL, MEAT_1_LABEL, MEAT_2_LABEL, MEAT_3_LABEL, MEAT_4_LABEL, EGG_LABEL});
    
    public static final DefaultListModel CEREAL_LIST = new DefaultListModel(new FoodInfoClass[]{
        FoodInfoClass.C1, FoodInfoClass.C2, FoodInfoClass.C3, FoodInfoClass.C4, FoodInfoClass.C5,
        FoodInfoClass.C6, FoodInfoClass.C7, FoodInfoClass.C8, FoodInfoClass.C9, FoodInfoClass.C10,
        FoodInfoClass.C1, FoodInfoClass.C12, FoodInfoClass.C13, FoodInfoClass.C14, FoodInfoClass.C15,
        FoodInfoClass.C16, FoodInfoClass.C17, FoodInfoClass.C18, FoodInfoClass.C19, FoodInfoClass.C20,
        FoodInfoClass.C21, FoodInfoClass.C22, FoodInfoClass.C23, FoodInfoClass.C24, FoodInfoClass.C25,
        FoodInfoClass.C26, FoodInfoClass.C27, FoodInfoClass.C28, FoodInfoClass.C29, FoodInfoClass.C30,
        FoodInfoClass.C31, FoodInfoClass.C32, FoodInfoClass.C33, FoodInfoClass.C34, FoodInfoClass.C35,
        FoodInfoClass.C36, FoodInfoClass.C37, FoodInfoClass.C38, FoodInfoClass.C39, FoodInfoClass.C40,
        FoodInfoClass.C41, FoodInfoClass.C42, FoodInfoClass.C43, FoodInfoClass.C44, FoodInfoClass.C45});
    
    public static final DefaultListModel FRUIT_LIST = new DefaultListModel(new FoodInfoClass[]{
        FoodInfoClass.F1, FoodInfoClass.F2, FoodInfoClass.F3, FoodInfoClass.F4, FoodInfoClass.F5,
        FoodInfoClass.F6, FoodInfoClass.F7, FoodInfoClass.F8, FoodInfoClass.F9, FoodInfoClass.F10,
        FoodInfoClass.F1, FoodInfoClass.F12, FoodInfoClass.F13, FoodInfoClass.F14, FoodInfoClass.F15,
        FoodInfoClass.F16, FoodInfoClass.F17, FoodInfoClass.F18, FoodInfoClass.F19, FoodInfoClass.F20,
        FoodInfoClass.F21, FoodInfoClass.F22, FoodInfoClass.F23, FoodInfoClass.F24, FoodInfoClass.F25,
        FoodInfoClass.F26, FoodInfoClass.F27, FoodInfoClass.F28, FoodInfoClass.F29, FoodInfoClass.F30,
        FoodInfoClass.F31, FoodInfoClass.F32, FoodInfoClass.F33, FoodInfoClass.F34, FoodInfoClass.F35,
        FoodInfoClass.F36, FoodInfoClass.F37, FoodInfoClass.F38, FoodInfoClass.F39, FoodInfoClass.F40,
        FoodInfoClass.F41, FoodInfoClass.F42});
    
    public static final DefaultListModel DRIED_FRUIT_LIST = new DefaultListModel(new FoodInfoClass[]{
        FoodInfoClass.DF1, FoodInfoClass.DF2, FoodInfoClass.DF3, FoodInfoClass.DF4});
    
    public static final DefaultListModel MILK_LIST = new DefaultListModel(new FoodInfoClass[]{
        FoodInfoClass.M1, FoodInfoClass.M2, FoodInfoClass.M3, FoodInfoClass.M4, FoodInfoClass.M5,
        FoodInfoClass.M6, FoodInfoClass.M7, FoodInfoClass.M8, FoodInfoClass.M9, FoodInfoClass.M10,
        FoodInfoClass.M11, FoodInfoClass.M12, FoodInfoClass.M13, FoodInfoClass.M14, FoodInfoClass.M15,
        FoodInfoClass.M16, FoodInfoClass.M17, FoodInfoClass.M18, FoodInfoClass.M19, FoodInfoClass.M20,
        FoodInfoClass.M21, FoodInfoClass.M22, FoodInfoClass.M23, FoodInfoClass.M24, FoodInfoClass.M25,
        FoodInfoClass.M26, FoodInfoClass.M27, FoodInfoClass.M28});
    
    public static final DefaultListModel VEGETABLE_A_LIST = new DefaultListModel(new FoodInfoClass[]{
        FoodInfoClass.VA1, FoodInfoClass.VA2, FoodInfoClass.VA3, FoodInfoClass.VA4, FoodInfoClass.VA5,
        FoodInfoClass.VA6, FoodInfoClass.VA7, FoodInfoClass.VA8, FoodInfoClass.VA9, FoodInfoClass.VA10,
        FoodInfoClass.VA11, FoodInfoClass.VA12, FoodInfoClass.VA13, FoodInfoClass.VA14, FoodInfoClass.VA15,
        FoodInfoClass.VA16, FoodInfoClass.VA17, FoodInfoClass.VA18, FoodInfoClass.VA19, FoodInfoClass.VA20,
        FoodInfoClass.VA22, FoodInfoClass.VA23, FoodInfoClass.VA24});
    
    public static final DefaultListModel VEGETABLE_B_LIST = new DefaultListModel(new FoodInfoClass[]{
        FoodInfoClass.VB1, FoodInfoClass.VB2, FoodInfoClass.VB3, FoodInfoClass.VB4, FoodInfoClass.VB5,
        FoodInfoClass.VB6, FoodInfoClass.VB7, FoodInfoClass.VB8, FoodInfoClass.VB9, FoodInfoClass.VB10,
        FoodInfoClass.VB11, FoodInfoClass.VB12, FoodInfoClass.VB13, FoodInfoClass.VB14, FoodInfoClass.VB15,
        FoodInfoClass.VB16, FoodInfoClass.VB17, FoodInfoClass.VB18, FoodInfoClass.VB19, FoodInfoClass.VB20,
        FoodInfoClass.VB22, FoodInfoClass.VB23});
    
    public static final DefaultListModel LEGUM_LIST = new DefaultListModel(new FoodInfoClass[]{
        FoodInfoClass.L1, FoodInfoClass.L2, FoodInfoClass.L3, FoodInfoClass.L4, FoodInfoClass.L5,
        FoodInfoClass.L6, FoodInfoClass.L7, FoodInfoClass.L8, FoodInfoClass.L9, FoodInfoClass.L10,
        FoodInfoClass.L11, FoodInfoClass.L12, FoodInfoClass.L13, FoodInfoClass.L14, FoodInfoClass.L15,
        FoodInfoClass.L16});
    
    public static final DefaultListModel MEAT_1_LIST = new DefaultListModel(new FoodInfoClass[]{
        FoodInfoClass.MT1, FoodInfoClass.MT2, FoodInfoClass.MT3, FoodInfoClass.MT4, FoodInfoClass.MT5,
        FoodInfoClass.MT6});
        
    public static final DefaultListModel MEAT_2_LIST = new DefaultListModel(new FoodInfoClass[]{
        FoodInfoClass.WMT1, FoodInfoClass.WMT2, FoodInfoClass.WMT3, FoodInfoClass.WMT4, FoodInfoClass.WMT5,
        FoodInfoClass.WMT6, FoodInfoClass.WMT7, FoodInfoClass.WMT8, FoodInfoClass.WMT9});
        
    public static final DefaultListModel MEAT_3_LIST = new DefaultListModel(new FoodInfoClass[]{
        FoodInfoClass.PMT1, FoodInfoClass.PMT2, FoodInfoClass.PMT3});
        
    public static final DefaultListModel MEAT_4_LIST = new DefaultListModel(new FoodInfoClass[]{
        FoodInfoClass.SMT1, FoodInfoClass.SMT2, FoodInfoClass.SMT3, FoodInfoClass.SMT4, FoodInfoClass.SMT5,
        FoodInfoClass.SMT6, FoodInfoClass.SMT7, FoodInfoClass.SMT8, FoodInfoClass.SMT9, FoodInfoClass.SMT10,
        FoodInfoClass.SMT11, FoodInfoClass.SMT12, FoodInfoClass.SMT13, FoodInfoClass.SMT14, FoodInfoClass.SMT15});
        
    public static final DefaultListModel EGG_LIST = new DefaultListModel(new FoodInfoClass[]{
        FoodInfoClass.EGG1, FoodInfoClass.EGG2, FoodInfoClass.EGG3, FoodInfoClass.EGG4});
    
    public FoodGroupClass(String name, String icon) {
        this.name = name;
        this.icon = icon;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon the icon to set
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }
    
}
