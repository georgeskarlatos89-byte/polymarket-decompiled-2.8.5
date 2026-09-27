package defpackage;

import bo.app.c;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class oga implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ JSONArray c;

    public /* synthetic */ oga(int i, JSONArray jSONArray, int i2) {
        this.a = i2;
        this.b = i;
        this.c = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        JSONArray jSONArray = this.c;
        int i2 = this.b;
        switch (i) {
            case 0:
                return "Failed to get string for item at index: " + i2 + " and array: " + jSONArray;
            default:
                return c.a(i2, jSONArray);
        }
    }
}
