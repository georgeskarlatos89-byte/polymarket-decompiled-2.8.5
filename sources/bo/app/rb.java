package bo.app;

import defpackage.b69;
import java.util.ArrayList;
import org.json.JSONArray;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class rb implements aa {
    public static final String b = b69.s(rb.class);
    public final ArrayList a;

    public rb(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.yj9
    public final JSONArray forJsonPut() {
        JSONArray jSONArray = new JSONArray();
        try {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                jSONArray.put(((aa) obj).forJsonPut());
            }
            return jSONArray;
        } catch (Exception e) {
            b69.r(b, "Caught exception creating Json.", e);
            return jSONArray;
        }
    }

    @Override // defpackage.yj9
    public final /* bridge */ /* synthetic */ Object forJsonPut() {
        return forJsonPut();
    }
}
