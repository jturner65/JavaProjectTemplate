package javaProjectTemplate.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import base_Math_Objects.vectorObjs.doubles.myPoint;
import base_Math_Objects.vectorObjs.doubles.myVector;
import base_Render_Interface.IGraphicsAppInterface;
import base_UI_Objects.GUI_AppManager;
import base_UI_Objects.baseApp.GUI_AppUIFlags;
import base_UI_Objects.windowUI.base.Base_DispWindow;
import base_UI_Objects.windowUI.base.GUI_AppWinVals;
import base_UI_Objects.windowUI.drawnTrajectories.DrawnSimpleTraj;
import base_UI_Objects.windowUI.uiData.UIDataUpdater;
import base_UI_Objects.windowUI.uiObjs.base.GUIObj_Params;
import javaProjectTemplate.uiData.projWindow1UIData;

public class projWindow1 extends Base_DispWindow {
    //for debug button
    protected static final int numBasePrivFlags = 1;

    public projWindow1(IGraphicsAppInterface _p, GUI_AppManager _AppMgr, int _winIdx) {
        super(_p, _AppMgr, _winIdx);
    }

    @Override
    public int getTotalNumOfPrivBools() {
        // TODO Auto-generated method stub
        return numBasePrivFlags;
    }

    @Override
    protected void initMe() {

    }
    /**
     * This function implements the instantiation of a child window owned by this window, if such exists.
     * The implementation should be similar to how the main windows are implemented in GUI_AppManager::initAllDispWindows.
     * If no child window exists, this implementation of this function can be empty
     * 
     * @param GUI_AppWinVals the window control values for the child window.
     */
    @Override
    protected final void buildAndSetChildWindow_Indiv(GUI_AppWinVals _appVals) {} 
    
    @Override
    protected void initDispFlags(GUI_AppUIFlags appUIFlags) {
        // TODO Auto-generated method stub

    }

    @Override
    protected UIDataUpdater buildUIDataUpdateObject() {
        return new projWindow1UIData(this);
    }

    @Override
    protected void setupGUIObjsAras(LinkedHashMap<String, GUIObj_Params> tmpUIObjMap) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void setupGUIBoolSwitchAras(int firstIdx, LinkedHashMap<String, GUIObj_Params> tmpUIBoolSwitchObjMap) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void updateCalcObjUIVals() {
        // TODO Auto-generated method stub

    }

    @Override
    protected void initDrwnTraj_Indiv() {
        // TODO Auto-generated method stub

    }

    @Override
    protected void setVisScreenDimsPriv() {
        // TODO Auto-generated method stub

    }

    @Override
    protected void handleDispFlagsDebugMode_Indiv(boolean val) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void handlePrivFlagsDebugMode_Indiv(boolean val) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void handlePrivFlags_Indiv(int idx, boolean val, boolean oldVal) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void closeMe() {
        // TODO Auto-generated method stub

    }

    @Override
    protected void showMe() {
        // TODO Auto-generated method stub

    }

    @Override
    protected int[] getFlagIDXsToInitToTrue() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected void resizeMe(float scale) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void setUI_IntValsCustom(int UIidx, int ival, int oldVal) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void setUI_FloatValsCustom(int UIidx, float val, float oldVal) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void setCamera_Indiv(float[] camVals) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void drawCustMenuObjs(float animTimeMod, boolean isGlblAppDebug) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void drawOnScreenStuffPriv(float modAmtMillis, boolean isGlblAppDebug) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void drawRightSideInfoBarPriv(float modAmtMillis, boolean isGlblAppDebug) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void drawMe(float animTimeMod, boolean isGlblAppDebug) {
        // TODO Auto-generated method stub

    }

    @Override
    protected boolean simMe(float modAmtSec) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    protected void stopMe() {
        // TODO Auto-generated method stub

    }

    @Override
    protected myPoint getMsePtAs3DPt(myPoint mseLoc) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected boolean hndlMouseClick_Indiv(int mouseX, int mouseY, myPoint mseClckInWorld, int mseBtn) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    protected boolean hndlMouseMove_Indiv(int mouseX, int mouseY, myPoint mseClckInWorld) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    protected boolean handleMouseWheel_Indiv(int ticks, float mult) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    protected boolean hndlMouseDrag_Indiv(int mouseX, int mouseY, int pmouseX, int pmouseY, myPoint mouseClickIn3D,
            myVector mseDragInWorld, int mseBtn) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void handleSideMenuMseOvrDispSel(int btn, boolean val) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void hndlMouseRel_Indiv() {
        // TODO Auto-generated method stub

    }

    @Override
    protected void endAltKey_Indiv() {
        // TODO Auto-generated method stub

    }

    @Override
    protected void endCntlKey_Indiv() {
        // TODO Auto-generated method stub

    }

    @Override
    protected void endShiftKey_Indiv() {
        // TODO Auto-generated method stub

    }

    @Override
    protected void handleSideMenuDebugSelEnable(int btn) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void handleSideMenuDebugSelDisable(int btn) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void launchMenuBtnHndlr(int funcRow, int btn, String label) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void snapMouseLocs(int oldMouseX, int oldMouseY, int[] newMouseLoc) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void setCustMenuBtnLabels() {
        // TODO Auto-generated method stub

    }

    @Override
    public void processTraj_Indiv(DrawnSimpleTraj drawnTraj) {
        // TODO Auto-generated method stub

    }

    @Override
    public void hndlFileLoad(File file, String[] vals, int[] stIdx) {
        // TODO Auto-generated method stub

    }

    @Override
    protected String[] getSaveFileDirNamesPriv() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ArrayList<String> hndlFileSave(File file) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected void addSScrToWin_Indiv(int newWinKey) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void addTrajToScr_Indiv(int subScrKey, String newTrajKey) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void delSScrToWin_Indiv(int idx) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void delTrajToScr_Indiv(int subScrKey, String newTrajKey) {
        // TODO Auto-generated method stub

    }

}
