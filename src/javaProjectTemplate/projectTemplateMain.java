package javaProjectTemplate;

import java.util.HashMap;

import base_UI_Objects.GUI_AppManager;
import base_Utils_Objects.io.messaging.MsgCodes;
import javaProjectTemplate.ui.projWindow1;
import javaProjectTemplate.ui.projWindow2;

/**
 * Template for a java graphics-based simulation project
 */
public class projectTemplateMain extends GUI_AppManager {
    //project-specific string variables
    private final String prjNmLong = "Graphics/Simulation Project Template";
    private final String prjNmShrt = "ProjTemplate";
    private final String projDesc = "Project template for Java graphics-based simulation projects";
    
    /**
     * use sphere background for this program
     */
    private boolean useSphereBKGnd = true;
    /**
     * File name for background sphere/skybox
     */
    private final String bkSkyBox = "bkgrndTex.jpg";
    /**
     * Background color if no skybox is used
     */
    private final int[] bkgGndClr = new int[]{244,244,255,255};
    
    /**
     * size of 3d grid cube side
     */
    private final int GridDim_3D = 1500;
        
    /**
     * idx's in dispWinFrames for each window - 0 is always left side menu window
     * Side menu is dispMenuIDX == 0
     */
    private static final int 
            dispWindow1IDX = 1,
            dispWindow2IDX = 2;
            //add more if needed
    /**
     * # of visible windows including side menu (always at least 1 for side menu)
     */
    private static final int numVisWins = 3;
    
    
    //////////////////////////////////////////////// code
    public static void main(String[] passedArgs) {
        projectTemplateMain me = new projectTemplateMain();
        projectTemplateMain.invokeProcessingMain(me, passedArgs);
    }
    /**
     * Constructor - pass through to GUI_AppManager
     */
    protected projectTemplateMain() {super();}    
    /**
     * Whether or not we should show the machine data on launch
     * @return
     */
    @Override
    protected boolean showMachineData() {        return true;   }   
    /**
     * whether or not we want to restrict window size on widescreen monitors
     * 
     * @return 0 - use monitor size regardless
     *             1 - use smaller dim to be determine window 
     *             2+ - TBD
     */
    @Override
    protected int setAppWindowDimRestrictions() {    return 1;}   
    
    @Override
    protected boolean hideAppFlag_DebugMode() {             return false;}
    @Override
    protected boolean hideAppFlag_SaveAnim() {              return false;}
    @Override
    protected boolean hideAppFlag_RunSim() {                return false;}
    @Override
    protected boolean hideAppFlag_SingleStep() {            return false;}
    @Override
    protected boolean hideAppFlag_showRtSideInfoDisp() {    return false;}
    @Override
    protected boolean hideAppFlag_showStatusBar() {         return false;}
    @Override
    protected boolean hideAppFlag_showCanvas() {            return false;}  
    /**
     * Set various or modify relevant runtime arguments in argsMap
     * @param _passedArgs command-line arguments
     */
    @Override
    protected HashMap<String,Object> setRuntimeArgsVals(HashMap<String, Object> _passedArgsMap) {      return  _passedArgsMap;  }
    /**
     * Called in pre-draw initial setup, before first init
     * potentially override setup variables on per-project basis.
     * Do not use for setting background color or Skybox anymore.
     *      (Current settings in ProcessingRenderer)     
     *      strokeCap(PROJECT);
     *      textSize(txtSz);
     *      textureMode(NORMAL);            
     *      rectMode(CORNER);    
     *      sphereDetail(4);     * 
     */
    @Override
    protected void setupAppDims_Indiv() {
        //modify default grid dims to be 1500x1500x1500
        setDesired3DGridDims(GridDim_3D);        
    }
    /**
     * this is called to build all the Base_DispWindows in the instancing class
     */
    @Override
    protected void initAllDispWindows() {
        // each window title and description goes here - leave idx 0 blank
        String[] _winTitles = new String[]{"","Window 1","Window 2"},
                _winDescr = new String[]{"", "Desc for Window 1","Desc for Window 2"};
        //instanced window dims when open and closed - only showing 1 open at a time - and init cam vals
        float[][] _floatDims  = getDefaultWinAndCameraDims();    

        //Builds sidebar menu button config
        //application-wide menu button bar titles and button names
        String[] menuBtnTitles = new String[]{"Functions 1","Functions 2","Functions 3"};
        String[][] menuBtnNames = new String[][] { // each must have literals for every button defined in side bar menu, or ignored
            {"Func 00", "Func 01", "Func 02"},                //row 1
            {"Func 10", "Func 11", "Func 12", "Func 13"},    //row 2
            {"Func 10", "Func 11", "Func 12", "Func 13"}    //row 3
            };
        String [] dbgBtns = {"Debug 0", "Debug 1", "Debug 2", "Debug 3","Debug 4"};
        buildSideBarMenu(_winTitles, menuBtnTitles, menuBtnNames, dbgBtns, true, false);
        
        //specify windows that cannot be shown simultaneously here
        initXORWins(new int[]{dispWindow1IDX, dispWindow2IDX}, new int[]{dispWindow1IDX, dispWindow2IDX});
        
        //define windows
        /**
         *  _winIdx The index in the various window-descriptor arrays for the dispWindow being set
         *  _title string title of this window
         *  _descr string description of this window
         *  _dispFlags Essential flags describing the nature of the dispWindow for idxs : 
         *         0 : dispWinIs3d, 
         *         1 : canDrawInWin; 
         *         2 : canShow3dbox (only supported for 3D); 
         *         3 : canMoveView
         *  _floatVals an array holding float arrays for 
         *                 rectDimOpen(idx 0),
         *                 rectDimClosed(idx 1),
         *                 initCameraVals(idx 2)
         *  _intClrVals and array holding int arrays for
         *                 winFillClr (idx 0),
         *                 winStrkClr (idx 1),
         *                 winTrajFillClr(idx 2),
         *                 winTrajStrkClr(idx 3),
         *                 rtSideFillClr(idx 4),
         *                 rtSideStrkClr(idx 5)
         *  _sceneCenterVal center of scene, for drawing objects (optional)
         *  _initSceneFocusVal initial focus target for camera (optional)
         */
        int wIdx = dispWindow1IDX;
        //setInitDispWinVals(wIdx, _dimOpen, _dimClosed,new boolean[]{false,true,true,true}, new int[]{255,255,255,255},new int[]{0,0,0,255},new int[]{180,180,180,255},new int[]{100,100,100,255}); 
        setInitDispWinVals(wIdx, _winTitles[wIdx], _winDescr[wIdx], getDfltBoolAra(true), _floatDims,        
                new int[][] {new int[]{255,255,255,255},new int[]{255,255,255,255},
                    new int[]{180,180,180,255},new int[]{100,100,100,255},
                    new int[]{0,0,0,200},new int[]{255,255,255,255}});        
        setDispWindow(wIdx, new projWindow1(ri, this, wIdx));
        
        wIdx = dispWindow2IDX;
        //setInitDispWinVals(wIdx, _dimOpen, _dimClosed,new boolean[]{false,false,true,false}, new int[]{50,40,20,255}, new int[]{255,255,255,255},new int[]{180,180,180,255},new int[]{100,100,100,255});
        setInitDispWinVals(wIdx, _winTitles[wIdx], _winDescr[wIdx], getDfltBoolAra(false), _floatDims,
                new int[][] {new int[]{50,40,20,255}, new int[]{255,255,255,255},
                    new int[]{180,180,180,255}, new int[]{100,100,100,255},
                    new int[]{0,0,0,200},new int[]{255,255,255,255}});        
       setDispWindow(wIdx, new projWindow2(ri, this, wIdx));
 
    }//initAllDispWindows
    
    /**
     * Map indexed by window ID, holding an array of the titles (idx 0) and descriptions (idx 1) for every sub window
     * return null if none exist, and only put an entry in the map if one exists for that window
     * @return
     */
    @Override
    protected final HashMap<Integer, String[]> getSubWindowTitles(){ 
        HashMap<Integer, String[]> res = new HashMap<Integer, String[]>();
        //make 2nd window have a child window
        res.put(dispWindow2IDX, new String[] {"Child window of", "Window holds dependent code subordinate to"});
        
        return res;}
    
    /**
     * Application-specific 1-time init. Specify which window to start on, whether to show status bar, etc.
     */
    @Override
    protected void initOnce_Indiv() {
        setWinVisFlag(dispWindow1IDX, true);
    }
    
    /**
     * Called after app is built and every time program is re-initialized, after each window gets reset
     */
    @Override
    protected void initProgram_Indiv() { }
    
    //////////////////////////////////////////
    /// graphics and base functionality utilities and variables
    //////////////////////////////////////////

    /**
     * Individual extending Application Manager post-drawMe functions
     * @param modAmtMillis
     * @param is3DDraw
     */
    @Override
    protected void drawMePost_Indiv(float modAmtMillis, boolean is3dDraw, boolean isGlblAppDebug) {}

    @Override
    protected void handleKeyPress(char key, int keyCode) {
        switch (key){
        case '1' : {break;}
        case '2' : {break;}
        case '3' : {break;}
        case '4' : {break;}
        case '5' : {break;}                            
        case '6' : {break;}
        case '7' : {break;}
        case '8' : {break;}
        case '9' : {break;}
        case '0' : { break;}
        case ' ' : {toggleSimIsRunning(); break;}                            //run sim
        case 'f' : {getCurFocusDispWindow().setInitCamView();break;}//reset camera
        //more key cases here
        default :{}
        }
    }//handleKeyPress
    @Override
    public boolean isClickModUIVal() {
        //TODO change this to manage other key settings for situations where multiple simultaneous key presses are not optimal or convenient
        return altIsPressed() || shiftIsPressed();        
    }

    //////////////////////////////////////////    
    /**
     * return a list of labels to apply to mse-over display select buttons - an empty or null list will not display option
     * @return
     */
    @Override
    public String[] getMouseOverSelBtnLabels() {return new String[0];    }
    /**
     * get the ui rect values of the "master" ui region (another window) -> this is so ui objects of one window can be made, clicked, and shown displaced from those of the parent window
     * @param idx
     * @return
     */  
    @Override
    protected float[] getUIRectVals_Indiv(int idx, float[] menuRectVals) {
        switch(idx){
            case dispWindow1IDX         : {return menuRectVals;}
            case dispWindow2IDX         : {return menuRectVals;}
            default :  return menuRectVals;
        }
    }
    
    /**
     * Address flag-setting here for switching windows, so that if any special cases need to be addressed they can be.
     * only process visibility-related state changes here (should only be the switch statement
     * @param idx
     * @param val
     */
    @Override
    protected void setVisFlag_Indiv(int idx, boolean val) {
        switch (idx){
            case dispWindow1IDX        : {setWinFlagsXOR(dispWindow1IDX, val); break;}
            case dispWindow2IDX        : {setWinFlagsXOR(dispWindow2IDX, val); break;}
            default : {break;}
        }
    }

    

    /**
     * Set minimum level of message object console messages to display for this application. If null then all messages displayed
     * @return
     */
    @Override
    protected final MsgCodes getMinConsoleMsgCodes() {  return null;}
    /**
     * Set minimum level of message object log messages to save to log for this application. If null then all messages saved to log.
     * @return
     */
    @Override
    protected final MsgCodes getMinLogMsgCodes() {      return null;}
    @Override
    public void setSmoothing() {                        ri.setSmoothing(0);}
    
    ////////////////////////////////////////////////////////////////////////////////////
    /// Common functions - these should never have to be changed or modified regardless
    /// of application  
    @Override
    public int getNumVisFlags() {                       return numVisWins;}   
    @Override
    public String getPrjNmShrt() {                      return prjNmShrt;}
    @Override
    public String getPrjNmLong() {                      return prjNmLong;}
    @Override
    public String getPrjDescr() {                       return projDesc;}
    @Override
    protected boolean getUseSkyboxBKGnd(int winIdx) {    return useSphereBKGnd;}
    @Override
    protected String getSkyboxFilename(int winIdx) {    return bkSkyBox;}
    @Override
    protected int[] getBackgroundColor(int winIdx) {    return bkgGndClr;}
    @Override
    protected int getNumDispWindows() {                 return numVisWins;}


}
