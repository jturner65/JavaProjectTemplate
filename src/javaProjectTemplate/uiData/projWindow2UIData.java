package javaProjectTemplate.uiData;

import java.util.Map;

import base_UI_Objects.windowUI.base.IUIManagerOwner;
import base_UI_Objects.windowUI.uiData.UIDataUpdater;

public class projWindow2UIData extends UIDataUpdater {
    
    public projWindow2UIData(IUIManagerOwner _owner) {
        super(_owner);
    }

    public projWindow2UIData(IUIManagerOwner _owner, Map<Integer, Integer> _iVals, Map<Integer, Float> _fVals,
            Map<Integer, Boolean> _bVals) {
        super(_owner, _iVals, _fVals, _bVals);
    }

    public projWindow2UIData(UIDataUpdater _otr) {
        super(_otr);
    }
}//class projWindow2UIData
