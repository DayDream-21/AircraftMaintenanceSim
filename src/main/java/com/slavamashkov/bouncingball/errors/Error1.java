package com.slavamashkov.bouncingball.errors;

import com.slavamashkov.bouncingball.enums.Color;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Error1 implements Error {
    public Map<String, List<ErrorParameter>> parameters = new HashMap<>();

    public Error1() {
        List<ErrorParameter> leftMainBusDCList = List.of(
                new ErrorParameter("stroke", Color.WARNING_COLOR.hexCode)
        );

        List<ErrorParameter> rightEmrgBusDC = List.of(
                new ErrorParameter("stroke", Color.WARNING_COLOR.hexCode)
        );

        parameters.put("leftMainBusDC", leftMainBusDCList);
        parameters.put("rightEmrgBusDC", rightEmrgBusDC);
    }

    @Override
    public String toString() {
        return "Error 1";
    }
}
