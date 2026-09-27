package io.intercom.android.sdk.blocks.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class TextSplittingStrategy {
    private static final String NEW_LINE = "\n";
    private static final String NEW_LINE_REPLACEMENT = "<br>";
    private static final String NEW_PARAGRAPH_DELIMETER = "\n\n";

    public List<String> apply(String str) {
        String[] split = str.split(NEW_PARAGRAPH_DELIMETER);
        for (int i = 0; i < split.length; i++) {
            split[i] = split[i].replace(NEW_LINE, NEW_LINE_REPLACEMENT);
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(split));
        arrayList.removeAll(Collections.singleton(""));
        return arrayList;
    }
}
