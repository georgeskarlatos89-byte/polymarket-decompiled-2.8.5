package com.socure.docv.capturesdk.common.utils;

import defpackage.ahh;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020\u00010\u0002j\b\u0012\u0004\u0012\u00020\u0001`\u0003\u001a\u001a\u0010\u0004\u001a\u00020\u0005*\u0012\u0012\u0004\u0012\u00020\u00010\u0002j\b\u0012\u0004\u0012\u00020\u0001`\u0003¨\u0006\u0006"}, d2 = {"getCurrent", "Lcom/socure/docv/capturesdk/common/utils/Screen;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "isComplete", "", "capturesdk_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ScreenKt {
    public static final Screen getCurrent(ArrayList<Screen> arrayList) {
        arrayList.getClass();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Screen screen = arrayList.get(i);
            i++;
            Screen screen2 = screen;
            if (screen2.getState() == State.INCOMPLETE) {
                return screen2;
            }
        }
        ahh.i("Collection contains no element matching the predicate.");
        return null;
    }

    public static final boolean isComplete(ArrayList<Screen> arrayList) {
        arrayList.getClass();
        if (arrayList != null && arrayList.isEmpty()) {
            return true;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Screen screen = arrayList.get(i);
            i++;
            if (screen.getState() == State.INCOMPLETE) {
                return false;
            }
        }
        return true;
    }
}
