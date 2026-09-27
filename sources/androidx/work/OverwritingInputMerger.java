package androidx.work;

import defpackage.bo5;
import defpackage.nhk;
import defpackage.py9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/OverwritingInputMerger;", "Lpy9;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OverwritingInputMerger extends py9 {
    @Override // defpackage.py9
    public final bo5 a(ArrayList arrayList) {
        nhk nhkVar = new nhk(26);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map unmodifiableMap = Collections.unmodifiableMap(((bo5) it.next()).a);
            unmodifiableMap.getClass();
            linkedHashMap.putAll(unmodifiableMap);
        }
        nhkVar.t(linkedHashMap);
        return nhkVar.i();
    }
}
