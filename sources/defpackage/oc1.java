package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class oc1 {
    public static final nc1 b = new nc1("00", "Stripe Test Bank");
    public final ArrayList a;

    public oc1(Context context) {
        String next = new Scanner(context.getResources().getAssets().open("au_becs_bsb.json")).useDelimiter("\\A").next();
        next.getClass();
        Map b2 = psl.b(new JSONObject(next));
        if (b2 == null) {
            b2 = zc7.a;
            b2.getClass();
        }
        ArrayList arrayList = new ArrayList(b2.size());
        for (Map.Entry entry : b2.entrySet()) {
            arrayList.add(new nc1((String) entry.getKey(), String.valueOf(entry.getValue())));
        }
        this.a = arrayList;
    }
}
