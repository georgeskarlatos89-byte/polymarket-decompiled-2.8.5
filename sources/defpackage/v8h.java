package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class v8h implements t8h {
    @Override // defpackage.t8h
    public final wpf a(Context context) {
        ofc ofcVar = new ofc(context);
        wu7 wu7Var = (wu7) ofcVar.f;
        yo5 yo5Var = w8h.b;
        Unit unit = Unit.INSTANCE;
        LinkedHashMap linkedHashMap = wu7Var.a;
        if (unit != null) {
            linkedHashMap.put(yo5Var, unit);
        } else {
            linkedHashMap.remove(yo5Var);
        }
        return ofcVar.z();
    }
}
