package javaProjectTemplate.uiData;

import java.util.Map;

import base_UI_Objects.windowUI.base.IUIManagerOwner;
import base_UI_Objects.windowUI.uiData.UIDataUpdater;

public class projWindow1UIData extends UIDataUpdater {

    public projWindow1UIData(IUIManagerOwner _owner) {
        super(_owner);
    }

    public projWindow1UIData(IUIManagerOwner _owner, Map<Integer, Integer> _iVals, Map<Integer, Float> _fVals,
            Map<Integer, Boolean> _bVals) {
        super(_owner, _iVals, _fVals, _bVals);
    }

    public projWindow1UIData(UIDataUpdater _otr) {
        super(_otr);
    }

}//class projWindow1UIData
